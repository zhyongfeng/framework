package com.fengfan.service;

import com.fengfan.model.Gateway;

public interface IGatewayService extends ISearchService{
	public boolean isGatewayIdExists(String id);
	public String addGateway(Gateway gateway);
	public Gateway getGateway(String id);
	public boolean editGateway(Gateway gateway);
	public boolean removeGateway(String[] idset);
}
