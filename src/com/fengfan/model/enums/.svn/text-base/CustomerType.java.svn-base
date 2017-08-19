package com.fengfan.model.enums;

import java.io.Serializable;

public enum CustomerType implements IDicType, Serializable{
	Company(1, "公司用户"),Personal(2, "个人用户");
	
	private int id;
	private String name;
	
	CustomerType(int id, String name){
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
