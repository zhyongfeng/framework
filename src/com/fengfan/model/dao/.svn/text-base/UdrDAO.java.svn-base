package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.udr.UdrSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Udr;
import com.fengfan.model.base.BaseUdrDAO;


public class UdrDAO extends BaseUdrDAO implements com.fengfan.model.dao.iface.UdrDAO {

	public UdrDAO () {}
	
	public UdrDAO (Session session) {
		super(session);
	}
	public Result<Udr> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Udr.class);
		
		if(searchEntity != null){
			UdrSearchCondition condition = (UdrSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getCustName())){
				criteria.add( Restrictions.like(Udr.PROP_CUST_NAME, "%" + condition.getCustName()+ "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.like(Udr.PROP_PROVIDER_ID, "%" + condition.getProviderId() + "%") );
			}
			if(StringUtils.isNotEmpty(condition.getFramedIp())){
				criteria.add( Restrictions.like(Udr.PROP_FRAMED_IP, "%" + condition.getFramedIp()+ "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getNasId())){
				criteria.add( Restrictions.like(Udr.PROP_NAS_ID, "%" + condition.getNasId() + "%") );
			}
			if(StringUtils.isNotEmpty(condition.getErrType())){
				criteria.add( Restrictions.like(Udr.PROP_ERR_TYPE, "%" + condition.getErrType() + "%") );
			}
			if(condition.getStartDate() != null){
				criteria.add(Restrictions.gt(Udr.PROP_START_TIME, condition.getStartDate()));
			}
			if(condition.getEndDate() != null){
				criteria.add(Restrictions.lt(Udr.PROP_END_TIME, condition.getEndDate()));
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

}