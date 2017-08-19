package com.fengfan.action.payrecord;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.AbstractSearchCondition;
import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.toll.TollAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Customer;
import com.fengfan.model.PayRecord;
import com.fengfan.model.Provider;
import com.fengfan.model.Toll;
import com.fengfan.model.enums.PayType;
import com.fengfan.model.enums.YesNoRadio;
import com.fengfan.service.ICustomerService;
import com.fengfan.service.IPayRecordService;
import com.fengfan.service.ISearchService;
import com.fengfan.service.ITollService;

public class PayRecordAction extends BaseAction {

	public static final Logger logger = Logger.getLogger(TollAction.class);

	private static final String PreBilling = "2"; // 预付费包月/季/年
	private static final String MonthlyBilling = "3";// 预付费包月封顶
	private static final String CardBilling = "4";// 预付费卡用户

	private List<Toll> tolls = null;
	private PayRecord payRecord;
	private YesNoRadio[] yesNoRadio = YesNoRadio.values();
	private PayType[] payType = PayType.values();

	protected IPayRecordService payRecordService;
	protected ITollService tollService;
	protected ICustomerService customerService;

	public ICustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	public ITollService getTollService() {
		return tollService;
	}

	public void setTollService(ITollService tollService) {
		this.tollService = tollService;
	}

	public YesNoRadio[] getYesNoRadio() {
		return yesNoRadio;
	}

	public PayType[] getPayType() {
		return payType;
	}

	public PayRecord getPayRecord() {
		return payRecord;// == null ? (payRecord = new PayRecord()) : payRecord;
	}

	public void setPayRecord(PayRecord payRecord) {
		this.payRecord = payRecord;
	}

	private PayRecordSearchCondition searchCondition = new PayRecordSearchCondition();

	public PayRecordSearchCondition getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(PayRecordSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}

	public IPayRecordService getPayRecordService() {
		return payRecordService;
	}

	public void setPayRecordService(IPayRecordService payRecordService) {
		this.payRecordService = payRecordService;
	}

	public List<Toll> getTolls() {
		return tolls == null ? (tolls = tollService.listToll()) : tolls;
	}

	@Override
	public ISearchService getSearchService() {
		return payRecordService;
	}

	public String list() throws Exception {
		search();
		// 计算tatalAmount汇总信息

		HttpServletRequest request = ServletActionContext.getRequest();
		int pageSize = getPageSize(request);
		int currentPage = getCurrentPage(request);
		ISearchCondition searchCondition = getSearchCondition();
		if (getCurrentProviderId() != null && searchCondition != null
				&& searchCondition instanceof AbstractSearchCondition) {
			AbstractSearchCondition asc = (AbstractSearchCondition) searchCondition;
			asc.setProviderId(getCurrentProviderId());
		}
		String sumString = payRecordService.getSumofTotalAmount(
				searchCondition, pageSize, currentPage);
		ServletActionContext.getRequest().setAttribute("Sum",
				sumString.split(":")[0]);
		ServletActionContext.getRequest().setAttribute("PageSum",
				sumString.split(":")[1]);

		ServletActionContext.getRequest().setAttribute("providerId",
				this.searchCondition.getProviderId());
		ServletActionContext.getRequest().setAttribute("startDate",
				this.searchCondition.getStartDate());
		ServletActionContext.getRequest().setAttribute("endDate",
				this.searchCondition.getEndDate());

		return "list";
	}

	private void handleAutoInputFields() {
		String currentProviderId = this.getCurrentProviderId();
		if (!StringUtils.isEmpty(currentProviderId)) {
			payRecord.setProviderId(currentProviderId);
		}
	}

	public String getTollsMap() {
		StringBuilder sb = new StringBuilder();
		DecimalFormat format = new DecimalFormat("0.00");
		for (Toll toll : tolls) {
			if (sb.length() > 0) {

				sb.append(',').append("A_" + toll.getId()).append(":'")
						.append(toll.getPeriodBasicRate()).append("'");
			} else {
				sb.append('{');
				double rate = toll.getPeriodBasicRate() == null ? 0 : toll
						.getPeriodBasicRate();
				sb.append("A_" + toll.getId()).append(":'")
						.append(format.format(rate)).append("'");
			}
		}
		sb.append('}');
		return sb.toString();
	}

