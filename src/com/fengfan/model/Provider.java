package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseProvider;
import com.fengfan.model.enums.ProviderStatus;
import com.fengfan.model.enums.ProviderType;



public class Provider extends BaseProvider {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Provider () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Provider (java.lang.String id) {
		super(id);
	}
	
	public String getProviderTypeAsString(){
		return DicTypeUtils.findByID(ProviderType.values(), this.getProviderType()).getName();
	}

	public String getStatusAsString(){
		return DicTypeUtils.findByID(ProviderStatus.values(), this.getStatus()).getName();
	}
	
	public String getMaxUserAsString(){
		return this.getMaxUser() < 0 ? "不限制" : "" + this.getMaxUser();
	}
	
	public String getMaxGatewayAsString(){
		return this.getMaxGateway() < 0 ? "不限制" : "" + this.getMaxGateway();
	}
	
/*[CONSTRUCTOR MARKER END]*/


}