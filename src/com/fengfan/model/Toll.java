package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseToll;
import com.fengfan.model.enums.BillingType;



public class Toll extends BaseToll {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Toll () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Toll (java.lang.String id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

	public String getBillingTypeAsString(){
		return DicTypeUtils.findByID(BillingType.values(), this.getBillingType()).getName();
	}
	
	public String getProviderAsString(){
		Provider provider = this.getProvider();
		return provider == null ? "" : provider.getProviderName();
	}
}