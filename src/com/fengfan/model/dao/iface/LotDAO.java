package com.fengfan.model.dao.iface;


public interface LotDAO {

	public java.util.List<com.fengfan.model.Lot> findAll ();


	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param lot a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.Lot lot);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param lot a transient instance containing updated state
	 */
	public void update(com.fengfan.model.Lot lot);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param lot the instance to be removed
	 */
	public void delete(com.fengfan.model.Lot lot);


}