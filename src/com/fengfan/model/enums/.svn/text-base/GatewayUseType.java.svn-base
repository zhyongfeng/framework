package com.fengfan.model.enums;

import java.io.Serializable;


public enum GatewayUseType implements IDicType, Serializable{
	Forbiden(0, "不允许"),
	Allowed(1, "允许");

	private int id;
	private String name;
	
	GatewayUseType(int id, String name){
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
