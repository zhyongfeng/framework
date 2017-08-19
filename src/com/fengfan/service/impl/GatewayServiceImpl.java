package com.fengfan.service.impl;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.Gateway;
import com.fengfan.model.dao.GatewayDAO;
import com.fengfan.service.IGatewayService;

public class GatewayServiceImpl implements IGatewayService {

	private GatewayDAO gatewayTypeDAO;
	
	public GatewayDAO getGatewayDAO() {
		return gatewayTypeDAO;
	}

	public void setGatewayDAO(GatewayDAO dao) {
		this.gatewayTypeDAO = dao;
	}
	
	@Override
	public Result<?> search(ISearchCondition searchEntity, int pageSize,
			int currentPage) {
		return gatewayTypeDAO.search(searchEntity, pageSize, currentPage);
	}

	@Override
	public String addGateway(Gateway gatewayType) {
		return gatewayTypeDAO.save(gatewayType);
	}

	@Override
	public Gateway getGateway(String id) {
		return gatewayTypeDAO.get(id);
	}

	@Override
	public boolean editGateway(Gateway gatewayType) {
		gatewayTypeDAO.update(gatewayType);
		return true;
	}

	@Override
	public boolean removeGateway(String[] idset) {
		for(String id : idset){
			gatewayTypeDAO.delete(id);
		}
		return true;
	}

	@Override
	public boolean isGatewayIdExists(String no) {
		try{
			Gateway entity = gatewayTypeDAO.get(no);
			return entity != null;
		}catch(Exception ex){
			return true;
		}
	}
}
