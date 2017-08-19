package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the users table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="users"
 */

public abstract class BaseUsers  implements Serializable {

	public static String REF = "Users";
	public static String PROP_ENABLED = "Enabled";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_EMAIL = "Email";
	public static String PROP_USERNAME = "Username";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_PASSWORD = "Password";
	public static String PROP_PROVIDER = "Provider";


	// constructors
	public BaseUsers () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUsers (java.lang.String username) {
		this.setUsername(username);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUsers (
		java.lang.String username,
		java.lang.String password,
		java.lang.Integer enabled) {

		this.setUsername(username);
		this.setPassword(password);
		this.setEnabled(enabled);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String username;

	// fields
	private java.lang.String password;
	private java.lang.Integer enabled;
	private java.lang.String providerId;
	private java.lang.String email;
	private java.lang.String description;

	// many to one
	private com.fengfan.model.Provider provider;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="username"
     */
	public java.lang.String getUsername () {
		return username;
	}

	/**
	 * Set the unique identifier of this class
	 * @param username the new ID
	 */
	public void setUsername (java.lang.String username) {
		this.username = username;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: enabled
	 */
	public java.lang.Integer getEnabled () {
		return enabled;
	}

	/**
	 * Set the value related to the column: enabled
	 * @param enabled the enabled value
	 */
	public void setEnabled (java.lang.Integer enabled) {
		this.enabled = enabled;
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
	 * Return the value associated with the column: email
	 */
	public java.lang.String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: email
	 * @param email the email value
	 */
	public void setEmail (java.lang.String email) {
		this.email = email;
	}



	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
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
		if (!(obj instanceof com.fengfan.model.Users)) return false;
		else {
			com.fengfan.model.Users users = (com.fengfan.model.Users) obj;
			if (null == this.getUsername() || null == users.getUsername()) return false;
			else return (this.getUsername().equals(users.getUsername()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getUsername()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getUsername().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}