package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the gateway table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="gateway"
 */

public abstract class BaseGateway  implements Serializable {

	public static String REF = "Gateway";
	public static String PROP_DOMAIN = "Domain";
	public static String PROP_PORTAL_URL = "PortalUrl";
	public static String PROP_LOCATION = "Location";
	public static String PROP_GATEWAY_TYPE = "GatewayType";
	public static String PROP_OUT_BANDWIDTH = "OutBandwidth";
	public static String PROP_GATEWAY_TYPE_ID = "GatewayTypeId";
	public static String PROP_IP_ADDR = "IpAddr";
	public static String PROP_STATUS = "Status";
	public static String PROP_IN_BANDWIDTH = "InBandwidth";
	public static String PROP_PROXY_ENABLED = "ProxyEnabled";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_IS_PUBLIC = "IsPublic";
	public static String PROP_LATITUDE = "Latitude";
	public static String PROP_SECRET_KEY = "SecretKey";
	public static String PROP_ID = "Id";
	public static String PROP_LONGITUDE = "Longitude";
	public static String PROP_GATEWAY_NAME = "GatewayName";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseGateway () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseGateway (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String domain;
	private java.lang.String ipAddr;
	private java.lang.String secretKey;
	private java.lang.String gatewayName;
	private java.lang.String providerId;
	private java.lang.String status;
	private java.lang.String proxyEnabled;
	private java.lang.String isPublic;
	private java.lang.String portalUrl;
	private java.lang.Integer inBandwidth;
	private java.lang.Integer outBandwidth;
	private java.lang.String gatewayTypeId;
	private java.lang.String location;
	private java.lang.Integer longitude;
	private java.lang.Integer latitude;

	// many to one
	private com.fengfan.model.Provider provider;
	private com.fengfan.model.GatewayType gatewayType;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="GatewayId"
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
	 * Return the value associated with the column: Domain
	 */
	public java.lang.String getDomain () {
		return domain;
	}

	/**
	 * Set the value related to the column: Domain
	 * @param domain the Domain value
	 */
	public void setDomain (java.lang.String domain) {
		this.domain = domain;
	}



	/**
	 * Return the value associated with the column: IpAddr
	 */
	public java.lang.String getIpAddr () {
		return ipAddr;
	}

	/**
	 * Set the value related to the column: IpAddr
	 * @param ipAddr the IpAddr value
	 */
	public void setIpAddr (java.lang.String ipAddr) {
		this.ipAddr = ipAddr;
	}



	/**
	 * Return the value associated with the column: SecretKey
	 */
	public java.lang.String getSecretKey () {
		return secretKey;
	}

	/**
	 * Set the value related to the column: SecretKey
	 * @param secretKey the SecretKey value
	 */
	public void setSecretKey (java.lang.String secretKey) {
		this.secretKey = secretKey;
	}



	/**
	 * Return the value associated with the column: GatewayName
	 */
	public java.lang.String getGatewayName () {
		return gatewayName;
	}

	/**
	 * Set the value related to the column: GatewayName
	 * @param gatewayName the GatewayName value
	 */
	public void setGatewayName (java.lang.String gatewayName) {
		this.gatewayName = gatewayName;
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
	 * Return the value associated with the column: ProxyEnabled
	 */
	public java.lang.String getProxyEnabled () {
		return proxyEnabled;
	}

	/**
	 * Set the value related to the column: ProxyEnabled
	 * @param proxyEnabled the ProxyEnabled value
	 */
	public void setProxyEnabled (java.lang.String proxyEnabled) {
		this.proxyEnabled = proxyEnabled;
	}



	/**
	 * Return the value associated with the column: IsPublic
	 */
	public java.lang.String getIsPublic () {
		return isPublic;
	}

	/**
	 * Set the value related to the column: IsPublic
	 * @param isPublic the IsPublic value
	 */
	public void setIsPublic (java.lang.String isPublic) {
		this.isPublic = isPublic;
	}



	/**
	 * Return the value associated with the column: PortalUrl
	 */
	public java.lang.String getPortalUrl () {
		return portalUrl;
	}

	/**
	 * Set the value related to the column: PortalUrl
	 * @param portalUrl the PortalUrl value
	 */
	public void setPortalUrl (java.lang.String portalUrl) {
		this.portalUrl = portalUrl;
	}



	/**
	 * Return the value associated with the column: InBandwidth
	 */
	public java.lang.Integer getInBandwidth () {
		return inBandwidth;
	}

	/**
	 * Set the value related to the column: InBandwidth
	 * @param inBandwidth the InBandwidth value
	 */
	public void setInBandwidth (java.lang.Integer inBandwidth) {
		this.inBandwidth = inBandwidth;
	}



	/**
	 * Return the value associated with the column: OutBandwidth
	 */
	public java.lang.Integer getOutBandwidth () {
		return outBandwidth;
	}

	/**
	 * Set the value related to the column: OutBandwidth
	 * @param outBandwidth the OutBandwidth value
	 */
	public void setOutBandwidth (java.lang.Integer outBandwidth) {
		this.outBandwidth = outBandwidth;
	}



	/**
	 * Return the value associated with the column: GatewayTypeId
	 */
	public java.lang.String getGatewayTypeId () {
		return gatewayTypeId;
	}

	/**
	 * Set the value related to the column: GatewayTypeId
	 * @param gatewayTypeId the GatewayTypeId value
	 */
	public void setGatewayTypeId (java.lang.String gatewayTypeId) {
		this.gatewayTypeId = gatewayTypeId;
	}



	/**
	 * Return the value associated with the column: Location
	 */
	public java.lang.String getLocation () {
		return location;
	}

	/**
	 * Set the value related to the column: Location
	 * @param location the Location value
	 */
	public void setLocation (java.lang.String location) {
		this.location = location;
	}



	/**
	 * Return the value associated with the column: Longitude
	 */
	public java.lang.Integer getLongitude () {
		return longitude;
	}

	/**
	 * Set the value related to the column: Longitude
	 * @param longitude the Longitude value
	 */
	public void setLongitude (java.lang.Integer longitude) {
		this.longitude = longitude;
	}



	/**
	 * Return the value associated with the column: Latitude
	 */
	public java.lang.Integer getLatitude () {
		return latitude;
	}

	/**
	 * Set the value related to the column: Latitude
	 * @param latitude the Latitude value
	 */
	public void setLatitude (java.lang.Integer latitude) {
		this.latitude = latitude;
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
	 * Return the value associated with the column: GatewayTypeId
	 */
	public com.fengfan.model.GatewayType getGatewayType () {
		return gatewayType;
	}

	/**
	 * Set the value related to the column: GatewayTypeId
	 * @param gatewayType the GatewayTypeId value
	 */
	public void setGatewayType (com.fengfan.model.GatewayType gatewayType) {
		this.gatewayType = gatewayType;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.Gateway)) return false;
		else {
			com.fengfan.model.Gateway gateway = (com.fengfan.model.Gateway) obj;
			if (null == this.getId() || null == gateway.getId()) return false;
			else return (this.getId().equals(gateway.getId()));
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