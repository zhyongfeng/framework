package com.fengfan.model.enums;

import java.io.Serializable;

public enum PayType implements IDicType, Serializable{
	Ca(1, "现金"), 
	Ch(2, "支票");
	
	private int id;
	private String name;
	
	PayType(int id, String name){
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
