package com.fengfan.model;

import com.fengfan.action.base.DicTypeUtils;
import com.fengfan.model.base.BaseCustomer;
import com.fengfan.model.enums.BillingType;
import com.fengfan.model.enums.BindingType;
import com.fengfan.model.enums.CustomerStatus;
import com.fengfan.model.enums.CustomerType;
import com.fengfan.model.enums.Gender;
import com.fengfan.model.enums.RoamingFlag;



public class Customer extends BaseCustomer {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Customer () {
		super();
		setAllowedDueDate(0);
		setRoamingFlag(""+RoamingFlag.Forbiden.getId());
		setBillingType(""+BillingType.PreBilling.getId());
		setMaxOnlineNum(1);
	}

	/**
	 * Constructor for primary key
	 */
	public Customer (java.lang.String id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/

	public String getStatusAsString(){
		return DicTypeUtils.findByID(CustomerStatus.values(), this.getStatus()).getName();
	}

	public String getRoamingFlagAsString(){
		return DicTypeUtils.findByID(RoamingFlag.values(), this.getRoamingFlag()).getName();
	}
	
	public String getBillingTypeAsString(){
		return DicTypeUtils.findByID(BillingType.values(), this.getBillingType()).getName();
	}
	
	public String getCustomerTypeAsString(){
		return DicTypeUtils.findByID(CustomerType.values(), this.getCustType()).getName();
	}
	
	public String getCustomerStatusAsString(){
		return DicTypeUtils.findByID(CustomerStatus.values(), this.getStatus()).getName();
	}
	
	
	public String getGenderAsString(){
		return DicTypeUtils.findByID(Gender.values(), this.getGender()).getName();
	}
	
	
	public String getMaxOnlineNumAsString(){
		Integer maxOnlineNum = getMaxOnlineNum();
		if(maxOnlineNum == null || maxOnlineNum <= 0){
			return "不限制";
		}
		return "" + maxOnlineNum;
	}
	
	public String getBindingTypeAsString(){
		return DicTypeUtils.findByID(BindingType.values(), this.getBillingType()).getName();
	}
	
	public String getProviderAsString(){
		Provider p =  this.getProvider();
		return p == null ? "" : p.getProviderName();
	}
	
	public String getGroupAsString(){
		CustGroup group = this.getCustGroup();
		return group == null ? "" : group.getId();
	}
	

	public String getLotAsString(){
		Lot lot =  this.getLot();
		return lot == null ? "" : String.valueOf(lot.getId());
	}
}