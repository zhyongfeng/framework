package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.users.UserSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Customer;
import com.fengfan.model.Users;
import com.fengfan.model.base.BaseUsersDAO;


public class UsersDAO extends BaseUsersDAO implements com.fengfan.model.dao.iface.UsersDAO {

	public UsersDAO () {}
	
	public UsersDAO (Session session) {
		super(session);
	}

	public Result<Users> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Users.class);
		
		if(searchEntity != null){
			UserSearchCondition condition = (UserSearchCondition)searchEntity;
			
			if(StringUtils.isNotEmpty(condition.getUserName())){
				criteria.add( Restrictions.like(Users.PROP_USERNAME, "%" + condition.getUserName() + "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.eq(Customer.PROP_PROVIDER_ID, condition.getProviderId()));
			}
			if(condition.getStatus() != null){
				criteria.add( Restrictions.eq(Users.PROP_ENABLED, condition.getStatus()));
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

}