package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the active_call table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="active_call"
 */

public abstract class BaseActiveCall  implements Serializable {

	public static String REF = "ActiveCall";
	public static String PROP_PROXY_STATE = "ProxyState";
	public static String PROP_ACCT_STATUS_TYPE = "AcctStatusType";
	public static String PROP_NAS_IP = "NasIp";
	public static String PROP_CALLING_I_D = "CallingID";
	public static String PROP_CUST_NAME = "CustName";
	public static String PROP_NAS_PORT_TYPE = "NasPortType";
	public static String PROP_STATUS = "Status";
	public static String PROP_FRAMED_IP = "FramedIp";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_NAS_ID = "NasId";
	public static String PROP_NAS_PORT_ID = "NasPortId";
	public static String PROP_REALM = "Realm";
	public static String PROP_NAS_PORT = "NasPort";
	public static String PROP_CALLED_I_D = "CalledID";
	public static String PROP_ID = "Id";
	public static String PROP_END_TIME = "EndTime";
	public static String PROP_BILLING_TYPE = "BillingType";
	public static String PROP_START_TIME = "StartTime";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseActiveCall () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseActiveCall (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.util.Date startTime;
	private java.util.Date endTime;
	private java.lang.String custName;
	private java.lang.String providerId;
	private java.lang.String realm;
	private java.lang.String proxyState;
	private java.lang.String calledID;
	private java.lang.String callingID;
	private java.lang.String framedIp;
	private java.lang.String nasId;
	private java.lang.String nasIp;
	private java.lang.String nasPort;
	private java.lang.Integer nasPortType;
	private java.lang.Integer billingType;
	private java.lang.String status;
	private java.lang.String nasPortId;
	private java.lang.Integer acctStatusType;

	// many to one
	private com.fengfan.model.Provider provider;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="SessionId"
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
	 * Return the value associated with the column: StartTime
	 */
	public java.util.Date getStartTime () {
		return startTime;
	}

	/**
	 * Set the value related to the column: StartTime
	 * @param startTime the StartTime value
	 */
	public void setStartTime (java.util.Date startTime) {
		this.startTime = startTime;
	}



	/**
	 * Return the value associated with the column: EndTime
	 */
	public java.util.Date getEndTime () {
		return endTime;
	}

	/**
	 * Set the value related to the column: EndTime
	 * @param endTime the EndTime value
	 */
	public void setEndTime (java.util.Date endTime) {
		this.endTime = endTime;
	}



	/**
	 * Return the value associated with the column: CustName
	 */
	public java.lang.String getCustName () {
		return custName;
	}

	/**
	 * Set the value related to the column: CustName
	 * @param custName the CustName value
	 */
	public void setCustName (java.lang.String custName) {
		this.custName = custName;
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
	 * Return the value associated with the column: Realm
	 */
	public java.lang.String getRealm () {
		return realm;
	}

	/**
	 * Set the value related to the column: Realm
	 * @param realm the Realm value
	 */
	public void setRealm (java.lang.String realm) {
		this.realm = realm;
	}



	/**
	 * Return the value associated with the column: ProxyState
	 */
	public java.lang.String getProxyState () {
		return proxyState;
	}

	/**
	 * Set the value related to the column: ProxyState
	 * @param proxyState the ProxyState value
	 */
	public void setProxyState (java.lang.String proxyState) {
		this.proxyState = proxyState;
	}



	/**
	 * Return the value associated with the column: CalledID
	 */
	public java.lang.String getCalledID () {
		return calledID;
	}

	/**
	 * Set the value related to the column: CalledID
	 * @param calledID the CalledID value
	 */
	public void setCalledID (java.lang.String calledID) {
		this.calledID = calledID;
	}



	/**
	 * Return the value associated with the column: CallingID
	 */
	public java.lang.String getCallingID () {
		return callingID;
	}

	/**
	 * Set the value related to the column: CallingID
	 * @param callingID the CallingID value
	 */
	public void setCallingID (java.lang.String callingID) {
		this.callingID = callingID;
	}



	/**
	 * Return the value associated with the column: FramedIp
	 */
	public java.lang.String getFramedIp () {
		return framedIp;
	}

	/**
	 * Set the value related to the column: FramedIp
	 * @param framedIp the FramedIp value
	 */
	public void setFramedIp (java.lang.String framedIp) {
		this.framedIp = framedIp;
	}



	/**
	 * Return the value associated with the column: NasId
	 */
	public java.lang.String getNasId () {
		return nasId;
	}

	/**
	 * Set the value related to the column: NasId
	 * @param nasId the NasId value
	 */
	public void setNasId (java.lang.String nasId) {
		this.nasId = nasId;
	}



	/**
	 * Return the value associated with the column: NasIp
	 */
	public java.lang.String getNasIp () {
		return nasIp;
	}

	/**
	 * Set the value related to the column: NasIp
	 * @param nasIp the NasIp value
	 */
	public void setNasIp (java.lang.String nasIp) {
		this.nasIp = nasIp;
	}



	/**
	 * Return the value associated with the column: NasPort
	 */
	public java.lang.String getNasPort () {
		return nasPort;
	}

	/**
	 * Set the value related to the column: NasPort
	 * @param nasPort the NasPort value
	 */
	public void setNasPort (java.lang.String nasPort) {
		this.nasPort = nasPort;
	}



	/**
	 * Return the value associated with the column: NasPortType
	 */
	public java.lang.Integer getNasPortType () {
		return nasPortType;
	}

	/**
	 * Set the value related to the column: NasPortType
	 * @param nasPortType the NasPortType value
	 */
	public void setNasPortType (java.lang.Integer nasPortType) {
		this.nasPortType = nasPortType;
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
	 * Return the value associated with the column: NasPortId
	 */
	public java.lang.String getNasPortId () {
		return nasPortId;
	}

	/**
	 * Set the value related to the column: NasPortId
	 * @param nasPortId the NasPortId value
	 */
	public void setNasPortId (java.lang.String nasPortId) {
		this.nasPortId = nasPortId;
	}



	/**
	 * Return the value associated with the column: AcctStatusType
	 */
	public java.lang.Integer getAcctStatusType () {
		return acctStatusType;
	}

	/**
	 * Set the value related to the column: AcctStatusType
	 * @param acctStatusType the AcctStatusType value
	 */
	public void setAcctStatusType (java.lang.Integer acctStatusType) {
		this.acctStatusType = acctStatusType;
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
		if (!(obj instanceof com.fengfan.model.ActiveCall)) return false;
		else {
			com.fengfan.model.ActiveCall activeCall = (com.fengfan.model.ActiveCall) obj;
			if (null == this.getId() || null == activeCall.getId()) return false;
			else return (this.getId().equals(activeCall.getId()));
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