package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.fengfan.model.dao.iface.GatewayTypeDAO;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseGatewayTypeDAO extends _BaseRootDAO{

	public BaseGatewayTypeDAO () {}
	
	public BaseGatewayTypeDAO (Session session) {
		super(session);
	}

	// query name references


	public static GatewayTypeDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static GatewayTypeDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.GatewayTypeDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.GatewayType.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.GatewayType
	 */
	public com.fengfan.model.GatewayType cast (Object object) {
		return (com.fengfan.model.GatewayType) object;
	}

	public com.fengfan.model.GatewayType get(java.lang.String key)
	{
		return (com.fengfan.model.GatewayType) get(getReferenceClass(), key);
	}

	public com.fengfan.model.GatewayType get(java.lang.String key, Session s)
	{
		return (com.fengfan.model.GatewayType) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.GatewayType load(java.lang.String key)
	{
		return (com.fengfan.model.GatewayType) load(getReferenceClass(), key);
	}

	public com.fengfan.model.GatewayType load(java.lang.String key, Session s)
	{
		return (com.fengfan.model.GatewayType) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.GatewayType loadInitialize(java.lang.String key, Session s) 
	{ 
		com.fengfan.model.GatewayType obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.GatewayType> findAll () {
		return super.findAll();
	}


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param gatewayType a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.GatewayType gatewayType)
	{
		return (java.lang.String) super.save(gatewayType);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param gatewayType a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.GatewayType gatewayType, Session s)
	{
		return (java.lang.String) save((Object) gatewayType, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param gatewayType a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.GatewayType gatewayType)
	{
		saveOrUpdate((Object) gatewayType);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param gatewayType a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.GatewayType gatewayType, Session s)
	{
		saveOrUpdate((Object) gatewayType, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param gatewayType a transient instance containing updated state
	 */
	public void update(com.fengfan.model.GatewayType gatewayType) 
	{
		update((Object) gatewayType);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param gatewayType a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.GatewayType gatewayType, Session s)
	{
		update((Object) gatewayType, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.String id)
	{
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.String id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param gatewayType the instance to be removed
	 */
	public void delete(com.fengfan.model.GatewayType gatewayType)
	{
		delete((Object) gatewayType);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param gatewayType the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.GatewayType gatewayType, Session s)
	{
		delete((Object) gatewayType, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (com.fengfan.model.GatewayType gatewayType, Session s)
	{
		refresh((Object) gatewayType, s);
	}


}