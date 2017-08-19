package com.fengfan.action.gatewaytype;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Gateway;
import com.fengfan.model.GatewayType;
import com.fengfan.model.Provider;
import com.fengfan.model.enums.GatewayStatus;
import com.fengfan.model.enums.GatewayUseType;
import com.fengfan.service.IGatewayService;
import com.fengfan.service.IGatewayTypeService;
import com.fengfan.service.ISearchService;

public class GatewayAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(GatewayAction.class);
	private Gateway gateway;
	private GatewaySearchCondition searchCondition = new GatewaySearchCondition();
	private GatewayStatus[] gatewayStatuses = GatewayStatus.values();
	private GatewayUseType[] useTypes = GatewayUseType.values();
	private List<GatewayType> gatewayTypes = null;
	
	protected IGatewayService gatewayService;
	protected IGatewayTypeService gatewayTypeService;

	public IGatewayTypeService getGatewayTypeService() {
		return gatewayTypeService;
	}

	public void setGatewayTypeService(IGatewayTypeService gatewayTypeService) {
		this.gatewayTypeService = gatewayTypeService;
	}

	public void setGatewayService(IGatewayService gatewayService) {
		this.gatewayService = gatewayService;
	}

	public IGatewayService getGatewayService() {
		return gatewayService;
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.gateway = gatewayService.getGateway(id);
		return "view";
	}
	
	public List<GatewayType> getGatewayTypes() {
		return gatewayTypes == null ? (gatewayTypes = gatewayTypeService.listGatewayType()) : gatewayTypes;
	}

	public GatewayStatus[] getGatewayStatuses() {
		return gatewayStatuses;
	}

	public GatewayUseType[] getUseTypes() {
		return useTypes;
	}

	public Gateway getGateway() {
		return gateway;
	}


	public void setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

	public String list(){
		search();
		return "list";
	}

	private void handleAutoInputFields(){
		String currentProviderId = this.getCurrentProviderId();
		if(!StringUtils.isEmpty(currentProviderId)){
			gateway.setProviderId(currentProviderId);
		}
	}
	
	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			handleAutoInputFields();
			if(gatewayService.isGatewayIdExists(gateway.getId()) || null == gatewayService.addGateway(gateway)){
				this.addFieldError("gateway.id", "网关设备编号必须唯一");
				return "input";
			}
			systemLogAdd(gateway.getClass(), gateway.getId(),gateway.getProviderId());
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
			Gateway entity = gatewayService.getGateway(id);
			ActionUtils.CopyFormDataToEntity(gateway, entity, "gateway.");
			if(!gatewayService.editGateway(entity)){
				this.addFieldError("gateway.id", "网关设备编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), entity.getId(),entity.getProviderId());
			return "redirect";
		}else{
			this.gateway = gatewayService.getGateway(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Gateway entity = gatewayService.getGateway(id);
			entity.setStatus(""+GatewayStatus.Cancelled.getId());
			gatewayService.editGateway(entity);
			systemLogDelete(Gateway.class, id,entity.getProviderId());
		}
		return list();
	}

	@Override
	public ISearchService getSearchService() {
		return gatewayService;
	}

	@Override
	public GatewaySearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(GatewaySearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
