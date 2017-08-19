package com.fengfan.service;

import java.util.Date;
import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.model.PayRecord;

public interface IPayRecordService extends ISearchService{
	public List<PayRecord> listPayRecord();
	public Integer addPayRecord(PayRecord payRecord);
	public PayRecord getPayRecord(int id);
	public boolean editPayRecord(PayRecord payRecord);
	public boolean removePayRecord(Integer[] idset);
	public String getSumofTotalAmount(ISearchCondition searchCondition,
			int pageSize, int currentPage);
	public void batchUpdatePayRecord(String providerId,Date startDate,Date endDate);
}
