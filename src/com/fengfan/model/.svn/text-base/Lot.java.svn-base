package com.fengfan.model;

import com.fengfan.model.base.BaseLot;



public class Lot extends BaseLot {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Lot () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Lot (java.lang.Integer id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

	public String getProviderAsString(){
		Provider p =  this.getProvider();
		return p == null ? "" : p.getProviderName();
	}

}