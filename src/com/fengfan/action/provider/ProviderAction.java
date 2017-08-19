package com.fengfan.action.provider;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.common.util.Constants;
import com.fengfan.model.CustGroup;
import com.fengfan.model.Provider;
import com.fengfan.model.SysLog;
import com.fengfan.model.Users;
import com.fengfan.model.enums.ProviderStatus;
import com.fengfan.model.enums.ProviderType;
import com.fengfan.service.ISearchService;

public class ProviderAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(ProviderAction.class);
	private Provider provider;
	private ProviderType[] providerTypes = ProviderType.values();
	private ProviderStatus[] providerStatuses = ProviderStatus.values();
	private ProviderSearchCondition searchCondition = new ProviderSearchCondition();

	public ProviderType[] getProviderTypes() {
		return providerTypes;
	}
	
	public ProviderStatus[] getProviderStatuses() {
		return providerStatuses;
	}

	public Provider getProvider() {
		return provider;
	}


	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String list() throws Exception{
		if(!ActionUtils.isPostMethod()){
			searchCondition.setStatus(ProviderStatus.Normal.getId());
		}
		search();
		return "list";
	}
	
	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.provider = providerService.getProvider(id);
		return "view";
	}

	public String add() throws Exception{
		ServletActionContext.getRequest().setAttribute("providerTypes", providerTypes);
		if(ActionUtils.isPostMethod()){
			if(providerService.isProviderNoExists(provider.getId()) || false == providerService.addProvider(provider)){
				this.addFieldError("provider.id", "运营商编号必须唯一");
				return "input";
			}
			systemLogAdd(Provider.class, provider.getId(),provider.getId());
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
			Provider entity = providerService.getProvider(id);
			ActionUtils.CopyFormDataToEntity(provider, entity, "provider.");
			if(!providerService.editProvider(entity)){
				this.addFieldError("provider.id", "运营商编号必须唯一");
				return  "input";
			}
			systemLogUpdate(entity.getClass(), ""+entity.getId(),entity.getId());
			return "redirect";
		}else{
			this.provider = providerService.getProvider(id);
			return "edit";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		if(!StringUtils.isEmpty(id)){
			Provider provider = providerService.getProvider(id);
			if(provider == null){
				logger.warn("运营商不存在，逻辑删除失败！");
			}else{
				provider.setStatus(ProviderStatus.Cancelled.getId());
				providerService.editProvider(provider);
			}
			systemLogDelete(Provider.class, id,id);
		}
		return list();
	}

	@Override
	public ISearchService getSearchService() {
		return providerService;
	}

	@Override
	public ProviderSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(ProviderSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
