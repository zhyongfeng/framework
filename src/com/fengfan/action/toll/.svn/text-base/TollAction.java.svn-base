package com.fengfan.action.toll;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Provider;
import com.fengfan.model.Toll;
import com.fengfan.model.enums.BillingType;
import com.fengfan.service.ISearchService;
import com.fengfan.service.ITollService;

public class TollAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(TollAction.class);
	private Toll toll;
	private TollSearchCondition searchCondition = new TollSearchCondition();
	
	private BillingType[] billingTypes = BillingType.values();
	protected ITollService tollService;

	public void setTollService(ITollService tollService) {
		this.tollService = tollService;
	}
	
	public BillingType[] getBillingTypes() {
		return billingTypes;
	}

	public ITollService getTollService() {
		return tollService;
	}
	
	public Toll getToll() {
		return toll;
	}


	public void setToll(Toll toll) {
		this.toll = toll;
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.toll = tollService.getToll(id);
		return "view";
	}
	
	public String list() throws Exception{
		search();
		return "list";
	}
	
	private void handleAutoInputFields(){
		String currentProviderId = this.getCurrentProviderId();
		if(!StringUtils.isEmpty(currentProviderId)){
			toll.setProviderId(currentProviderId);
		}
	}
	
	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			handleAutoInputFields();
			if(tollService.isTollIdExists(toll.getId())){
				this.addFieldError("toll.id", "资费策略必须唯一");
				return "input";
			}else if(null == tollService.addToll(toll)){
				this.addFieldError("toll.id", "资费策略必须唯一");
				return "input";
			}
			systemLogAdd(toll.getClass(), toll.getId(),toll.getProviderId());
			return "redirect";
		}else{
			return "add";
		}
	}
	
	public String edit() throws Exception{
		return update();
	}
	
	public String update() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(ActionUtils.isPostMethod()){
			Toll entity = tollService.getToll(id);
			ActionUtils.CopyFormDataToEntity(toll, entity, "toll.");
			if(!tollService.editToll(entity)){
				this.addFieldError("toll.id", "资费策略必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), entity.getId(),entity.getProviderId());
			return "redirect";
		}else{
			this.toll = tollService.getToll(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Toll entity = tollService.getToll(id);
			tollService.removeToll(new String[]{id});
			systemLogDelete(Toll.class, id,entity.getProviderId());
		}
		return "redirect";
	}

	@Override
	public ISearchService getSearchService() {
		return tollService;
	}

	@Override
	public TollSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(TollSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
