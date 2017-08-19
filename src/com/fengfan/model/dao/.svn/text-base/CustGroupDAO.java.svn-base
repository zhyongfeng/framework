package com.fengfan.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.CustGroup;
import com.fengfan.model.base.BaseCustGroupDAO;


public class CustGroupDAO extends BaseCustGroupDAO implements com.fengfan.model.dao.iface.CustGroupDAO {

	public CustGroupDAO () {}
	
	public CustGroupDAO (Session session) {
		super(session);
	}

	public Result<CustGroup> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(CustGroup.class);
	
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}
	
}