package com.fengfan.action.users;

import com.fengfan.action.base.AbstractSearchCondition;
import com.fengfan.action.base.ISearchCondition;

public class UserSearchCondition extends AbstractSearchCondition implements ISearchCondition {
	public UserSearchCondition(){
	}
	
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	private Integer status; 
}