	public String add() throws Exception {
		String customerId = ServletActionContext.getRequest().getParameter(
				"customerId");
		if (ActionUtils.isPostMethod()) {

			handleAutoInputFields();
			Customer customer = customerService.getCustomer(payRecord
					.getCustId());
			if (customer == null) {
				getProviders();
				getTolls();
				this.addFieldError("payRecord.custId", "用户帐号不存在！");
				return "input";
			}
			payRecord.setPayDate(new Date());
			payRecord.setUpdateUser(getCurrentUser().getUsername());
			if (null == payRecordService.addPayRecord(payRecord)) {
				getProviders();
				getTolls();
				this.addFieldError("payRecord.id", "缴费记录编号必须唯一");
				return "input";
			} else {
				// 计算用户过期日期和剩余时长
				String tollId = payRecord.getTollId();
				Toll toll = tollService.getToll(tollId);
				if (toll == null) {
					this.addFieldError("payRecord.tollId", "资费策略不存在！");
					ServletActionContext.getServletContext().setAttribute(
							"customerId", customerId);
					return "input";
				}
				updateCustomerDueDate(toll, customer);
			}
			systemLogAdd(payRecord.getClass(), "" + payRecord.getId(),
					payRecord.getProviderId());
			return StringUtils.isEmpty(customerId) ? "redirect"
					: "redirect_customer";
		} else {
			payRecord = new PayRecord();

			if (StringUtils.isNotEmpty(customerId)) {
				payRecord.setCustId(customerId);
			}
			ServletActionContext.getServletContext().setAttribute("customerId",
					customerId);

			getProviders();
			getTolls();
			return "add";
		}
	}

	private void updateCustomerDueDate(Toll toll, Customer customer) {
		// 计算用户过期日期和剩余时长
		try {
			Date currentDueDate = customer.getDueDate();
			int addedMonth = toll.getMonthAmount() * payRecord.getAmount();

			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar calender = Calendar.getInstance();

			if (toll.getBillingType().toString().equals(PreBilling)) {

				if (currentDueDate.after(new Date())) {// still not expired
					calender.setTime(currentDueDate);
				} else {
					calender.setTime(new Date());
					calender.add(Calendar.DATE, 1);
				}
				calender.add(Calendar.MONTH, addedMonth);
				Date newDueDate = df.parse(df.format(calender.getTime()));

				customer.setDueDate(newDueDate);
				customerService.editCustomer(customer);
			} else if (toll.getBillingType().toString().equals(MonthlyBilling)) {
				calender.setTime(new Date());
				calender.add(Calendar.MONTH, addedMonth);

				Date newDueDate = df.parse(df.format(calender.getTime()));
				customer.setDueDate(newDueDate);
				customerService.editCustomer(customer);

			} else if (toll.getBillingType().toString().equals(CardBilling)) {
				customer.setAvailableDuration(customer.getAvailableDuration()
						+ toll.getDurationAmount());
				customerService.editCustomer(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String edit() throws Exception {
		return update();
	}

	public String view() throws Exception {
		String id = ServletActionContext.getRequest().getParameter("id");
		this.payRecord = payRecordService.getPayRecord(Integer.parseInt(id));
		return "view";
	}

	public String update() throws Exception {
		Integer id = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("id"));
		if (ActionUtils.isPostMethod()) {
			PayRecord entity = payRecordService.getPayRecord(id);
			ActionUtils.CopyFormDataToEntity(payRecord, entity, "payRecord.");
			if (!payRecordService.editPayRecord(entity)) {
				this.addFieldError("payRecord.id", "缴费记录编号必须唯一");
				return "input";
			}else{
				Toll toll = tollService.getToll(payRecord.getTollId());
				Customer customer = customerService.getCustomer(payRecord.getCustId());
				updateCustomerDueDate(toll, customer);
			}
			systemLogUpdate(entity.getClass(), "" + entity.getId(),
					entity.getProviderId());
			return list();
		} else {
			this.payRecord = payRecordService.getPayRecord(id);
			return "edit";
		}
	}

	public String remove() throws Exception {
		String id = ServletActionContext.getRequest().getParameter("id");
		if (!StringUtils.isEmpty(id)) {
			PayRecord entity = payRecordService.getPayRecord(Integer
					.parseInt(id));
			payRecordService.removePayRecord(new Integer[] { Integer
					.parseInt(id) });
			systemLogDelete(PayRecord.class, id, entity.getProviderId());
		}
		return list();
	}
}
