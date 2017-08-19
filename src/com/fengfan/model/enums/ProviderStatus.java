package com.fengfan.model.enums;

import java.io.Serializable;


public enum ProviderStatus implements IDicType, Serializable{
	Normal(1, "正常"),
	Closed(2, "暂关"),
	Cancelled(3, "销户");

	private int id;
	private String name;
	
	ProviderStatus(int id, String name){
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
