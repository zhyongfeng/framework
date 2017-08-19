package com.fengfan.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.PageUtil;
import com.fengfan.common.result.Result;
import com.fengfan.model.Realm;
import com.fengfan.model.base.BaseRealmDAO;


public class RealmDAO extends BaseRealmDAO implements com.fengfan.model.dao.iface.RealmDAO {

	public RealmDAO () {}
	
	public RealmDAO (Session session) {
		super(session);
	}

	public Result<Realm> search(ISearchCondition searchEntity, int pageSize, int currentPage){
		Criteria criteria = getSession().createCriteria(Realm.class);
		if(searchEntity != null){
		}
		return PageUtil.paginateSearchResult(pageSize, currentPage, criteria);
	}

}