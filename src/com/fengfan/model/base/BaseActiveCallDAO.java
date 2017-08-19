package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.fengfan.model.dao.iface.ActiveCallDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseActiveCallDAO extends _BaseRootDAO{

	public BaseActiveCallDAO () {}
	
	public BaseActiveCallDAO (Session session) {
		super(session);
	}

	// query name references


	public static ActiveCallDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static ActiveCallDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.ActiveCallDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.ActiveCall.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.ActiveCall
	 */
	public com.fengfan.model.ActiveCall cast (Object object) {
		return (com.fengfan.model.ActiveCall) object;
	}

	public com.fengfan.model.ActiveCall get(java.lang.String key)
	{
		return (com.fengfan.model.ActiveCall) get(getReferenceClass(), key);
	}

	public com.fengfan.model.ActiveCall get(java.lang.String key, Session s)
	{
		return (com.fengfan.model.ActiveCall) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.ActiveCall load(java.lang.String key)
	{
		return (com.fengfan.model.ActiveCall) load(getReferenceClass(), key);
	}

	public com.fengfan.model.ActiveCall load(java.lang.String key, Session s)
	{
		return (com.fengfan.model.ActiveCall) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.ActiveCall loadInitialize(java.lang.String key, Session s) 
	{ 
		com.fengfan.model.ActiveCall obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.ActiveCall> findAll () {
		return super.findAll();
	}


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param activeCall a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.ActiveCall activeCall)
	{
		return (java.lang.String) super.save(activeCall);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param activeCall a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.ActiveCall activeCall, Session s)
	{
		return (java.lang.String) save((Object) activeCall, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param activeCall a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.ActiveCall activeCall)
	{
		saveOrUpdate((Object) activeCall);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param activeCall a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.ActiveCall activeCall, Session s)
	{
		saveOrUpdate((Object) activeCall, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param activeCall a transient instance containing updated state
	 */
	public void update(com.fengfan.model.ActiveCall activeCall) 
	{
		update((Object) activeCall);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param activeCall a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.ActiveCall activeCall, Session s)
	{
		update((Object) activeCall, s);
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
	 * @param activeCall the instance to be removed
	 */
	public void delete(com.fengfan.model.ActiveCall activeCall)
	{
		delete((Object) activeCall);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param activeCall the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.ActiveCall activeCall, Session s)
	{
		delete((Object) activeCall, s);
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
	public void refresh (com.fengfan.model.ActiveCall activeCall, Session s)
	{
		refresh((Object) activeCall, s);
	}


}