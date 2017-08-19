package com.fengfan.model.enums;

import java.io.Serializable;

public enum YesNoRadio implements IDicType, Serializable{
	NoRadio(0, "否"),
	YesRadio(1, "是");
	
	private int id;
	private String name;
	
	YesNoRadio(int id, String name){
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
