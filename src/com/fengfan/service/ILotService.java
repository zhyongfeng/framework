package com.fengfan.service;

import java.util.List;

import com.fengfan.model.Lot;

public interface ILotService extends ISearchService {
	public List<Lot> listLot();
	public Integer addLot(Lot lot);
	public Lot getLot(Integer id);
	public boolean editLot(Lot lot);
	public boolean removeLot(Integer[] idset);
	public void addCustomerByLot(Lot lot);
}
