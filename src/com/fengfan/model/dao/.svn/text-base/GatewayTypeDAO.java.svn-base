package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.gatewaytype.GatewayTypeSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.GatewayType;
import com.fengfan.model.base.BaseGatewayTypeDAO;


public class GatewayTypeDAO extends BaseGatewayTypeDAO implements com.fengfan.model.dao.iface.GatewayTypeDAO {

	public GatewayTypeDAO () {}
	
	public GatewayTypeDAO (Session session) {
		super(session);
	}

	public Result<GatewayType> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(GatewayType.class);
		
		if(searchEntity != null){
			GatewayTypeSearchCondition condition = (GatewayTypeSearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getManufactory())){
				criteria.add( Restrictions.like(GatewayType.PROP_MANUFACTORY, "%" + condition.getManufactory() + "%" ) );
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

}