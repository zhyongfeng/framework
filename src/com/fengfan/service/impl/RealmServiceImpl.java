package com.fengfan.service.impl;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.Realm;
import com.fengfan.model.dao.RealmDAO;
import com.fengfan.service.IRealmService;

public class RealmServiceImpl implements IRealmService {

	private RealmDAO realmDAO;
	
	public RealmDAO getRealmDAO() {
		return realmDAO;
	}

	public void setRealmDAO(RealmDAO dao) {
		this.realmDAO = dao;
	}
	
	@Override
	public Result<?> search(ISearchCondition searchEntity, int pageSize,
			int currentPage) {
		return realmDAO.search(searchEntity, pageSize, currentPage);
	}

	@Override
	public Integer addRealm(Realm realm) {
		return realmDAO.save(realm);
	}

	@Override
	public Realm getRealm(int id) {
		return realmDAO.get(id);
	}

	@Override
	public boolean editRealm(Realm realm) {
		realmDAO.update(realm);
		return true;
	}

	@Override
	public boolean removeRealm(int[] idset) {
		for(int id : idset){
			realmDAO.delete(id);
		}
		return true;
	}
}
