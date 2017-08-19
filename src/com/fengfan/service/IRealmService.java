package com.fengfan.service;

import com.fengfan.model.Realm;

public interface IRealmService extends ISearchService{
	public Integer addRealm(Realm realm);
	public Realm getRealm(int id);
	public boolean editRealm(Realm realm);
	public boolean removeRealm(int[] idset);
}
