package com.fengfan.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.action.lot.LotSearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Lot;
import com.fengfan.model.base.BaseLotDAO;


public class LotDAO extends BaseLotDAO implements com.fengfan.model.dao.iface.LotDAO {

	public LotDAO () {}
	
	public LotDAO (Session session) {
		super(session);
	}

	public Result<Lot> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Lot.class);
		
		if(searchEntity != null){
			LotSearchCondition condition = (LotSearchCondition)searchEntity;
			if(null != condition.getProviderId()){
				criteria.add( Restrictions.eq(Lot.PROP_PROVIDER_ID, condition.getProviderId()) );
			}
		}
		
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
}