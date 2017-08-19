package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.fengfan.model.dao.iface.GatewayDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseGatewayDAO extends com.fengfan.model.dao._RootDAO {

	public BaseGatewayDAO () {}
	
	public BaseGatewayDAO (Session session) {
		super(session);
	}

	// query name references


	public static GatewayDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static GatewayDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.GatewayDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.Gateway.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.Gateway
	 */
	public com.fengfan.model.Gateway cast (Object object) {
		return (com.fengfan.model.Gateway) object;
	}

	public com.fengfan.model.Gateway get(java.lang.String key)
	{
		return (com.fengfan.model.Gateway) get(getReferenceClass(), key);
	}

	public com.fengfan.model.Gateway get(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Gateway) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Gateway load(java.lang.String key)
	{
		return (com.fengfan.model.Gateway) load(getReferenceClass(), key);
	}

	public com.fengfan.model.Gateway load(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Gateway) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Gateway loadInitialize(java.lang.String key, Session s) 
	{ 
		com.fengfan.model.Gateway obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.Gateway> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.Gateway> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.fengfan.model.Gateway> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param gateway a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Gateway gateway)
	{
		return (java.lang.String) super.save(gateway);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param gateway a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Gateway gateway, Session s)
	{
		return (java.lang.String) save((Object) gateway, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param gateway a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.Gateway gateway)
	{
		saveOrUpdate((Object) gateway);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param gateway a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.Gateway gateway, Session s)
	{
		saveOrUpdate((Object) gateway, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param gateway a transient instance containing updated state
	 */
	public void update(com.fengfan.model.Gateway gateway) 
	{
		update((Object) gateway);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param gateway a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.Gateway gateway, Session s)
	{
		update((Object) gateway, s);
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
	 * @param gateway the instance to be removed
	 */
	public void delete(com.fengfan.model.Gateway gateway)
	{
		delete((Object) gateway);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param gateway the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.Gateway gateway, Session s)
	{
		delete((Object) gateway, s);
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
	public void refresh (com.fengfan.model.Gateway gateway, Session s)
	{
		refresh((Object) gateway, s);
	}


}