package com.fengfan.service.impl;

import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.SysLog;
import com.fengfan.model.dao.SysLogDAO;
import com.fengfan.service.ISysLogService;

public class SysLogServiceImpl implements ISysLogService {
	private SysLogDAO sysLogDAO;
	
	public SysLogDAO getSysLogDAO() {
		return sysLogDAO;
	}

	public void setSysLogDAO(SysLogDAO sysLogDAO) {
		this.sysLogDAO = sysLogDAO;
	}

	public List<SysLog> listSysLog() {
		return sysLogDAO.findAll();
	}
	
	public Result search(ISearchCondition sysLog, int pageSize, int currentPage){
		return sysLogDAO.search(sysLog, pageSize, currentPage);
	}
	
	public void saveOrUpdate(SysLog sysLog){
		sysLogDAO.saveOrUpdate(sysLog);
	}
	
	public void save(SysLog sysLog){
		sysLogDAO.save(sysLog);
	}

	@Override
	public SysLog getSysLog(int id) {
		return sysLogDAO.get(id);
	}
}
