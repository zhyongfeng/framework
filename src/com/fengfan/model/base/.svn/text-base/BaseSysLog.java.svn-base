package com.fengfan.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the sys_log table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="sys_log"
 */

public abstract class BaseSysLog  implements Serializable {

	public static String REF = "SysLog";
	public static String PROP_EXEC_USER = "ExecUser";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_PROVIDER_ID = "ProviderId";
	public static String PROP_UPDATE_TIME = "UpdateTime";
	public static String PROP_ID = "Id";
	public static String PROP_LOG_TYPE = "LogType";
	public static String PROP_OBJECT_NAME = "ObjectName";
	public static String PROP_REMARK = "Remark";
	public static String PROP_OBJECT_ID = "ObjectId";


	// constructors
	public BaseSysLog () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSysLog (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String providerId;
	private java.lang.String objectName;
	private java.lang.String objectId;
	private java.lang.String logType;
	private java.lang.String execUser;
	private java.util.Date updateTime;
	private java.lang.String description;
	private java.lang.String remark;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="LogId"
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
	 * Return the value associated with the column: ObjectName
	 */
	public java.lang.String getObjectName () {
		return objectName;
	}

	/**
	 * Set the value related to the column: ObjectName
	 * @param objectName the ObjectName value
	 */
	public void setObjectName (java.lang.String objectName) {
		this.objectName = objectName;
	}



	/**
	 * Return the value associated with the column: ObjectId
	 */
	public java.lang.String getObjectId () {
		return objectId;
	}

	/**
	 * Set the value related to the column: ObjectId
	 * @param objectId the ObjectId value
	 */
	public void setObjectId (java.lang.String objectId) {
		this.objectId = objectId;
	}



	/**
	 * Return the value associated with the column: LogType
	 */
	public java.lang.String getLogType () {
		return logType;
	}

	/**
	 * Set the value related to the column: LogType
	 * @param logType the LogType value
	 */
	public void setLogType (java.lang.String logType) {
		this.logType = logType;
	}



	/**
	 * Return the value associated with the column: ExecUser
	 */
	public java.lang.String getExecUser () {
		return execUser;
	}

	/**
	 * Set the value related to the column: ExecUser
	 * @param execUser the ExecUser value
	 */
	public void setExecUser (java.lang.String execUser) {
		this.execUser = execUser;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fengfan.model.SysLog)) return false;
		else {
			com.fengfan.model.SysLog sysLog = (com.fengfan.model.SysLog) obj;
			if (null == this.getId() || null == sysLog.getId()) return false;
			else return (this.getId().equals(sysLog.getId()));
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