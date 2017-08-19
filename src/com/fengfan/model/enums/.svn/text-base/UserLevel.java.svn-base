package com.fengfan.model.enums;

import java.io.Serializable;

public enum UserLevel implements IDicType, Serializable{
	Customer(0, "普通用户"),
	User(1, "系统用户");
	
	private int id;
	private String name;
	
	UserLevel(int id, String name){
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
