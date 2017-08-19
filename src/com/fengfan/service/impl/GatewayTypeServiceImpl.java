package com.fengfan.service.impl;

import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.GatewayType;
import com.fengfan.model.dao.GatewayTypeDAO;
import com.fengfan.service.IGatewayTypeService;

public class GatewayTypeServiceImpl implements IGatewayTypeService {

	private GatewayTypeDAO gatewayTypeDAO;
	
	public GatewayTypeDAO getGatewayTypeDAO() {
		return gatewayTypeDAO;
	}

	public void setGatewayTypeDAO(GatewayTypeDAO dao) {
		this.gatewayTypeDAO = dao;
	}
	
	@Override
	public Result<?> search(ISearchCondition searchEntity, int pageSize,
			int currentPage) {
		return gatewayTypeDAO.search(searchEntity, pageSize, currentPage);
	}

	@Override
	public String addGatewayType(GatewayType gatewayType) {
		return gatewayTypeDAO.save(gatewayType);
	}

	@Override
	public GatewayType getGatewayType(String id) {
		return gatewayTypeDAO.get(id);
	}

	@Override
	public boolean editGatewayType(GatewayType gatewayType) {
		gatewayTypeDAO.update(gatewayType);
		return true;
	}

	@Override
	public boolean removeGatewayType(String[] idset) {
		for(String id : idset){
			gatewayTypeDAO.delete(id);
		}
		return true;
	}

	@Override
	public boolean isGatewayTypeNoExists(String no) {
		try{
			GatewayType entity = gatewayTypeDAO.get(no);
			return entity != null;
		}catch(Exception ex){
			return true;
		}
	}

	@Override
	public List<GatewayType> listGatewayType() {
		return gatewayTypeDAO.findAll();
	}
}
