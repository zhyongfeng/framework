package com.fengfan.action.lot;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.Lot;
import com.fengfan.model.PayRecord;
import com.fengfan.model.Provider;
import com.fengfan.model.enums.BillingType;
import com.fengfan.model.enums.BindingType;
import com.fengfan.model.enums.CustomerStatus;
import com.fengfan.model.enums.CustomerType;
import com.fengfan.model.enums.RoamingFlag;
import com.fengfan.service.ICustomerService;
import com.fengfan.service.ILotService;
import com.fengfan.service.ISearchService;

public class LotAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(LotAction.class);
	private Lot lot;
	private LotSearchCondition searchCondition = new LotSearchCondition();
	
	private BillingType[] billingTypes = BillingType.values();
	private BindingType[] bindingTypes = BindingType.values();
	private CustomerStatus[] lotStatuses = CustomerStatus.values();
	private CustomerType[] lotTypes = CustomerType.values();
	private RoamingFlag[] roamingFlags = RoamingFlag.values();
	protected ILotService lotService;

	public void setLotService(ILotService lotService) {
		this.lotService = lotService;
	}
	
	public BillingType[] getBillingTypes() {
		return billingTypes;
	}

	public BindingType[] getBindingTypes() {
		return bindingTypes;
	}

	public CustomerStatus[] getLotStatuses() {
		return lotStatuses;
	}

	public CustomerType[] getLotTypes() {
		return lotTypes;
	}

	public RoamingFlag[] getRoamingFlags() {
		return roamingFlags;
	}

	public ILotService getLotService() {
		return lotService;
	}
	
	public Lot getLot() {
		return lot;
	}


	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.lot = lotService.getLot(Integer.parseInt(id));
		return "view";
	}
	
	public String list() throws Exception{
		search();
		return "list";
	}

	private void prepareForInput(){
	}
	
	private void handleAutoInputFields(){
		String currentProviderId = this.getCurrentProviderId();
		if(!StringUtils.isEmpty(currentProviderId)){
			lot.setProviderId(currentProviderId);
		}
	}
	
	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			handleAutoInputFields();
			if(null == lotService.addLot(lot)){
				prepareForInput();
				this.addFieldError("lot.id", "批量卡编号必须唯一");
				return "input";
			}
			//生成customer数据
			lotService.addCustomerByLot(lot);
			systemLogAdd(lot.getClass(), ""+lot.getId(),lot.getProviderId());
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
		Integer id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		if(ActionUtils.isPostMethod()){
			Lot entity = lotService.getLot(id);
			ActionUtils.CopyFormDataToEntity(lot, entity, "lot.");
			if(!lotService.editLot(entity)){
				this.addFieldError("lot.id", "批量卡编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), ""+entity.getId(),entity.getProviderId());
			return "redirect";
		}else{
			this.lot = lotService.getLot(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Lot entity = lotService.getLot(Integer.parseInt(id));
			lotService.removeLot(new Integer[]{Integer.parseInt(id)});
			systemLogDelete(Lot.class, id,entity.getProviderId());
			
		}
		return list();
	}

	@Override
	public ISearchService getSearchService() {
		return lotService;
	}

	@Override
	public LotSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(LotSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
