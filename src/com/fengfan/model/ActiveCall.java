package com.fengfan.model;

import com.fengfan.model.base.BaseActiveCall;



public class ActiveCall extends BaseActiveCall {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ActiveCall () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ActiveCall (java.lang.String id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

	public String getProviderAsString(){
		Provider p =  this.getProvider();
		return p == null ? "" : p.getProviderName();
	}

}