package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the authorities table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="authorities"
 */

public abstract class BaseAuthorities  implements Serializable {

	public static String REF = "Authorities";
	public static String PROP_AUTHORITY = "Authority";
	public static String PROP_USERNAME = "Username";
	public static String PROP_ID = "Id";


	// constructors
	public BaseAuthorities () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAuthorities (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String username;
	private java.lang.String authority;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="id"
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
	 * Return the value associated with the column: username
	 */
	public java.lang.String getUsername () {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * @param username the username value
	 */
	public void setUsername (java.lang.String username) {
		this.username = username;
	}



	/**
	 * Return the value associated with the column: authority
	 */
	public java.lang.String getAuthority () {
		return authority;
	}

	/**
	 * Set the value related to the column: authority
	 * @param authority the authority value
	 */
	public void setAuthority (java.lang.String authority) {
		this.authority = authority;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.Authorities)) return false;
		else {
			com.fengfan.model.Authorities authorities = (com.fengfan.model.Authorities) obj;
			if (null == this.getId() || null == authorities.getId()) return false;
			else return (this.getId().equals(authorities.getId()));
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