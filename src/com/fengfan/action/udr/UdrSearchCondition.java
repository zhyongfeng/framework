package com.fengfan.action.udr;

import java.util.Date;

import com.fengfan.action.base.AbstractSearchCondition;
import com.fengfan.action.base.ISearchCondition;

public class UdrSearchCondition extends AbstractSearchCondition implements ISearchCondition {
	private String custName;
	private Date startDate;
	private Date endDate;
	private String nasId;
	private String callingId;
	private String framedIp;
	private String terminateCause;
	private String errType;
	
	public String getNasId() {
		return nasId;
	}
	public void setNasId(String nasId) {
		this.nasId = nasId;
	}
	public String getCallingId() {
		return callingId;
	}
	public void setCallingId(String callingId) {
		this.callingId = callingId;
	}
	public String getFramedIp() {
		return framedIp;
	}
	public void setFramedIp(String framedIp) {
		this.framedIp = framedIp;
	}
	public String getTerminateCause() {
		return terminateCause;
	}
	public void setTerminateCause(String terminateCause) {
		this.terminateCause = terminateCause;
	}
	public String getErrType() {
		return errType;
	}
	public void setErrType(String errType) {
		this.errType = errType;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
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
