package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BasePayRecord;
import com.fengfan.model.enums.PayType;



public class PayRecord extends BasePayRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public PayRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public PayRecord (java.lang.Integer id) {
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
	
	public String getTollAsString(){
		Toll p =  this.getToll();
		return p == null ? "" : p.getTollName();
	}
	
	public String getIsSettledAsString(){
		return this.getIsSettled() ==1 ? "是" : "否";
	}
	
	public String getIsPrintedAsString(){
		return this.getIsPrinted() ==1 ? "是" : "否";
	}
	
	public String getIsInvoicedAsString(){
		return this.getIsInvoiced() ==1 ? "是" : "否";
	}

}