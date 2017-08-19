package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the udr table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="udr"
 */

public abstract class BaseUdr  implements Serializable {

	public static String REF = "Udr";
	public static String PROP_SESSION_ID = "SessionId";
	public static String PROP_CALLING_ID = "CallingId";
	public static String PROP_STREAM_USAGE = "StreamUsage";
	public static String PROP_CUST_NAME = "CustName";
	public static String PROP_NAS_PORT_TYPE = "NasPortType";
	public static String PROP_FRAMED_IP = "FramedIp";
	public static String PROP_UP_STREAM = "UpStream";
	public static String PROP_NAS_ID = "NasId";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_DURATION = "Duration";
	public static String PROP_REALM = "Realm";
	public static String PROP_NAS_PORT_ID = "NasPortId";
	public static String PROP_START_TIME = "StartTime";
	public static String PROP_DOWN_STREAM = "DownStream";
	public static String PROP_TERMINATE_CAUSE = "TerminateCause";
	public static String PROP_PROXY_STATUS = "ProxyStatus";
	public static String PROP_NAS_IP = "NasIp";
	public static String PROP_CHARGE_AMOUNT = "ChargeAmount";
	public static String PROP_CALLED_ID = "CalledId";
	public static String PROP_NAS_PORT = "NasPort";
	public static String PROP_ID = "Id";
	public static String PROP_END_TIME = "EndTime";
	public static String PROP_INSERT_DATE = "InsertDate";
	public static String PROP_ERR_TYPE = "ErrType";
	public static String PROP_BILLING_TYPE = "BillingType";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseUdr () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUdr (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String sessionId;
	private java.lang.String custName;
	private java.lang.String realm;
	private java.lang.Integer proxyStatus;
	private java.lang.String providerId;
	private java.lang.String calledId;
	private java.lang.String callingId;
	private java.lang.String framedIp;
	private java.lang.String nasId;
	private java.lang.String nasIp;
	private java.lang.String nasPort;
	private java.lang.Integer nasPortType;
	private java.lang.String terminateCause;
	private java.util.Date startTime;
	private java.util.Date endTime;
	private java.lang.Integer duration;
	private java.lang.Integer billingType;
	private java.lang.Integer chargeAmount;
	private java.lang.Integer downStream;
	private java.lang.Integer upStream;
	private java.lang.Integer streamUsage;
	private java.util.Date insertDate;
	private java.lang.String errType;
	private java.lang.String nasPortId;

	// many to one
	private com.fengfan.model.Provider provider;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="UdrId"
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
	 * Return the value associated with the column: SessionId
	 */
	public java.lang.String getSessionId () {
		return sessionId;
	}

	/**
	 * Set the value related to the column: SessionId
	 * @param sessionId the SessionId value
	 */
	public void setSessionId (java.lang.String sessionId) {
		this.sessionId = sessionId;
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
	 * Return the value associated with the column: ProxyStatus
	 */
	public java.lang.Integer getProxyStatus () {
		return proxyStatus;
	}

	/**
	 * Set the value related to the column: ProxyStatus
	 * @param proxyStatus the ProxyStatus value
	 */
	public void setProxyStatus (java.lang.Integer proxyStatus) {
		this.proxyStatus = proxyStatus;
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
	 * Return the value associated with the column: CalledId
	 */
	public java.lang.String getCalledId () {
		return calledId;
	}

	/**
	 * Set the value related to the column: CalledId
	 * @param calledId the CalledId value
	 */
	public void setCalledId (java.lang.String calledId) {
		this.calledId = calledId;
	}



	/**
	 * Return the value associated with the column: CallingId
	 */
	public java.lang.String getCallingId () {
		return callingId;
	}

	/**
	 * Set the value related to the column: CallingId
	 * @param callingId the CallingId value
	 */
	public void setCallingId (java.lang.String callingId) {
		this.callingId = callingId;
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
	 * Return the value associated with the column: TerminateCause
	 */
	public java.lang.String getTerminateCause () {
		return terminateCause;
	}

	/**
	 * Set the value related to the column: TerminateCause
	 * @param terminateCause the TerminateCause value
	 */
	public void setTerminateCause (java.lang.String terminateCause) {
		this.terminateCause = terminateCause;
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
	 * Return the value associated with the column: ChargeAmount
	 */
	public java.lang.Integer getChargeAmount () {
		return chargeAmount;
	}

	/**
	 * Set the value related to the column: ChargeAmount
	 * @param chargeAmount the ChargeAmount value
	 */
	public void setChargeAmount (java.lang.Integer chargeAmount) {
		this.chargeAmount = chargeAmount;
	}



	/**
	 * Return the value associated with the column: DownStream
	 */
	public java.lang.Integer getDownStream () {
		return downStream;
	}

	/**
	 * Set the value related to the column: DownStream
	 * @param downStream the DownStream value
	 */
	public void setDownStream (java.lang.Integer downStream) {
		this.downStream = downStream;
	}



	/**
	 * Return the value associated with the column: UpStream
	 */
	public java.lang.Integer getUpStream () {
		return upStream;
	}

	/**
	 * Set the value related to the column: UpStream
	 * @param upStream the UpStream value
	 */
	public void setUpStream (java.lang.Integer upStream) {
		this.upStream = upStream;
	}



	/**
	 * Return the value associated with the column: StreamUsage
	 */
	public java.lang.Integer getStreamUsage () {
		return streamUsage;
	}

	/**
	 * Set the value related to the column: StreamUsage
	 * @param streamUsage the StreamUsage value
	 */
	public void setStreamUsage (java.lang.Integer streamUsage) {
		this.streamUsage = streamUsage;
	}



	/**
	 * Return the value associated with the column: InsertDate
	 */
	public java.util.Date getInsertDate () {
		return insertDate;
	}

	/**
	 * Set the value related to the column: InsertDate
	 * @param insertDate the InsertDate value
	 */
	public void setInsertDate (java.util.Date insertDate) {
		this.insertDate = insertDate;
	}



	/**
	 * Return the value associated with the column: ErrType
	 */
	public java.lang.String getErrType () {
		return errType;
	}

	/**
	 * Set the value related to the column: ErrType
	 * @param errType the ErrType value
	 */
	public void setErrType (java.lang.String errType) {
		this.errType = errType;
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
		if (!(obj instanceof com.fengfan.model.Udr)) return false;
		else {
			com.fengfan.model.Udr udr = (com.fengfan.model.Udr) obj;
			if (null == this.getId() || null == udr.getId()) return false;
			else return (this.getId().equals(udr.getId()));
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