package com.fengfan.model;

import com.fengfan.model.base.BaseUsers;



public class Users extends BaseUsers {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Users () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Users (java.lang.String username) {
		super(username);
	}

	/**
	 * Constructor for required fields
	 */
	public Users (
		java.lang.String username,
		java.lang.String password,
		java.lang.Integer enabled) {

		super (
			username,
			password,
			enabled);
	}

/*[CONSTRUCTOR MARKER END]*/

	public String getProviderAsString(){
		try{
			Provider p = this.getProvider();
			return p == null ? "" : p.getProviderName();
		}catch(Exception ex){
			return "";
		}
	}
	
	public String getEnabledAsString(){
		return this.getEnabled() == 1 ? "是" : "否";
	}

}