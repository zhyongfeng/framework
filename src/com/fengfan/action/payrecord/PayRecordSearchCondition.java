package com.fengfan.action.payrecord;

import java.util.Date;

import com.fengfan.action.base.AbstractSearchCondition;
import com.fengfan.action.base.ISearchCondition;

public class PayRecordSearchCondition  extends AbstractSearchCondition implements ISearchCondition {
	private String custId;
	private Date startDate;
	private Date endDate;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
