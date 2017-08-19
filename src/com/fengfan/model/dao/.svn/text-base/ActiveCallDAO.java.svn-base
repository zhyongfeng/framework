package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.activecall.ActiveCallSearchCondition;
import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.ActiveCall;
import com.fengfan.model.base.BaseActiveCallDAO;


public class ActiveCallDAO extends BaseActiveCallDAO implements com.fengfan.model.dao.iface.ActiveCallDAO {

	public ActiveCallDAO () {}
	
	public ActiveCallDAO (Session session) {
		super(session);
	}

	public Result<ActiveCall> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(ActiveCall.class);
		
		if(searchEntity != null){
			ActiveCallSearchCondition condition = (ActiveCallSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getCustName())){
				criteria.add( Restrictions.eq(ActiveCall.PROP_CUST_NAME, condition.getCustName()) );
			}
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.eq(ActiveCall.PROP_PROVIDER_ID, condition.getProviderId()) );
			}
			if(condition.getStartTime() != null){
				criteria.add( Restrictions.ge(ActiveCall.PROP_START_TIME, condition.getStartTime()) );
			}
			if(condition.getEndTime() != null){
				criteria.add( Restrictions.eq(ActiveCall.PROP_START_TIME, condition.getEndTime()) );
			}
			if(StringUtils.isNotEmpty(condition.getNasId())){
				criteria.add( Restrictions.eq(ActiveCall.PROP_NAS_PORT, condition.getNasId()) );
			}
			if(StringUtils.isNotEmpty(condition.getCallingID())){
				criteria.add( Restrictions.eq(ActiveCall.PROP_CALLED_I_D, condition.getCallingID()) );
			}
			if(StringUtils.isNotEmpty(condition.getFramedIp())){
				criteria.add( Restrictions.eq(ActiveCall.PROP_FRAMED_IP, condition.getFramedIp()) );
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
}