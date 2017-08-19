package com.fengfan.model.enums;

import java.io.Serializable;

public enum UserStatus implements IDicType, Serializable{
	Enabled(1, "正常"), 
	Disabled(0, "销户");
	
	private int id;
	private String name;
	
	UserStatus(int id, String name){
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
