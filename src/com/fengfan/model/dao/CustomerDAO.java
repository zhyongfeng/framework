package com.fengfan.model.dao;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.customer.CustomerSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Customer;
import com.fengfan.model.base.BaseCustomerDAO;


public class CustomerDAO extends BaseCustomerDAO implements com.fengfan.model.dao.iface.CustomerDAO {

	public CustomerDAO () {}
	
	public CustomerDAO (Session session) {
		super(session);
	}
	public Result<Customer> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Customer.class);
		
		if(searchEntity != null){
			CustomerSearchCondition condition = (CustomerSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getId())){
				criteria.add( Restrictions.like(Customer.PROP_ID, "%" + condition.getId() + "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getLoginName())){
				criteria.add( Restrictions.like(Customer.PROP_LOGIN_NAME, "%" + condition.getLoginName() + "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.eq(Customer.PROP_PROVIDER_ID, condition.getProviderId()));
			}
			if(condition.getStatus() != null){
				criteria.add( Restrictions.eq(Customer.PROP_STATUS, condition.getStatus()));
			}
			if(condition.getDueDate() != null){
				criteria.add( Restrictions.le(Customer.PROP_DUE_DATE, condition.getDueDate()));
			}
			if(condition.getLotId() != null){
				criteria.add( Restrictions.eq(Customer.PROP_LOT_ID, condition.getLotId()));
			}
			if(condition.getBillingType() != null){
				criteria.add( Restrictions.eq(Customer.PROP_BILLING_TYPE, condition.getBillingType().toString()));
			}
			if(StringUtils.isNotEmpty(condition.getGroupId())){
				criteria.add( Restrictions.eq(Customer.PROP_GROUP_ID, condition.getGroupId()));
			}
			if(StringUtils.isNotEmpty(condition.getAvailableDuration())){
				criteria.add( Restrictions.le(Customer.PROP_AVAILABLE_DURATION, Integer.parseInt(condition.getAvailableDuration())));
			}
			if(StringUtils.isNotEmpty(condition.getName())){
				criteria.add( Restrictions.like(Customer.PROP_NAME, "%" + condition.getName() + "%" ) );
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
	
	public Customer findByLoginName(String loginName){
		Criteria criteria = getSession().createCriteria(Customer.class);
		criteria.add( Restrictions.eq(Customer.PROP_ID, loginName ) );
		List<Customer> list = criteria.list();
		return list.isEmpty() ? null : list.get(0);
	}

}