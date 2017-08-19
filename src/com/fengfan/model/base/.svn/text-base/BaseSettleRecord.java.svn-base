package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the settle_record table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="settle_record"
 */

public abstract class BaseSettleRecord  implements Serializable {

	public static String REF = "SettleRecord";
	public static String PROP_TOTAL_FEE = "TotalFee";
	public static String PROP_MGT_FEE = "MgtFee";
	public static String PROP_ACTUAL_FEE = "ActualFee";
	public static String PROP_IS_INVOICED = "IsInvoiced";
	public static String PROP_EXEC_USER = "ExecUser";
	public static String PROP_END_DATE = "EndDate";
	public static String PROP_START_DATE = "StartDate";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_SETTLE_DATE = "SettleDate";
	public static String PROP_INVOICE_NAME = "InvoiceName";
	public static String PROP_ID = "Id";
	public static String PROP_MARKET_FEE = "MarketFee";
	public static String PROP_REMARK = "Remark";
	public static String PROP_PROVIDER = "Provider";
	public static String PROP_PAY_TYPE = "PayType";


	// constructors
	public BaseSettleRecord () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSettleRecord (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String providerId;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private java.util.Date settleDate;
	private java.lang.Double totalFee;
	private java.lang.Double marketFee;
	private java.lang.Double mgtFee;
	private java.lang.Double actualFee;
	private java.lang.String payType;
	private java.lang.Integer isInvoiced;
	private java.lang.String invoiceName;
	private java.lang.String remark;
	private java.lang.String execUser;

	// many to one
	private com.fengfan.model.Provider provider;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="SettleId"
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
	 * Return the value associated with the column: SettleDate
	 */
	public java.util.Date getSettleDate () {
		return settleDate;
	}

	/**
	 * Set the value related to the column: SettleDate
	 * @param settleDate the SettleDate value
	 */
	public void setSettleDate (java.util.Date settleDate) {
		this.settleDate = settleDate;
	}



	/**
	 * Return the value associated with the column: TotalFee
	 */
	public java.lang.Double getTotalFee () {
		return totalFee;
	}

	/**
	 * Set the value related to the column: TotalFee
	 * @param totalFee the TotalFee value
	 */
	public void setTotalFee (java.lang.Double totalFee) {
		this.totalFee = totalFee;
	}



	/**
	 * Return the value associated with the column: MarketFee
	 */
	public java.lang.Double getMarketFee () {
		return marketFee;
	}

	/**
	 * Set the value related to the column: MarketFee
	 * @param marketFee the MarketFee value
	 */
	public void setMarketFee (java.lang.Double marketFee) {
		this.marketFee = marketFee;
	}



	/**
	 * Return the value associated with the column: MgtFee
	 */
	public java.lang.Double getMgtFee () {
		return mgtFee;
	}

	/**
	 * Set the value related to the column: MgtFee
	 * @param mgtFee the MgtFee value
	 */
	public void setMgtFee (java.lang.Double mgtFee) {
		this.mgtFee = mgtFee;
	}



	/**
	 * Return the value associated with the column: ActualFee
	 */
	public java.lang.Double getActualFee () {
		return actualFee;
	}

	/**
	 * Set the value related to the column: ActualFee
	 * @param actualFee the ActualFee value
	 */
	public void setActualFee (java.lang.Double actualFee) {
		this.actualFee = actualFee;
	}



	/**
	 * Return the value associated with the column: PayType
	 */
	public java.lang.String getPayType () {
		return payType;
	}

	/**
	 * Set the value related to the column: PayType
	 * @param payType the PayType value
	 */
	public void setPayType (java.lang.String payType) {
		this.payType = payType;
	}



	/**
	 * Return the value associated with the column: IsInvoiced
	 */
	public java.lang.Integer getIsInvoiced () {
		return isInvoiced;
	}

	/**
	 * Set the value related to the column: IsInvoiced
	 * @param isInvoiced the IsInvoiced value
	 */
	public void setIsInvoiced (java.lang.Integer isInvoiced) {
		this.isInvoiced = isInvoiced;
	}



	/**
	 * Return the value associated with the column: InvoiceName
	 */
	public java.lang.String getInvoiceName () {
		return invoiceName;
	}

	/**
	 * Set the value related to the column: InvoiceName
	 * @param invoiceName the InvoiceName value
	 */
	public void setInvoiceName (java.lang.String invoiceName) {
		this.invoiceName = invoiceName;
	}



	/**
	 * Return the value associated with the column: Remark
	 */
	public java.lang.String getRemark () {
		return remark;
	}

	/**
	 * Set the value related to the column: Remark
	 * @param remark the Remark value
	 */
	public void setRemark (java.lang.String remark) {
		this.remark = remark;
	}



	/**
	 * Return the value associated with the column: ExecUser
	 */
	public java.lang.String getExecUser () {
		return execUser;
	}

	/**
	 * Set the value related to the column: ExecUser
	 * @param execUser the ExecUser value
	 */
	public void setExecUser (java.lang.String execUser) {
		this.execUser = execUser;
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
		if (!(obj instanceof com.fengfan.model.SettleRecord)) return false;
		else {
			com.fengfan.model.SettleRecord settleRecord = (com.fengfan.model.SettleRecord) obj;
			if (null == this.getId() || null == settleRecord.getId()) return false;
			else return (this.getId().equals(settleRecord.getId()));
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