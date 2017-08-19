package com.fengfan.action.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.fengfan.common.result.Page;
import com.fengfan.common.result.Result;
import com.fengfan.common.util.Constants;
import com.fengfan.model.Provider;
import com.fengfan.model.SysLog;
import com.fengfan.model.Users;
import com.fengfan.service.IProviderService;
import com.fengfan.service.ISearchService;
import com.fengfan.service.ISysLogService;
import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {
	
	public static final Log logger = LogFactory.getLog(BaseAction.class);
	
	protected static final String RESULT = "RESULT";
	protected static final String SEARCH_CONDITION = "searchCondition";
	protected IProviderService providerService;
	protected ISysLogService sysLogService;
	
	public ISysLogService getSysLogService() {
		return sysLogService;
	}

	public void setSysLogService(ISysLogService sysLogService) {
		this.sysLogService = sysLogService;
	}

	protected List<Provider> providers = null;

	public List<Provider> getProviders(){
		if(providers == null){
			String providerId = getCurrentProviderId();
			if(StringUtils.isEmpty(providerId)){
				providers = providerService.listProvider();
			}else{
				providers = new ArrayList<Provider>();
				Provider provider = providerService.getProvider(providerId);
				if(provider != null){
					providers.add(provider);
				}
			}
		}
		return providers;
	}
	
	public void systemLogDelete(Class<?> oclazz, String oid){
		systemLog(Constants.LOG_TYPE_DELETE, oclazz.getSimpleName(), oid, null);
	}
	
	public void systemLogUpdate(Class<?> oclazz, String oid){
		systemLog(Constants.LOG_TYPE_UPDATE, oclazz.getSimpleName(), oid, null);
	}
	
	public void systemLogAdd(Class<?> oclazz, String oid){
		systemLog(Constants.LOG_TYPE_ADD, oclazz.getSimpleName(), oid, null);
	}
	
	public void systemLogDelete(Class<?> oclazz, String oid, String providerId){
		systemLog(Constants.LOG_TYPE_DELETE, oclazz.getSimpleName(), oid,providerId);
	}
	
	public void systemLogUpdate(Class<?> oclazz, String oid, String providerId){
		systemLog(Constants.LOG_TYPE_UPDATE, oclazz.getSimpleName(), oid, providerId);
	}
	
	public void systemLogAdd(Class<?> oclazz, String oid,String providerId){
		systemLog(Constants.LOG_TYPE_ADD, oclazz.getSimpleName(), oid, providerId);
	}
	
	
	public void systemLogWithDesc(Class<?> oclazz, String oid, String providerId,String desc){
		systemLog(Constants.LOG_TYPE_ADD, oclazz.getSimpleName(), oid, providerId, desc);
	}
	
	public void systemLog(String logType, String oname, String oid,String providerId){
		//update sysLog
		try {
			Users sessionUser = this.getCurrentUser();
			SysLog sysLog = new SysLog();
			sysLog.setExecUser(sessionUser.getUsername());
			sysLog.setUpdateTime(new Date());
			sysLog.setLogType(logType);
			sysLog.setObjectName(oname);
			sysLog.setObjectId(oid);
			sysLog.setProviderId(providerId);
			this.sysLogService.save(sysLog);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void systemLog(String logType, String oname, String oid, String providerId,String desc){
		//update sysLog
		try {
			Users sessionUser = this.getCurrentUser();
			SysLog sysLog = new SysLog();
			sysLog.setExecUser(sessionUser.getUsername());
			sysLog.setUpdateTime(new Date());
			sysLog.setLogType(logType);
			sysLog.setObjectName(oname);
			sysLog.setObjectId(oid);
			sysLog.setProviderId(providerId);
			sysLog.setDescription(desc);
			this.sysLogService.save(sysLog);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setProviderService(IProviderService providerService) {
		this.providerService = providerService;
	}

	public IProviderService getProviderService() {
		return providerService;
	}

	public int getCurrentPage(HttpServletRequest request) {
		String strCurrentPage = request.getParameter(Page.CURRENT_PAGE);
		try {
			return Integer.parseInt(strCurrentPage);
		} catch (Exception e) {
			return 1;
		}
	}

	public int getPageSize(HttpServletRequest request) {
		String strPageSize = request.getParameter(Page.PAGE_SIZE);
		try {
			return Integer.parseInt(strPageSize);
		} catch (Exception e) {
			return 10;
		}
	}
	
	public String getCurrentProviderId(){
		Users user = getCurrentUser();
		if(StringUtils.isNotEmpty(user.getProviderId()))
			return user.getProviderId();
		else
			return null;
	}

	public Users getCurrentUser() {
		Users user = (Users)ServletActionContext.getRequest().getSession().getAttribute(Constants.SESSION_USER_KEY);
		return user;
	}
	
	public String getCurrentRole(){
		return ""+ServletActionContext.getRequest().getSession().getAttribute(Constants.SESSION_USER_ROLE);
	}
	
	public boolean isAdminRole(){
		return StringUtils.equalsIgnoreCase(Constants.ADMIN_ROLE, getCurrentRole());
	}
	
	public abstract ISearchService getSearchService();
	public abstract ISearchCondition getSearchCondition();

	public String search(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int pageSize = getPageSize(request);
		int currentPage = getCurrentPage(request);
		ISearchCondition searchCondition = getSearchCondition();
		if(getCurrentProviderId() != null && searchCondition != null && searchCondition instanceof AbstractSearchCondition){
			AbstractSearchCondition asc = (AbstractSearchCondition)searchCondition;
			asc.setProviderId(getCurrentProviderId());
		}
		Result<?> result = getSearchService().search(searchCondition, pageSize, currentPage);
		request.setAttribute(RESULT, result);
		request.setAttribute(Page.CURRENT_PAGE, currentPage);
		request.setAttribute(Page.PAGE_SIZE, pageSize);
		request.setAttribute(SEARCH_CONDITION, searchCondition);
		return "search";
	}
}
