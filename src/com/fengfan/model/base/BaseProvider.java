package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="provider"
 */

public abstract class BaseProvider  implements Serializable {

	public static String REF = "Provider";
	public static String PROP_PHONE = "Phone";
	public static String PROP_CONTACT_NAME = "ContactName";
	public static String PROP_PROVIDER_NAME = "ProviderName";
	public static String PROP_FAX = "Fax";
	public static String PROP_LAST_UPDATE_TIME = "LastUpdateTime";
	public static String PROP_STATUS = "Status";
	public static String PROP_EMAIL = "Email";
	public static String PROP_CREATE_TIME = "CreateTime";
	public static String PROP_MAX_USER = "MaxUser";
	public static String PROP_MOBILE = "Mobile";
	public static String PROP_PROVIDER_TYPE = "ProviderType";
	public static String PROP_MAX_GATEWAY = "MaxGateway";
	public static String PROP_ID = "Id";


	// constructors
	public BaseProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseProvider (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String providerName;
	private java.lang.String providerType;
	private java.lang.Integer maxUser;
	private java.lang.Integer maxGateway;
	private java.lang.Integer status;
	private java.lang.String contactName;
	private java.lang.String email;
	private java.lang.String phone;
	private java.lang.String fax;
	private java.lang.String mobile;
	private java.util.Date createTime;
	private java.util.Date lastUpdateTime;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="ProviderId"
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
	 * Return the value associated with the column: ProviderName
	 */
	public java.lang.String getProviderName () {
		return providerName;
	}

	/**
	 * Set the value related to the column: ProviderName
	 * @param providerName the ProviderName value
	 */
	public void setProviderName (java.lang.String providerName) {
		this.providerName = providerName;
	}



	/**
	 * Return the value associated with the column: ProviderType
	 */
	public java.lang.String getProviderType () {
		return providerType;
	}

	/**
	 * Set the value related to the column: ProviderType
	 * @param providerType the ProviderType value
	 */
	public void setProviderType (java.lang.String providerType) {
		this.providerType = providerType;
	}



	/**
	 * Return the value associated with the column: MaxUser
	 */
	public java.lang.Integer getMaxUser () {
		return maxUser;
	}

	/**
	 * Set the value related to the column: MaxUser
	 * @param maxUser the MaxUser value
	 */
	public void setMaxUser (java.lang.Integer maxUser) {
		this.maxUser = maxUser;
	}



	/**
	 * Return the value associated with the column: MaxGateway
	 */
	public java.lang.Integer getMaxGateway () {
		return maxGateway;
	}

	/**
	 * Set the value related to the column: MaxGateway
	 * @param maxGateway the MaxGateway value
	 */
	public void setMaxGateway (java.lang.Integer maxGateway) {
		this.maxGateway = maxGateway;
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
	 * Return the value associated with the column: ContactName
	 */
	public java.lang.String getContactName () {
		return contactName;
	}

	/**
	 * Set the value related to the column: ContactName
	 * @param contactName the ContactName value
	 */
	public void setContactName (java.lang.String contactName) {
		this.contactName = contactName;
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
	 * Return the value associated with the column: Phone
	 */
	public java.lang.String getPhone () {
		return phone;
	}

	/**
	 * Set the value related to the column: Phone
	 * @param phone the Phone value
	 */
	public void setPhone (java.lang.String phone) {
		this.phone = phone;
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
	 * Return the value associated with the column: CreateTime
	 */
	public java.util.Date getCreateTime () {
		return createTime;
	}

	/**
	 * Set the value related to the column: CreateTime
	 * @param createTime the CreateTime value
	 */
	public void setCreateTime (java.util.Date createTime) {
		this.createTime = createTime;
	}



	/**
	 * Return the value associated with the column: LastUpdateTime
	 */
	public java.util.Date getLastUpdateTime () {
		return lastUpdateTime;
	}

	/**
	 * Set the value related to the column: LastUpdateTime
	 * @param lastUpdateTime the LastUpdateTime value
	 */
	public void setLastUpdateTime (java.util.Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.Provider)) return false;
		else {
			com.fengfan.model.Provider provider = (com.fengfan.model.Provider) obj;
			if (null == this.getId() || null == provider.getId()) return false;
			else return (this.getId().equals(provider.getId()));
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