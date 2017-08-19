package com.fengfan.action.syslog;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.BaseAction;
import com.fengfan.model.SysLog;
import com.fengfan.model.enums.SysLogType;
import com.fengfan.service.ISearchService;
import com.fengfan.service.ISysLogService;

public class SysLogAction extends BaseAction {
	
	public static final Logger logger = Logger.getLogger(SysLogAction.class);
	private SysLog sysLog;
	private SysLogSearchCondition searchCondition = new SysLogSearchCondition();
	private SysLogType[] logTypes = SysLogType.values();
	protected ISysLogService SysLogService;

	public void setSysLogService(ISysLogService SysLogService) {
		this.SysLogService = SysLogService;
	}

	public ISysLogService getSysLogService() {
		return SysLogService;
	}
	
	public SysLog getSysLog() {
		return sysLog;
	}

	public SysLogType[] getLogTypes() {
		return logTypes;
	}

	public void setSysLog(SysLog SysLog) {
		this.sysLog = SysLog;
	}

	public String list() throws Exception{
		search();
		return "list";
	}

	public String view() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.sysLog = SysLogService.getSysLog(Integer.parseInt(id));
		return "view";
	}
	

	@Override
	public ISearchService getSearchService() {
		return SysLogService;
	}

	@Override
	public SysLogSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(SysLogSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}
}
