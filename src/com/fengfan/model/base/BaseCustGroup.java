package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the cust_group table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="cust_group"
 */

public abstract class BaseCustGroup  implements Serializable {

	public static String REF = "CustGroup";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_ID = "Id";


	// constructors
	public BaseCustGroup () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCustGroup (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String description;

	// collections
	private java.util.Set<com.fengfan.model.GroupAttr> custAttributes;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="GroupId"
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
	 * Return the value associated with the column: custAttributes
	 */
	public java.util.Set<com.fengfan.model.GroupAttr> getCustAttributes () {
		return custAttributes;
	}

	/**
	 * Set the value related to the column: custAttributes
	 * @param custAttributes the custAttributes value
	 */
	public void setCustAttributes (java.util.Set<com.fengfan.model.GroupAttr> custAttributes) {
		this.custAttributes = custAttributes;
	}

	public void addTocustAttributes (com.fengfan.model.GroupAttr groupAttr) {
		if (null == getCustAttributes()) setCustAttributes(new java.util.TreeSet<com.fengfan.model.GroupAttr>());
		getCustAttributes().add(groupAttr);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.CustGroup)) return false;
		else {
			com.fengfan.model.CustGroup custGroup = (com.fengfan.model.CustGroup) obj;
			if (null == this.getId() || null == custGroup.getId()) return false;
			else return (this.getId().equals(custGroup.getId()));
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