package com.fengfan.model.enums;

import java.io.Serializable;

public enum BillingType implements IDicType, Serializable{
	PostBilling(1, "后付费"), 
	PreBilling(2, "预付费包月/季/年"), 
	MonthlyBilling(3, "预付费包月封顶"), 
	CardBilling(4, "预付费卡用户");
	
	private int id;
	private String name;
	
	BillingType(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
}
