package com.fengfan.model.dao.iface;


public interface GatewayTypeDAO {
	public com.fengfan.model.GatewayType get(java.lang.String key);

	public com.fengfan.model.GatewayType load(java.lang.String key);

	public java.util.List<com.fengfan.model.GatewayType> findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param gatewayType a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.GatewayType gatewayType);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param gatewayType a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.GatewayType gatewayType);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param gatewayType a transient instance containing updated state
	 */
	public void update(com.fengfan.model.GatewayType gatewayType);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.String id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param gatewayType the instance to be removed
	 */
	public void delete(com.fengfan.model.GatewayType gatewayType);


}