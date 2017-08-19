package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseSettleRecord;
import com.fengfan.model.enums.PayType;



public class SettleRecord extends BaseSettleRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public SettleRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public SettleRecord (java.lang.Integer id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/
	public String getPayTypeAsString(){
		return DicTypeUtils.findByID(PayType.values(), this.getPayType()).getName();
	}


	public String getProviderAsString(){
		Provider p =  this.getProvider();
		return p == null ? "" : p.getProviderName();
	}
}