package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the gateway_type table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="gateway_type"
 */

public abstract class BaseGatewayType  implements Serializable {

	public static String REF = "GatewayType";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_MODEL = "Model";
	public static String PROP_MANUFACTORY = "Manufactory";
	public static String PROP_ID = "Id";


	// constructors
	public BaseGatewayType () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseGatewayType (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String manufactory;
	private java.lang.String model;
	private java.lang.String description;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="GatewayTypeId"
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
	 * Return the value associated with the column: Manufactory
	 */
	public java.lang.String getManufactory () {
		return manufactory;
	}

	/**
	 * Set the value related to the column: Manufactory
	 * @param manufactory the Manufactory value
	 */
	public void setManufactory (java.lang.String manufactory) {
		this.manufactory = manufactory;
	}



	/**
	 * Return the value associated with the column: Model
	 */
	public java.lang.String getModel () {
		return model;
	}

	/**
	 * Set the value related to the column: Model
	 * @param model the Model value
	 */
	public void setModel (java.lang.String model) {
		this.model = model;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.GatewayType)) return false;
		else {
			com.fengfan.model.GatewayType gatewayType = (com.fengfan.model.GatewayType) obj;
			if (null == this.getId() || null == gatewayType.getId()) return false;
			else return (this.getId().equals(gatewayType.getId()));
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