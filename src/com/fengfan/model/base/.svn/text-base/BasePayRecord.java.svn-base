package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the pay_record table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="pay_record"
 */

public abstract class BasePayRecord  implements Serializable {

	public static String REF = "PayRecord";
	public static String PROP_AMOUNT = "Amount";
	public static String PROP_IS_SETTLED = "IsSettled";
	public static String PROP_TOLL = "Toll";
	public static String PROP_UPDATE_TIME = "UpdateTime";
	public static String PROP_CUST_ID = "CustId";
	public static String PROP_TOLL_ID = "TollId";
	public static String PROP_IS_INVOICED = "IsInvoiced";
	public static String PROP_IS_PRINTED = "IsPrinted";
	public static String PROP_UPDATE_CONTENT = "UpdateContent";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_PRICE = "Price";
	public static String PROP_INVOICE_NAME = "InvoiceName";
	public static String PROP_ID = "Id";
	public static String PROP_DISCOUNT = "Discount";
	public static String PROP_TOTAL_AMOUNT = "TotalAmount";
	public static String PROP_REMARK = "Remark";
	public static String PROP_PROVIDER = "Provider";
	public static String PROP_UPDATE_REASON = "UpdateReason";
	public static String PROP_PAY_DATE = "PayDate";
	public static String PROP_PAY_TYPE = "PayType";
	public static String PROP_UPDATE_USER = "UpdateUser";


	// constructors
	public BasePayRecord () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePayRecord (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String custId;
	private java.lang.String providerId;
	private java.lang.String tollId;
	private java.lang.Double price;
	private java.lang.Integer amount;
	private java.lang.Integer discount;
	private java.lang.Double totalAmount;
	private java.util.Date payDate;
	private java.lang.Integer payType;
	private java.lang.String invoiceName;
	private java.lang.Integer isInvoiced;
	private java.lang.Integer isSettled;
	private java.lang.Integer isPrinted;
	private java.lang.String remark;
	private java.lang.String updateUser;
	private java.util.Date updateTime;
	private java.lang.String updateContent;
	private java.lang.String updateReason;

	// many to one
	private com.fengfan.model.Provider provider;
	private com.fengfan.model.Toll toll;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="PayId"
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
	 * Return the value associated with the column: CustId
	 */
	public java.lang.String getCustId () {
		return custId;
	}

	/**
	 * Set the value related to the column: CustId
	 * @param custId the CustId value
	 */
	public void setCustId (java.lang.String custId) {
		this.custId = custId;
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
	 * Return the value associated with the column: TollId
	 */
	public java.lang.String getTollId () {
		return tollId;
	}

	/**
	 * Set the value related to the column: TollId
	 * @param tollId the TollId value
	 */
	public void setTollId (java.lang.String tollId) {
		this.tollId = tollId;
	}



	/**
	 * Return the value associated with the column: Price
	 */
	public java.lang.Double getPrice () {
		return price;
	}

	/**
	 * Set the value related to the column: Price
	 * @param price the Price value
	 */
	public void setPrice (java.lang.Double price) {
		this.price = price;
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
	 * Return the value associated with the column: Discount
	 */
	public java.lang.Integer getDiscount () {
		return discount;
	}

	/**
	 * Set the value related to the column: Discount
	 * @param discount the Discount value
	 */
	public void setDiscount (java.lang.Integer discount) {
		this.discount = discount;
	}



	/**
	 * Return the value associated with the column: TotalAmount
	 */
	public java.lang.Double getTotalAmount () {
		return totalAmount;
	}

	/**
	 * Set the value related to the column: TotalAmount
	 * @param totalAmount the TotalAmount value
	 */
	public void setTotalAmount (java.lang.Double totalAmount) {
		this.totalAmount = totalAmount;
	}



	/**
	 * Return the value associated with the column: PayDate
	 */
	public java.util.Date getPayDate () {
		return payDate;
	}

	/**
	 * Set the value related to the column: PayDate
	 * @param payDate the PayDate value
	 */
	public void setPayDate (java.util.Date payDate) {
		this.payDate = payDate;
	}



	/**
	 * Return the value associated with the column: PayType
	 */
	public java.lang.Integer getPayType () {
		return payType;
	}

	/**
	 * Set the value related to the column: PayType
	 * @param payType the PayType value
	 */
	public void setPayType (java.lang.Integer payType) {
		this.payType = payType;
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
	 * Return the value associated with the column: IsSettled
	 */
	public java.lang.Integer getIsSettled () {
		return isSettled;
	}

	/**
	 * Set the value related to the column: IsSettled
	 * @param isSettled the IsSettled value
	 */
	public void setIsSettled (java.lang.Integer isSettled) {
		this.isSettled = isSettled;
	}



	/**
	 * Return the value associated with the column: IsPrinted
	 */
	public java.lang.Integer getIsPrinted () {
		return isPrinted;
	}

	/**
	 * Set the value related to the column: IsPrinted
	 * @param isPrinted the IsPrinted value
	 */
	public void setIsPrinted (java.lang.Integer isPrinted) {
		this.isPrinted = isPrinted;
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
	 * Return the value associated with the column: UpdateUser
	 */
	public java.lang.String getUpdateUser () {
		return updateUser;
	}

	/**
	 * Set the value related to the column: UpdateUser
	 * @param updateUser the UpdateUser value
	 */
	public void setUpdateUser (java.lang.String updateUser) {
		this.updateUser = updateUser;
	}



	/**
	 * Return the value associated with the column: UpdateTime
	 */
	public java.util.Date getUpdateTime () {
		return updateTime;
	}

	/**
	 * Set the value related to the column: UpdateTime
	 * @param updateTime the UpdateTime value
	 */
	public void setUpdateTime (java.util.Date updateTime) {
		this.updateTime = updateTime;
	}



	/**
	 * Return the value associated with the column: UpdateContent
	 */
	public java.lang.String getUpdateContent () {
		return updateContent;
	}

	/**
	 * Set the value related to the column: UpdateContent
	 * @param updateContent the UpdateContent value
	 */
	public void setUpdateContent (java.lang.String updateContent) {
		this.updateContent = updateContent;
	}



	/**
	 * Return the value associated with the column: UpdateReason
	 */
	public java.lang.String getUpdateReason () {
		return updateReason;
	}

	/**
	 * Set the value related to the column: UpdateReason
	 * @param updateReason the UpdateReason value
	 */
	public void setUpdateReason (java.lang.String updateReason) {
		this.updateReason = updateReason;
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
	 * Return the value associated with the column: TollId
	 */
	public com.fengfan.model.Toll getToll () {
		return toll;
	}

	/**
	 * Set the value related to the column: TollId
	 * @param toll the TollId value
	 */
	public void setToll (com.fengfan.model.Toll toll) {
		this.toll = toll;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.PayRecord)) return false;
		else {
			com.fengfan.model.PayRecord payRecord = (com.fengfan.model.PayRecord) obj;
			if (null == this.getId() || null == payRecord.getId()) return false;
			else return (this.getId().equals(payRecord.getId()));
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