package com.fengfan.model.enums;

import java.io.Serializable;


public enum ProviderType implements Serializable, IDicType{
	Company(1, "公司"),Personal(2, "个人");
	
	private int id;
	private String name;
	
	ProviderType(int id, String name){
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
