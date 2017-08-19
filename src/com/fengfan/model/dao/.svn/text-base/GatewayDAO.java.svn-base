package com.fengfan.model.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.gatewaytype.GatewaySearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Gateway;
import com.fengfan.model.base.BaseGatewayDAO;


public class GatewayDAO extends BaseGatewayDAO implements com.fengfan.model.dao.iface.GatewayDAO {

	public GatewayDAO () {}
	
	public GatewayDAO (Session session) {
		super(session);
	}

	public Result<Gateway> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Gateway.class);
		
		/**
		 * 
		 * 网关管理功能：添加、删除、修改和查询。删除时，更改状态为停用?。
		 * 查询条件包括：GatewayCode、ProviderCode、GatewayName、Status、ProxyEnabled、IsPublic、GatewayTypeCode、Location(模糊)
		 * 
		 */
		if(searchEntity != null){
			
			GatewaySearchCondition condition = (GatewaySearchCondition)searchEntity;
			if(StringUtils.isNotEmpty(condition.getId())){
				criteria.add( Restrictions.like(Gateway.PROP_ID, "%" + condition.getId() + "%" ) );
			}
			if(StringUtils.isNotEmpty(condition.getProviderId())){
				criteria.add( Restrictions.eq(Gateway.PROP_PROVIDER_ID, condition.getProviderId()));
			}
			if(StringUtils.isNotEmpty(condition.getGatewayName())){
				criteria.add( Restrictions.like(Gateway.PROP_GATEWAY_NAME, "%" + condition.getGatewayName()));
			}
			if(StringUtils.isNotEmpty(condition.getStatus())){
				criteria.add( Restrictions.eq(Gateway.PROP_STATUS, condition.getStatus()));
			}
			if(StringUtils.isNotEmpty(condition.getProxyEnabled())){
				criteria.add( Restrictions.eq(Gateway.PROP_PROXY_ENABLED, condition.getProxyEnabled()));
			}
			if(StringUtils.isNotEmpty(condition.getIsPublic())){
				criteria.add( Restrictions.eq(Gateway.PROP_IS_PUBLIC, condition.getIsPublic()));
			}
			if(StringUtils.isNotEmpty(condition.getGatewayTypeId())){
				criteria.add( Restrictions.eq(Gateway.PROP_GATEWAY_TYPE_ID, condition.getGatewayTypeId()));
			}
			if(StringUtils.isNotEmpty(condition.getLocation())){
				criteria.add( Restrictions.le(Gateway.PROP_LOCATION, condition.getLocation()));
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

}