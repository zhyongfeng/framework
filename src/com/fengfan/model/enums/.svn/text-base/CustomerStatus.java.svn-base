package com.fengfan.model.enums;

import java.io.Serializable;

public enum CustomerStatus implements IDicType, Serializable{
	New(1, "新建"), 
	Normal(2, "正常"), 
	Suspended(3, "暂停"),
	Deleted(4, "销户");
	
	private int id;
	private String name;
	
	CustomerStatus(int id, String name){
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
