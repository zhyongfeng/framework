package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the customer table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="customer"
 */

public abstract class BaseCustomer  implements Serializable {

	public static String REF = "Customer";
	public static String PROP_CYCLE_CODE = "CycleCode";
	public static String PROP_STATUS_UPDATE_DATE = "StatusUpdateDate";
	public static String PROP_TELEPHONE = "Telephone";
	public static String PROP_LOGIN_NAME = "LoginName";
	public static String PROP_LOT = "Lot";
	public static String PROP_PASSWORD = "Password";
	public static String PROP_ROAMING_FLAG = "RoamingFlag";
	public static String PROP_AVAILABLE_DURATION = "AvailableDuration";
	public static String PROP_GROUP_ID = "GroupId";
	public static String PROP_CUST_GROUP = "CustGroup";
	public static String PROP_BINDING_TYPE = "BindingType";
	public static String PROP_LAST_UPDATE_DATE = "LastUpdateDate";
	public static String PROP_PASSPORT_NUM = "PassportNum";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_PASSPORT_TYPE = "PassportType";
	public static String PROP_MOBILE = "Mobile";
	public static String PROP_ACTIVE_DATE = "ActiveDate";
	public static String PROP_ZIP = "Zip";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_CUST_TYPE = "CustType";
	public static String PROP_BINDING_MAC = "BindingMac";
	public static String PROP_DUE_DATE = "DueDate";
	public static String PROP_REG_DATE = "RegDate";
	public static String PROP_MAX_ONLINE_NUM = "MaxOnlineNum";
	public static String PROP_FAX = "Fax";
	public static String PROP_LOT_ID = "LotId";
	public static String PROP_COUNTRY = "Country";
	public static String PROP_CITY = "City";
	public static String PROP_NAME = "Name";
	public static String PROP_STATUS = "Status";
	public static String PROP_STATE = "State";
	public static String PROP_EMAIL = "Email";
	public static String PROP_ALLOWED_DUE_DATE = "AllowedDueDate";
	public static String PROP_GENDER = "Gender";
	public static String PROP_ADDRESS = "Address";
	public static String PROP_ID = "Id";
	public static String PROP_STATUS_UPDATE_REASON = "StatusUpdateReason";
	public static String PROP_BILLING_TYPE = "BillingType";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseCustomer () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCustomer (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String loginName;
	private java.lang.String password;
	private java.lang.String providerId;
	private java.util.Date dueDate;
	private java.lang.Integer status;
	private java.lang.Integer maxOnlineNum;
	private java.lang.String bindingType;
	private java.lang.String bindingMac;
	private java.lang.String roamingFlag;
	private java.lang.String billingType;
	private java.lang.Integer lotId;
	private java.lang.Integer availableDuration;
	private java.lang.Integer custType;
	private java.lang.String groupId;
	private java.lang.String name;
	private java.lang.String gender;
	private java.lang.String address;
	private java.lang.String country;
	private java.lang.String state;
	private java.lang.String city;
	private java.lang.String zip;
	private java.lang.String telephone;
	private java.lang.String fax;
	private java.lang.String email;
	private java.lang.String mobile;
	private java.lang.String passportType;
	private java.lang.String passportNum;
	private java.lang.String statusUpdateReason;
	private java.util.Date statusUpdateDate;
	private java.util.Date regDate;
	private java.util.Date activeDate;
	private java.util.Date lastUpdateDate;
	private java.lang.Integer allowedDueDate;
	private java.lang.String cycleCode;
	private java.lang.String description;

	// many to one
	private com.fengfan.model.Provider provider;
	private com.fengfan.model.Lot lot;
	private com.fengfan.model.CustGroup custGroup;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="CustId"
     */
	public java.lang.String getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.String id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: LoginName
	 */
	public java.lang.String getLoginName () {
		return loginName;
	}

	/**
	 * Set the value related to the column: LoginName
	 * @param loginName the LoginName value
	 */
	public void setLoginName (java.lang.String loginName) {
		this.loginName = loginName;
	}



	/**
	 * Return the value associated with the column: Password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: Password
	 * @param password the Password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: ProviderId
	 */
	public java.lang.String getProviderId () {
		return providerId;
	}

	/**
	 * Set the value related to the column: ProviderId
	 * @param providerId the ProviderId value
	 */
	public void setProviderId (java.lang.String providerId) {
		this.providerId = providerId;
	}



	/**
	 * Return the value associated with the column: DueDate
	 */
	public java.util.Date getDueDate () {
		return dueDate;
	}

	/**
	 * Set the value related to the column: DueDate
	 * @param dueDate the DueDate value
	 */
	public void setDueDate (java.util.Date dueDate) {
		this.dueDate = dueDate;
	}



	/**
	 * Return the value associated with the column: Status
	 */
	public java.lang.Integer getStatus () {
		return status;
	}

	/**
	 * Set the value related to the column: Status
	 * @param status the Status value
	 */
	public void setStatus (java.lang.Integer status) {
		this.status = status;
	}



	/**
	 * Return the value associated with the column: MaxOnlineNum
	 */
	public java.lang.Integer getMaxOnlineNum () {
		return maxOnlineNum;
	}

	/**
	 * Set the value related to the column: MaxOnlineNum
	 * @param maxOnlineNum the MaxOnlineNum value
	 */
	public void setMaxOnlineNum (java.lang.Integer maxOnlineNum) {
		this.maxOnlineNum = maxOnlineNum;
	}



	/**
	 * Return the value associated with the column: BindingType
	 */
	public java.lang.String getBindingType () {
		return bindingType;
	}

	/**
	 * Set the value related to the column: BindingType
	 * @param bindingType the BindingType value
	 */
	public void setBindingType (java.lang.String bindingType) {
		this.bindingType = bindingType;
	}



	/**
	 * Return the value associated with the column: BindingMac
	 */
	public java.lang.String getBindingMac () {
		return bindingMac;
	}

	/**
	 * Set the value related to the column: BindingMac
	 * @param bindingMac the BindingMac value
	 */
	public void setBindingMac (java.lang.String bindingMac) {
		this.bindingMac = bindingMac;
	}



	/**
	 * Return the value associated with the column: RoamingFlag
	 */
	public java.lang.String getRoamingFlag () {
		return roamingFlag;
	}

	/**
	 * Set the value related to the column: RoamingFlag
	 * @param roamingFlag the RoamingFlag value
	 */
	public void setRoamingFlag (java.lang.String roamingFlag) {
		this.roamingFlag = roamingFlag;
	}



	/**
	 * Return the value associated with the column: BillingType
	 */
	public java.lang.String getBillingType () {
		return billingType;
	}

	/**
	 * Set the value related to the column: BillingType
	 * @param billingType the BillingType value
	 */
	public void setBillingType (java.lang.String billingType) {
		this.billingType = billingType;
	}



	/**
	 * Return the value associated with the column: LotId
	 */
	public java.lang.Integer getLotId () {
		return lotId;
	}

	/**
	 * Set the value related to the column: LotId
	 * @param lotId the LotId value
	 */
	public void setLotId (java.lang.Integer lotId) {
		this.lotId = lotId;
	}



	/**
	 * Return the value associated with the column: AvailableDuration
	 */
	public java.lang.Integer getAvailableDuration () {
		return availableDuration;
	}

	/**
	 * Set the value related to the column: AvailableDuration
	 * @param availableDuration the AvailableDuration value
	 */
	public void setAvailableDuration (java.lang.Integer availableDuration) {
		this.availableDuration = availableDuration;
	}



	/**
	 * Return the value associated with the column: CustType
	 */
	public java.lang.Integer getCustType () {
		return custType;
	}

	/**
	 * Set the value related to the column: CustType
	 * @param custType the CustType value
	 */
	public void setCustType (java.lang.Integer custType) {
		this.custType = custType;
	}



	/**
	 * Return the value associated with the column: GroupId
	 */
	public java.lang.String getGroupId () {
		return groupId;
	}

	/**
	 * Set the value related to the column: GroupId
	 * @param groupId the GroupId value
	 */
	public void setGroupId (java.lang.String groupId) {
		this.groupId = groupId;
	}



	/**
	 * Return the value associated with the column: Name
	 */
	public java.lang.String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: Name
	 * @param name the Name value
	 */
	public void setName (java.lang.String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: Gender
	 */
	public java.lang.String getGender () {
		return gender;
	}

	/**
	 * Set the value related to the column: Gender
	 * @param gender the Gender value
	 */
	public void setGender (java.lang.String gender) {
		this.gender = gender;
	}



	/**
	 * Return the value associated with the column: Address
	 */
	public java.lang.String getAddress () {
		return address;
	}

	/**
	 * Set the value related to the column: Address
	 * @param address the Address value
	 */
	public void setAddress (java.lang.String address) {
		this.address = address;
	}



	/**
	 * Return the value associated with the column: Country
	 */
	public java.lang.String getCountry () {
		return country;
	}

	/**
	 * Set the value related to the column: Country
	 * @param country the Country value
	 */
	public void setCountry (java.lang.String country) {
		this.country = country;
	}



	/**
	 * Return the value associated with the column: State
	 */
	public java.lang.String getState () {
		return state;
	}

	/**
	 * Set the value related to the column: State
	 * @param state the State value
	 */
	public void setState (java.lang.String state) {
		this.state = state;
	}



	/**
	 * Return the value associated with the column: City
	 */
	public java.lang.String getCity () {
		return city;
	}

	/**
	 * Set the value related to the column: City
	 * @param city the City value
	 */
	public void setCity (java.lang.String city) {
		this.city = city;
	}



	/**
	 * Return the value associated with the column: Zip
	 */
	public java.lang.String getZip () {
		return zip;
	}

	/**
	 * Set the value related to the column: Zip
	 * @param zip the Zip value
	 */
	public void setZip (java.lang.String zip) {
		this.zip = zip;
	}



	/**
	 * Return the value associated with the column: Telephone
	 */
	public java.lang.String getTelephone () {
		return telephone;
	}

	/**
	 * Set the value related to the column: Telephone
	 * @param telephone the Telephone value
	 */
	public void setTelephone (java.lang.String telephone) {
		this.telephone = telephone;
	}



	/**
	 * Return the value associated with the column: Fax
	 */
	public java.lang.String getFax () {
		return fax;
	}

	/**
	 * Set the value related to the column: Fax
	 * @param fax the Fax value
	 */
	public void setFax (java.lang.String fax) {
		this.fax = fax;
	}



	/**
	 * Return the value associated with the column: Email
	 */
	public java.lang.String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: Email
	 * @param email the Email value
	 */
	public void setEmail (java.lang.String email) {
		this.email = email;
	}



	/**
	 * Return the value associated with the column: Mobile
	 */
	public java.lang.String getMobile () {
		return mobile;
	}

	/**
	 * Set the value related to the column: Mobile
	 * @param mobile the Mobile value
	 */
	public void setMobile (java.lang.String mobile) {
		this.mobile = mobile;
	}



	/**
	 * Return the value associated with the column: PassportType
	 */
	public java.lang.String getPassportType () {
		return passportType;
	}

	/**
	 * Set the value related to the column: PassportType
	 * @param passportType the PassportType value
	 */
	public void setPassportType (java.lang.String passportType) {
		this.passportType = passportType;
	}



	/**
	 * Return the value associated with the column: PassportNum
	 */
	public java.lang.String getPassportNum () {
		return passportNum;
	}

	/**
	 * Set the value related to the column: PassportNum
	 * @param passportNum the PassportNum value
	 */
	public void setPassportNum (java.lang.String passportNum) {
		this.passportNum = passportNum;
	}



	/**
	 * Return the value associated with the column: StatusUpdateReason
	 */
	public java.lang.String getStatusUpdateReason () {
		return statusUpdateReason;
	}

	/**
	 * Set the value related to the column: StatusUpdateReason
	 * @param statusUpdateReason the StatusUpdateReason value
	 */
	public void setStatusUpdateReason (java.lang.String statusUpdateReason) {
		this.statusUpdateReason = statusUpdateReason;
	}



	/**
	 * Return the value associated with the column: StatusUpdateDate
	 */
	public java.util.Date getStatusUpdateDate () {
		return statusUpdateDate;
	}

	/**
	 * Set the value related to the column: StatusUpdateDate
	 * @param statusUpdateDate the StatusUpdateDate value
	 */
	public void setStatusUpdateDate (java.util.Date statusUpdateDate) {
		this.statusUpdateDate = statusUpdateDate;
	}



	/**
	 * Return the value associated with the column: RegDate
	 */
	public java.util.Date getRegDate () {
		return regDate;
	}

	/**
	 * Set the value related to the column: RegDate
	 * @param regDate the RegDate value
	 */
	public void setRegDate (java.util.Date regDate) {
		this.regDate = regDate;
	}



	/**
	 * Return the value associated with the column: ActiveDate
	 */
	public java.util.Date getActiveDate () {
		return activeDate;
	}

	/**
	 * Set the value related to the column: ActiveDate
	 * @param activeDate the ActiveDate value
	 */
	public void setActiveDate (java.util.Date activeDate) {
		this.activeDate = activeDate;
	}



	/**
	 * Return the value associated with the column: LastUpdateDate
	 */
	public java.util.Date getLastUpdateDate () {
		return lastUpdateDate;
	}

	/**
	 * Set the value related to the column: LastUpdateDate
	 * @param lastUpdateDate the LastUpdateDate value
	 */
	public void setLastUpdateDate (java.util.Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}



	/**
	 * Return the value associated with the column: AllowedDueDate
	 */
	public java.lang.Integer getAllowedDueDate () {
		return allowedDueDate;
	}

	/**
	 * Set the value related to the column: AllowedDueDate
	 * @param allowedDueDate the AllowedDueDate value
	 */
	public void setAllowedDueDate (java.lang.Integer allowedDueDate) {
		this.allowedDueDate = allowedDueDate;
	}



	/**
	 * Return the value associated with the column: CycleCode
	 */
	public java.lang.String getCycleCode () {
		return cycleCode;
	}

	/**
	 * Set the value related to the column: CycleCode
	 * @param cycleCode the CycleCode value
	 */
	public void setCycleCode (java.lang.String cycleCode) {
		this.cycleCode = cycleCode;
	}



	/**
	 * Return the value associated with the column: Description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: Description
	 * @param description the Description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}



	/**
	 * Return the value associated with the column: ProviderId
	 */
	public com.fengfan.model.Provider getProvider () {
		return provider;
	}

	/**
	 * Set the value related to the column: ProviderId
	 * @param provider the ProviderId value
	 */
	public void setProvider (com.fengfan.model.Provider provider) {
		this.provider = provider;
	}



	/**
	 * Return the value associated with the column: LotId
	 */
	public com.fengfan.model.Lot getLot () {
		return lot;
	}

	/**
	 * Set the value related to the column: LotId
	 * @param lot the LotId value
	 */
	public void setLot (com.fengfan.model.Lot lot) {
		this.lot = lot;
	}



	/**
	 * Return the value associated with the column: GroupId
	 */
	public com.fengfan.model.CustGroup getCustGroup () {
		return custGroup;
	}

	/**
	 * Set the value related to the column: GroupId
	 * @param custGroup the GroupId value
	 */
	public void setCustGroup (com.fengfan.model.CustGroup custGroup) {
		this.custGroup = custGroup;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.Customer)) return false;
		else {
			com.fengfan.model.Customer customer = (com.fengfan.model.Customer) obj;
			if (null == this.getId() || null == customer.getId()) return false;
			else return (this.getId().equals(customer.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}