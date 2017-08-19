package com.fengfan.model.enums;

import java.io.Serializable;

public enum UdrType implements IDicType, Serializable{
	PostBilling(0, "正常话单"), 
	PreBilling(1, "无计费结束包话单");
	
	private int id;
	private String name;
	
	UdrType(int id, String name){
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
