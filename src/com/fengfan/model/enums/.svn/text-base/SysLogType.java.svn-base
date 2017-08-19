package com.fengfan.model.enums;

import java.io.Serializable;

public enum SysLogType implements IDicType, Serializable{
	Add(1, "增加"), 
	Update(2, "修改"),
	Delete(3, "删除");
	
	private int id;
	private String name;
	
	SysLogType(int id, String name){
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
