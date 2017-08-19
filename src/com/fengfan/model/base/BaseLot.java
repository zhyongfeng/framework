package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the lot table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="lot"
 */

public abstract class BaseLot  implements Serializable {

	public static String REF = "Lot";
	public static String PROP_STATUS = "Status";
	public static String PROP_ISSUE_DATE = "IssueDate";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_VALUE = "Value";
	public static String PROP_AMOUNT = "Amount";
	public static String PROP_DURATION = "Duration";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_EXP_DATE = "ExpDate";
	public static String PROP_ID = "Id";
	public static String PROP_ACTIVE_DAYS = "ActiveDays";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseLot () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLot (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String providerId;
	private java.lang.Integer amount;
	private java.lang.Integer value;
	private java.lang.Integer duration;
	private java.util.Date issueDate;
	private java.util.Date expDate;
	private java.lang.Integer activeDays;
	private java.lang.String status;
	private java.lang.String description;

	// many to one
	private com.fengfan.model.Provider provider;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="LotId"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
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
	 * Return the value associated with the column: Amount
	 */
	public java.lang.Integer getAmount () {
		return amount;
	}

	/**
	 * Set the value related to the column: Amount
	 * @param amount the Amount value
	 */
	public void setAmount (java.lang.Integer amount) {
		this.amount = amount;
	}



	/**
	 * Return the value associated with the column: Value
	 */
	public java.lang.Integer getValue () {
		return value;
	}

	/**
	 * Set the value related to the column: Value
	 * @param value the Value value
	 */
	public void setValue (java.lang.Integer value) {
		this.value = value;
	}



	/**
	 * Return the value associated with the column: Duration
	 */
	public java.lang.Integer getDuration () {
		return duration;
	}

	/**
	 * Set the value related to the column: Duration
	 * @param duration the Duration value
	 */
	public void setDuration (java.lang.Integer duration) {
		this.duration = duration;
	}



	/**
	 * Return the value associated with the column: IssueDate
	 */
	public java.util.Date getIssueDate () {
		return issueDate;
	}

	/**
	 * Set the value related to the column: IssueDate
	 * @param issueDate the IssueDate value
	 */
	public void setIssueDate (java.util.Date issueDate) {
		this.issueDate = issueDate;
	}



	/**
	 * Return the value associated with the column: ExpDate
	 */
	public java.util.Date getExpDate () {
		return expDate;
	}

	/**
	 * Set the value related to the column: ExpDate
	 * @param expDate the ExpDate value
	 */
	public void setExpDate (java.util.Date expDate) {
		this.expDate = expDate;
	}



	/**
	 * Return the value associated with the column: ActiveDays
	 */
	public java.lang.Integer getActiveDays () {
		return activeDays;
	}

	/**
	 * Set the value related to the column: ActiveDays
	 * @param activeDays the ActiveDays value
	 */
	public void setActiveDays (java.lang.Integer activeDays) {
		this.activeDays = activeDays;
	}



	/**
	 * Return the value associated with the column: Status
	 */
	public java.lang.String getStatus () {
		return status;
	}

	/**
	 * Set the value related to the column: Status
	 * @param status the Status value
	 */
	public void setStatus (java.lang.String status) {
		this.status = status;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.Lot)) return false;
		else {
			com.fengfan.model.Lot lot = (com.fengfan.model.Lot) obj;
			if (null == this.getId() || null == lot.getId()) return false;
			else return (this.getId().equals(lot.getId()));
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