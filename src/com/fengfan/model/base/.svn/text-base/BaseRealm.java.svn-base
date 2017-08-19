package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the realm table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="realm"
 */

public abstract class BaseRealm  implements Serializable {

	public static String REF = "Realm";
	public static String PROP_IP_ADDR = "IpAddr";
	public static String PROP_OPER_NAME = "OperName";
	public static String PROP_ACCT_PORT = "AcctPort";
	public static String PROP_AUTH_PORT = "AuthPort";
	public static String PROP_ID = "Id";
	public static String PROP_NO_STRIP = "NoStrip";
	public static String PROP_IS_SUPER_REALM = "IsSuperRealm";
	public static String PROP_REALM_NAME = "RealmName";


	// constructors
	public BaseRealm () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseRealm (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String realmName;
	private java.lang.String operName;
	private java.lang.String ipAddr;
	private java.lang.Integer authPort;
	private java.lang.Integer acctPort;
	private java.lang.Integer noStrip;
	private java.lang.Integer isSuperRealm;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="RealmId"
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
	 * Return the value associated with the column: RealmName
	 */
	public java.lang.String getRealmName () {
		return realmName;
	}

	/**
	 * Set the value related to the column: RealmName
	 * @param realmName the RealmName value
	 */
	public void setRealmName (java.lang.String realmName) {
		this.realmName = realmName;
	}



	/**
	 * Return the value associated with the column: OperName
	 */
	public java.lang.String getOperName () {
		return operName;
	}

	/**
	 * Set the value related to the column: OperName
	 * @param operName the OperName value
	 */
	public void setOperName (java.lang.String operName) {
		this.operName = operName;
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
	 * Return the value associated with the column: AuthPort
	 */
	public java.lang.Integer getAuthPort () {
		return authPort;
	}

	/**
	 * Set the value related to the column: AuthPort
	 * @param authPort the AuthPort value
	 */
	public void setAuthPort (java.lang.Integer authPort) {
		this.authPort = authPort;
	}



	/**
	 * Return the value associated with the column: AcctPort
	 */
	public java.lang.Integer getAcctPort () {
		return acctPort;
	}

	/**
	 * Set the value related to the column: AcctPort
	 * @param acctPort the AcctPort value
	 */
	public void setAcctPort (java.lang.Integer acctPort) {
		this.acctPort = acctPort;
	}



	/**
	 * Return the value associated with the column: NoStrip
	 */
	public java.lang.Integer getNoStrip () {
		return noStrip;
	}

	/**
	 * Set the value related to the column: NoStrip
	 * @param noStrip the NoStrip value
	 */
	public void setNoStrip (java.lang.Integer noStrip) {
		this.noStrip = noStrip;
	}



	/**
	 * Return the value associated with the column: IsSuperRealm
	 */
	public java.lang.Integer getIsSuperRealm () {
		return isSuperRealm;
	}

	/**
	 * Set the value related to the column: IsSuperRealm
	 * @param isSuperRealm the IsSuperRealm value
	 */
	public void setIsSuperRealm (java.lang.Integer isSuperRealm) {
		this.isSuperRealm = isSuperRealm;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.Realm)) return false;
		else {
			com.fengfan.model.Realm realm = (com.fengfan.model.Realm) obj;
			if (null == this.getId() || null == realm.getId()) return false;
			else return (this.getId().equals(realm.getId()));
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