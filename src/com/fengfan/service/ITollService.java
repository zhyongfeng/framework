package com.fengfan.service;

import java.util.List;

import com.fengfan.model.Toll;

public interface ITollService extends ISearchService {
	public String addToll(Toll toll);
	public Toll getToll(String id);
	public boolean editToll(Toll toll);
	public boolean removeToll(String[] idset);
	public boolean isTollIdExists(String id);
	public List<Toll> listToll();
	public List<Toll> searchByBillingType3();
}
