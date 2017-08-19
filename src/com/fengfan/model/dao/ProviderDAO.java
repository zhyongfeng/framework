package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.provider.ProviderSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Provider;
import com.fengfan.model.base.BaseProviderDAO;


public class ProviderDAO extends BaseProviderDAO implements com.fengfan.model.dao.iface.ProviderDAO {

	public ProviderDAO () {}
	
	public ProviderDAO (Session session) {
		super(session);
	}

	public Result<Provider> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Provider.class);
		
		if(searchEntity != null){
			ProviderSearchCondition condition = (ProviderSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getId())){
				criteria.add( Restrictions.like(Provider.PROP_ID, "%" + condition.getId() + "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getProviderName())){
				criteria.add( Restrictions.like(Provider.PROP_PROVIDER_NAME, "%" + condition.getProviderName() + "%") );
			}
			if(condition.getStatus() != null){
				criteria.add(Restrictions.eq(Provider.PROP_STATUS, condition.getStatus()));
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
}