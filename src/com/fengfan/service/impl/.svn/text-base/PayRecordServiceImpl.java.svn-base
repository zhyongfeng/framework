package com.fengfan.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.PayRecord;
import com.fengfan.model.dao.PayRecordDAO;
import com.fengfan.service.IPayRecordService;

public class PayRecordServiceImpl implements IPayRecordService {
	private PayRecordDAO payRecordDAO;
	private JdbcTemplate jdbcTemplate;
	
	public static final String updatePayRecordSql =
        "update pay_record set isSettled = 1 where providerId = ? and payDate >= ? and payDate <= ?";
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public PayRecordDAO getPayRecordDAO() {
		return payRecordDAO;
	}

	public void setPayRecordDAO(PayRecordDAO dao) {
		this.payRecordDAO = dao;
	}

	@Override
	public Integer addPayRecord(PayRecord payRecord) {
		return payRecordDAO.save(payRecord);
	}

	@Override
	public boolean editPayRecord(PayRecord provider) {
		payRecordDAO.update(provider);
		return true;
	}

	@Override
	public boolean removePayRecord(Integer[] idset) {
		for (Integer id : idset) {
			payRecordDAO.delete(id);
		}
		return true;
	}

	@Override
	public PayRecord getPayRecord(int id) {
		return payRecordDAO.get(id);
	}

	@Override
	public Result<PayRecord> search(ISearchCondition searchCondition,
			int pageSize, int currentPage) {
		return payRecordDAO.search(searchCondition, pageSize, currentPage);
	}

	public String getSumofTotalAmount(ISearchCondition searchCondition,
			int pageSize, int currentPage) {
		return payRecordDAO.getSumofTotalAmount(searchCondition, pageSize,
				currentPage);
	}
	
	public void batchUpdatePayRecord(String providerId, Date startDate, Date endDate){
		try {
			getJdbcTemplate().update(updatePayRecordSql, providerId, startDate, endDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<PayRecord> listPayRecord() {
		return payRecordDAO.findAll();
	}

}
