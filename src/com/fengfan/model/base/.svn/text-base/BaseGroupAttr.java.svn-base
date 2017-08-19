package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the group_attr table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="group_attr"
 */

public abstract class BaseGroupAttr  implements Serializable {

	public static String REF = "GroupAttr";
	public static String PROP_ATTR_VALUE = "AttrValue";
	public static String PROP_ATTR_NAME = "AttrName";
	public static String PROP_ID = "Id";
	public static String PROP_ATTR_DESC = "AttrDesc";
	public static String PROP_GROUP_ID = "GroupId";


	// constructors
	public BaseGroupAttr () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseGroupAttr (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseGroupAttr (
		java.lang.Integer id,
		java.lang.String attrName) {

		this.setId(id);
		this.setAttrName(attrName);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String groupId;
	private java.lang.String attrName;
	private java.lang.String attrValue;
	private java.lang.String attrDesc;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="AttrId"
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
	 * Return the value associated with the column: GroupId
	 */
	public java.lang.String getGroupId () {
		return groupId;
	}

	/**
	 * Set the value related to the column: GroupId
	 * @param groupId the GroupId value
	 */
	public void setGroupId (java.lang.String groupId) {
		this.groupId = groupId;
	}



	/**
	 * Return the value associated with the column: AttrName
	 */
	public java.lang.String getAttrName () {
		return attrName;
	}

	/**
	 * Set the value related to the column: AttrName
	 * @param attrName the AttrName value
	 */
	public void setAttrName (java.lang.String attrName) {
		this.attrName = attrName;
	}



	/**
	 * Return the value associated with the column: AttrValue
	 */
	public java.lang.String getAttrValue () {
		return attrValue;
	}

	/**
	 * Set the value related to the column: AttrValue
	 * @param attrValue the AttrValue value
	 */
	public void setAttrValue (java.lang.String attrValue) {
		this.attrValue = attrValue;
	}



	/**
	 * Return the value associated with the column: AttrDesc
	 */
	public java.lang.String getAttrDesc () {
		return attrDesc;
	}

	/**
	 * Set the value related to the column: AttrDesc
	 * @param attrDesc the AttrDesc value
	 */
	public void setAttrDesc (java.lang.String attrDesc) {
		this.attrDesc = attrDesc;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.GroupAttr)) return false;
		else {
			com.fengfan.model.GroupAttr groupAttr = (com.fengfan.model.GroupAttr) obj;
			if (null == this.getId() || null == groupAttr.getId()) return false;
			else return (this.getId().equals(groupAttr.getId()));
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