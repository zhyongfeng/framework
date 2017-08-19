package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.syslog.SysLogSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.SettleRecord;
import com.fengfan.model.SysLog;
import com.fengfan.model.base.BaseSysLogDAO;


public class SysLogDAO extends BaseSysLogDAO implements com.fengfan.model.dao.iface.SysLogDAO {

	public SysLogDAO () {
	}
	
	public SysLogDAO (Session session) {
		super(session);
	}
	
	public Result<SysLog> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(SysLog.class);
		criteria.addOrder(Order.desc(SysLog.PROP_UPDATE_TIME));
		if(searchEntity != null){
			com.fengfan.action.syslog.SysLogSearchCondition condition = (SysLogSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.eq(SysLog.PROP_PROVIDER_ID, condition.getProviderId()) );
			}
			if(StringUtils.isNotEmpty(condition.getObjectName())){
				criteria.add( Restrictions.eq(SysLog.PROP_OBJECT_NAME, condition.getObjectName()) );
			}
			if(StringUtils.isNotEmpty(condition.getExecUser())){
				criteria.add( Restrictions.eq(SysLog.PROP_EXEC_USER, condition.getExecUser()) );
			}
			if(StringUtils.isNotEmpty(condition.getLogType())){
				String conditionValue = "";
				if (condition.getLogType().equals("1")){
					conditionValue =  "Add";
				}else if (condition.getLogType().equals("2")){
					conditionValue =  "Update";
				}else{
					conditionValue =  "Delete";
				}
				criteria.add( Restrictions.eq(SysLog.PROP_LOG_TYPE, conditionValue) );
			}
			if(condition.getStartDate() != null){
				criteria.add( Restrictions.ge(SysLog.PROP_UPDATE_TIME, condition.getStartDate()) );
			}
			if(condition.getEndDate() != null){
				criteria.add( Restrictions.le(SysLog.PROP_UPDATE_TIME, condition.getEndDate()) );
			}
		}
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
}