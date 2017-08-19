package com.fengfan.model.enums;

import java.io.Serializable;

public enum BindingType implements IDicType, Serializable{
	BindingRouter(2, "绑定Router"), 
	BindingMac(3, "绑定MAC"),
	DoNotBinding(1, "不绑定");
	
	private int id;
	private String name;
	
	BindingType(int id, String name){
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
