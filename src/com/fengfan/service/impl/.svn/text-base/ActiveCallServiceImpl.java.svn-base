package com.fengfan.service.impl;

import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.ActiveCall;
import com.fengfan.model.dao.ActiveCallDAO;
import com.fengfan.service.IActiveCallService;

public class ActiveCallServiceImpl implements IActiveCallService {
	private ActiveCallDAO activeCallDAO;
	
	public ActiveCallDAO getActiveCallDAO() {
		return activeCallDAO;
	}

	public void setActiveCallDAO(ActiveCallDAO activeCallDAO) {
		this.activeCallDAO = activeCallDAO;
	}

	@Override
	public List<ActiveCall> listActiveCall() {
		return activeCallDAO.findAll();
	}
	@Override
	public Result<ActiveCall> search(ISearchCondition activeCall, int pageSize, int currentPage){
		return activeCallDAO.search(activeCall, pageSize, currentPage);
	}
	
	@Override
	public ActiveCall getActiveCall(String id) {
		return activeCallDAO.get(id);
	}
}
