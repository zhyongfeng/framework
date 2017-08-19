package com.fengfan.model.dao.iface;


public interface PayRecordDAO{
	public com.fengfan.model.PayRecord get(java.lang.Integer key);

	public com.fengfan.model.PayRecord load(java.lang.Integer key);

	public java.util.List findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param payRecord a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.fengfan.model.PayRecord payRecord);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param payRecord a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.PayRecord payRecord);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param payRecord a transient instance containing updated state
	 */
	public void update(com.fengfan.model.PayRecord payRecord);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param payRecord the instance to be removed
	 */
	public void delete(com.fengfan.model.PayRecord payRecord);

}