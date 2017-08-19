package com.fengfan.model;

import com.fengfan.model.base.BaseUdr;



public class Udr extends BaseUdr {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Udr () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Udr (java.lang.Integer id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

	public String getProviderAsString(){
		Provider p =  this.getProvider();
		return p == null ? "" : p.getProviderName();
	}

}