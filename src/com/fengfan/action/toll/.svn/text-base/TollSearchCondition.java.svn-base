package com.fengfan.action.toll;

import java.util.Date;

import com.fengfan.action.base.AbstractSearchCondition;
import com.fengfan.action.base.ISearchCondition;

public class TollSearchCondition  extends AbstractSearchCondition implements ISearchCondition {
	
	/***
	 * 查询条件：TollCode， TollName（模糊）， 时间段（在此时间段内有效的资费），

provideCode，BillingType。列表显示：TollCode， TollName, providerCode, Description, startDate, endDate, BillingType , PeriodNasicRate。
	 * 
	 * 
	 */
	public TollSearchCondition(){
	}
	
	private String id;
	private String tollName;
	private Date startDate;
	private Date endDate;
	private Integer billingType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTollName() {
		return tollName;
	}
	public void setTollName(String tollName) {
		this.tollName = tollName;
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
	public Integer getBillingType() {
		return billingType;
	}
	public void setBillingType(Integer billingType) {
		this.billingType = billingType;
	}

	
}
