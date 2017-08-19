/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:07:53 PM
 */
package com.fengfan.service.impl;

import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.SettleRecord;
import com.fengfan.model.dao.SettleRecordDAO;
import com.fengfan.service.ISettleRecordService;

public class SettleRecordServiceImpl implements ISettleRecordService {
	private SettleRecordDAO settleRecordDAO;

	public SettleRecordDAO getSettleRecordDAO() {
		return settleRecordDAO;
	}

	public void setSettleRecordDAO(SettleRecordDAO settleRecordDAO) {
		this.settleRecordDAO = settleRecordDAO;
	}

	public Integer addSettleRecord(SettleRecord settleRecord) {
		return settleRecordDAO.save(settleRecord);
	}

	@Override
	public boolean editSettleRecord(SettleRecord provider) {
		settleRecordDAO.update(provider);
		return true;
	}

	@Override
	public boolean removeSettleRecord(Integer[] idset) {
		for(Integer id : idset){
			settleRecordDAO.delete(id);
		}
		return true;
	}

	@Override
	public SettleRecord getSettleRecord(int id){
		return  settleRecordDAO.get(id);
	}

	@Override
	public Result<SettleRecord> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return settleRecordDAO.search(searchCondition, pageSize, currentPage);
	}

	@Override
	public List<SettleRecord> listSettleRecord() {
		return settleRecordDAO.findAll();
	}

}
