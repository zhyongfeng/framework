package com.fengfan.model.enums;

import java.io.Serializable;

public enum RoamingFlag implements IDicType, Serializable{
	All(1, "允许所有漫游"), 
	InnserRadius(2, "仅内部radius漫游"), 
	Forbiden(3, "不能漫游");
	
	private int id;
	private String name;
	
	RoamingFlag(int id, String name){
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