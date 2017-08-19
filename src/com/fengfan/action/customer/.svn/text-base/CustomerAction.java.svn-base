package com.fengfan.action.customer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Customer;
import com.fengfan.model.Lot;
import com.fengfan.model.enums.BillingType;
import com.fengfan.model.enums.BindingType;
import com.fengfan.model.enums.CustomerStatus;
import com.fengfan.model.enums.CustomerType;
import com.fengfan.model.enums.Gender;
import com.fengfan.model.enums.RoamingFlag;
import com.fengfan.service.ICustGroupService;
import com.fengfan.service.ICustomerService;
import com.fengfan.service.ILotService;
import com.fengfan.service.ISearchService;

public class CustomerAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(CustomerAction.class);
	private Customer customer;
	private CustomerSearchCondition searchCondition = new CustomerSearchCondition();
	
	private BillingType[] billingTypes = BillingType.values();
	private BindingType[] bindingTypes = BindingType.values();
	private CustomerStatus[] customerStatuses = CustomerStatus.values();
	private CustomerType[] customerTypes = CustomerType.values();
	private RoamingFlag[] roamingFlags = RoamingFlag.values();
	private Gender[] genders = Gender.values();
	private List<CustGroup> custGroups = null;
	private List<Lot> lots = null;
	protected ICustomerService customerService;
	protected ILotService lotService;
	protected ICustGroupService custGroupService;
	
	
	
	
	public Gender[] getGenders(){
		return genders;
	}
	
	public ICustGroupService getCustGroupService(){
		return custGroupService;
	}
	
	public void setCustGroupService(ICustGroupService custGroupService){
		this.custGroupService = custGroupService;
	}
	

	public List<Lot> getLots() {
		return lots == null ? lots = lotService.listLot() : lots;
	}
	
	public List<CustGroup> getCustGroups(){
		return custGroups == null ? (custGroups = custGroupService.listCustGroup()) : custGroups;
	}
	
	public void setLotService(ILotService lotService) {
		this.lotService = lotService;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	
	public BillingType[] getBillingTypes() {
		return billingTypes;
	}

	public BindingType[] getBindingTypes() {
		return bindingTypes;
	}

	public CustomerStatus[] getCustomerStatuses() {
		return customerStatuses;
	}

	public CustomerType[] getCustomerTypes() {
		return customerTypes;
	}

	public RoamingFlag[] getRoamingFlags() {
		return roamingFlags;
	}

	public ICustomerService getCustomerService() {
		return customerService;
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.customer = customerService.getCustomer(id);
		return "view";
	}
	
	public Customer getCustomer() {
		return customer == null ? (customer = new Customer()) : customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String list() throws Exception{
		search();
		return "list";
	}

	private void prepareForInput(){
		this.lots = lotService.listLot();
		this.custGroups = custGroupService.listCustGroup();
	}
	
	private void handleAutoInputFields(){
		String currentProviderId = this.getCurrentProviderId();
		if(!StringUtils.isEmpty(currentProviderId)){
			customer.setProviderId(currentProviderId);
		}
	}
	
	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			customer.setLoginName(customer.getId());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar calender = Calendar.getInstance();
			calender.setTime(new Date());
			customer.setDueDate(df.parse(df.format(calender.getTime())));
			handleAutoInputFields();
			if(customerService.isCustomerIdExists(customer.getId())){
				prepareForInput();
				this.addFieldError("customer.id", "用户编号必须唯一");
				return "input";
			}else if(customerService.isLoginNameExists(customer.getLoginName())){
				prepareForInput();
				this.addFieldError("customer.id", "用户登录名必须唯一");
				return "input";
			}else if(null == customerService.addCustomer(customer)){
				prepareForInput();
				this.addFieldError("customer.id", "用户编号必须唯一");
				return "input";
			}
			systemLogAdd(customer.getClass(), customer.getId(),customer.getProviderId());
			return "redirect";
		}else{
			prepareForInput();
			return "add";
		}
	}
	
	public String edit() throws Exception{
		return update();
	}
	
	public String update() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(ActionUtils.isPostMethod()){
			Customer entity = customerService.getCustomer(id);
			ActionUtils.CopyFormDataToEntity(customer, entity, "customer.");
			entity.setLoginName(entity.getId());
			if(!customerService.editCustomer(entity)){
				this.addFieldError("customer.id", "用户编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), entity.getId());
			return "redirect";
		}else{
			this.customer = customerService.getCustomer(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			customerService.removeCustomer(new String[]{id});
			systemLogDelete(Customer.class, id);
		}
		return "redirect";
	}
	
	public String cancel()throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Customer entity = customerService.getCustomer(id);
			if(entity != null){
				entity.setStatus(CustomerStatus.Deleted.getId());
				customerService.editCustomer(entity);
				systemLogWithDesc(Customer.class, id, entity.getProviderId(),"销户");
			}
		}
		return "redirect";
	}
	
	public String down()throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Customer entity = customerService.getCustomer(id);
			if(entity != null){
				entity.setStatus(CustomerStatus.Suspended.getId());
				customerService.editCustomer(entity);
				systemLogWithDesc(Customer.class, id,entity.getProviderId(),"停机");
			}
		}
		return "redirect";
	}
	
	public String up() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Customer entity = customerService.getCustomer(id);
			if(entity != null){
				entity.setStatus(CustomerStatus.Normal.getId());
				customerService.editCustomer(entity);
				systemLogWithDesc(Customer.class, id,entity.getProviderId(), "复机");
			}
		}
		return "redirect";
	}
	
	public String changePassword() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.customer = customerService.getCustomer(id);
		return "changePassword";
	}
	
	public String processPassword() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		String oldPassword = request.getParameter("customer.password");
		String newPassword = request.getParameter("password1");
		String confirmPassword = request.getParameter("password2");
		
		if(!StringUtils.isEmpty(id)){
			Customer entity = customerService.getCustomer(id);
			if(entity != null){
				if(!newPassword.equals(confirmPassword)){
					request.setAttribute("error", "PasswordNotEqual");
					this.customer = entity;
					return "changePassword";
				}
				if(!oldPassword.equals(entity.getPassword())){
					request.setAttribute("error", "WrongPassword");
					this.customer = entity;
					return "changePassword";
				}
				customerService.changePassword(newPassword, id);
				systemLogWithDesc(Customer.class, id,entity.getProviderId(), "修改密码");
			}
		}
		return "redirect";
	}
	
	public String invoice() throws Exception{
		return "list";
	}
	
	public String renewal() throws Exception{
		return "list";
	}

	@Override
	public ISearchService getSearchService() {
		return customerService;
	}

	@Override
	public CustomerSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(CustomerSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
