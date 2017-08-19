package com.fengfan.model.enums;

import java.io.Serializable;

public enum Gender implements IDicType, Serializable{
	Male(1, "男"), 
	Female(0, "女");
	
	private int id;
	private String name;
	
	Gender(int id, String name){
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
