package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the toll table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="toll"
 */

public abstract class BaseToll  implements Serializable {

	public static String REF = "Toll";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_PERIOD_BASIC_RATE = "PeriodBasicRate";
	public static String PROP_MONTH_AMOUNT = "MonthAmount";
	public static String PROP_TOLL_NAME = "TollName";
	public static String PROP_SETUP_FEE = "SetupFee";
	public static String PROP_END_DATE = "EndDate";
	public static String PROP_START_DATE = "StartDate";
	public static String PROP_DURATION_AMOUNT = "DurationAmount";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_RATING_PERIOD = "RatingPeriod";
	public static String PROP_ID = "Id";
	public static String PROP_BILLING_TYPE = "BillingType";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseToll () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseToll (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String tollName;
	private java.lang.String description;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private java.lang.Double setupFee;
	private java.lang.Double periodBasicRate;
	private java.lang.Integer billingType;
	private java.lang.Integer monthAmount;
	private java.lang.Integer durationAmount;
	private java.lang.Integer ratingPeriod;
	private java.lang.String providerId;

	// many to one
	private com.fengfan.model.Provider provider;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="TollId"
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
	 * Return the value associated with the column: TollName
	 */
	public java.lang.String getTollName () {
		return tollName;
	}

	/**
	 * Set the value related to the column: TollName
	 * @param tollName the TollName value
	 */
	public void setTollName (java.lang.String tollName) {
		this.tollName = tollName;
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
	 * Return the value associated with the column: StartDate
	 */
	public java.util.Date getStartDate () {
		return startDate;
	}

	/**
	 * Set the value related to the column: StartDate
	 * @param startDate the StartDate value
	 */
	public void setStartDate (java.util.Date startDate) {
		this.startDate = startDate;
	}



	/**
	 * Return the value associated with the column: EndDate
	 */
	public java.util.Date getEndDate () {
		return endDate;
	}

	/**
	 * Set the value related to the column: EndDate
	 * @param endDate the EndDate value
	 */
	public void setEndDate (java.util.Date endDate) {
		this.endDate = endDate;
	}



	/**
	 * Return the value associated with the column: SetupFee
	 */
	public java.lang.Double getSetupFee () {
		return setupFee;
	}

	/**
	 * Set the value related to the column: SetupFee
	 * @param setupFee the SetupFee value
	 */
	public void setSetupFee (java.lang.Double setupFee) {
		this.setupFee = setupFee;
	}



	/**
	 * Return the value associated with the column: PeriodBasicRate
	 */
	public java.lang.Double getPeriodBasicRate () {
		return periodBasicRate;
	}

	/**
	 * Set the value related to the column: PeriodBasicRate
	 * @param periodBasicRate the PeriodBasicRate value
	 */
	public void setPeriodBasicRate (java.lang.Double periodBasicRate) {
		this.periodBasicRate = periodBasicRate;
	}



	/**
	 * Return the value associated with the column: BillingType
	 */
	public java.lang.Integer getBillingType () {
		return billingType;
	}

	/**
	 * Set the value related to the column: BillingType
	 * @param billingType the BillingType value
	 */
	public void setBillingType (java.lang.Integer billingType) {
		this.billingType = billingType;
	}



	/**
	 * Return the value associated with the column: MonthAmount
	 */
	public java.lang.Integer getMonthAmount () {
		return monthAmount;
	}

	/**
	 * Set the value related to the column: MonthAmount
	 * @param monthAmount the MonthAmount value
	 */
	public void setMonthAmount (java.lang.Integer monthAmount) {
		this.monthAmount = monthAmount;
	}



	/**
	 * Return the value associated with the column: DurationAmount
	 */
	public java.lang.Integer getDurationAmount () {
		return durationAmount;
	}

	/**
	 * Set the value related to the column: DurationAmount
	 * @param durationAmount the DurationAmount value
	 */
	public void setDurationAmount (java.lang.Integer durationAmount) {
		this.durationAmount = durationAmount;
	}



	/**
	 * Return the value associated with the column: RatingPeriod
	 */
	public java.lang.Integer getRatingPeriod () {
		return ratingPeriod;
	}

	/**
	 * Set the value related to the column: RatingPeriod
	 * @param ratingPeriod the RatingPeriod value
	 */
	public void setRatingPeriod (java.lang.Integer ratingPeriod) {
		this.ratingPeriod = ratingPeriod;
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
		if (!(obj instanceof com.fengfan.model.Toll)) return false;
		else {
			com.fengfan.model.Toll toll = (com.fengfan.model.Toll) obj;
			if (null == this.getId() || null == toll.getId()) return false;
			else return (this.getId().equals(toll.getId()));
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