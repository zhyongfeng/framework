package com.fengfan.action.gatewaytype;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.GatewayType;
import com.fengfan.model.Provider;
import com.fengfan.service.IGatewayTypeService;
import com.fengfan.service.ISearchService;

public class GatewayTypeAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(GatewayTypeAction.class);
	private GatewayType gatewayType;
	private GatewayTypeSearchCondition searchCondition = new GatewayTypeSearchCondition();

	protected IGatewayTypeService gatewayTypeService;

	public void setGatewayTypeService(IGatewayTypeService gatewayTypeService) {
		this.gatewayTypeService = gatewayTypeService;
	}

	public IGatewayTypeService getGatewayTypeService() {
		return gatewayTypeService;
	}
	
	public GatewayType getGatewayType() {
		return gatewayType;
	}


	public void setGatewayType(GatewayType gatewayType) {
		this.gatewayType = gatewayType;
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.gatewayType = gatewayTypeService.getGatewayType(id);
		return "view";
	}

	public String list() throws Exception{
		search();
		return "list";
	}

	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			if(gatewayTypeService.isGatewayTypeNoExists(gatewayType.getId()) || null == gatewayTypeService.addGatewayType(gatewayType)){
				this.addFieldError("gatewayType.id", "网关设备类型编号必须唯一");
				return "input";
			}
			systemLogAdd(gatewayType.getClass(), gatewayType.getId());
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
			GatewayType entity = gatewayTypeService.getGatewayType(id);
			ActionUtils.CopyFormDataToEntity(gatewayType, entity, "gatewayType.");
			if(!gatewayTypeService.editGatewayType(entity)){
				this.addFieldError("gatewayType.id", "网关设备类型编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), entity.getId());
			return "redirect";
		}else{
			this.gatewayType = gatewayTypeService.getGatewayType(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			gatewayTypeService.removeGatewayType(new String[]{id});
			systemLogDelete(GatewayType.class, id);
		}
		return list();
	}

	@Override
	public ISearchService getSearchService() {
		return gatewayTypeService;
	}

	@Override
	public GatewayTypeSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(GatewayTypeSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
