package com.fengfan.action.activecall;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.BaseAction;
import com.fengfan.model.ActiveCall;
import com.fengfan.service.IActiveCallService;
import com.fengfan.service.ISearchService;

public class ActiveCallAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(ActiveCallAction.class);
	private ActiveCall activeCall;
	private ActiveCallSearchCondition searchCondition = new ActiveCallSearchCondition();
	protected IActiveCallService activeCallService;

	public void setActiveCallService(IActiveCallService activeCallService) {
		this.activeCallService = activeCallService;
	}

	public IActiveCallService getActiveCallService() {
		return activeCallService;
	}
	
	public ActiveCall getActiveCall() {
		return activeCall;
	}
	
	public void setActiveCall(ActiveCall ActiveCall) {
		this.activeCall = ActiveCall;
	}

	public String list() throws Exception{
		search();
		return "list";
	}

	public String view() throws Exception{
		try {
			String id = ServletActionContext.getRequest().getParameter("id");
			this.activeCall = activeCallService.getActiveCall(id);
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("exception", e.getMessage());
			return "exception";
		}
		return "view";
	}
	

	@Override
	public ISearchService getSearchService() {
		return activeCallService;
	}

	@Override
	public ActiveCallSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(ActiveCallSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
