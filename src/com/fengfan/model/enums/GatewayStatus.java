package com.fengfan.model.enums;

import java.io.Serializable;


public enum GatewayStatus implements IDicType, Serializable{
	//0—未激活，1—激活，2—停用，缺省为1
	Inactive(0, "未激活"),
	Active(1, "激活"),
	Cancelled(2, "停用");

	private int id;
	private String name;
	
	GatewayStatus(int id, String name){
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
