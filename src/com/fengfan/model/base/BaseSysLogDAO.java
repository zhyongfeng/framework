package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.fengfan.model.dao.iface.SysLogDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseSysLogDAO extends _BaseRootDAO{

	public BaseSysLogDAO () {}
	
	public BaseSysLogDAO (Session session) {
		super(session);
	}

	// query name references


	public static SysLogDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static SysLogDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.SysLogDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.SysLog.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.SysLog
	 */
	public com.fengfan.model.SysLog cast (Object object) {
		return (com.fengfan.model.SysLog) object;
	}

	public com.fengfan.model.SysLog get(java.lang.Integer key)
	{
		return (com.fengfan.model.SysLog) get(getReferenceClass(), key);
	}

	public com.fengfan.model.SysLog get(java.lang.Integer key, Session s)
	{
		return (com.fengfan.model.SysLog) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.SysLog load(java.lang.Integer key)
	{
		return (com.fengfan.model.SysLog) load(getReferenceClass(), key);
	}

	public com.fengfan.model.SysLog load(java.lang.Integer key, Session s)
	{
		return (com.fengfan.model.SysLog) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.SysLog loadInitialize(java.lang.Integer key, Session s) 
	{ 
		com.fengfan.model.SysLog obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.SysLog> findAll () {
		return super.findAll();
	}


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param sysLog a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.fengfan.model.SysLog sysLog)
	{
		return (java.lang.Integer) super.save(sysLog);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param sysLog a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.fengfan.model.SysLog sysLog, Session s)
	{
		return (java.lang.Integer) save((Object) sysLog, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param sysLog a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.SysLog sysLog)
	{
		saveOrUpdate((Object) sysLog);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param sysLog a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.SysLog sysLog, Session s)
	{
		saveOrUpdate((Object) sysLog, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param sysLog a transient instance containing updated state
	 */
	public void update(com.fengfan.model.SysLog sysLog) 
	{
		update((Object) sysLog);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param sysLog a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.SysLog sysLog, Session s)
	{
		update((Object) sysLog, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id)
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
	public void delete(java.lang.Integer id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param sysLog the instance to be removed
	 */
	public void delete(com.fengfan.model.SysLog sysLog)
	{
		delete((Object) sysLog);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param sysLog the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.SysLog sysLog, Session s)
	{
		delete((Object) sysLog, s);
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
	public void refresh (com.fengfan.model.SysLog sysLog, Session s)
	{
		refresh((Object) sysLog, s);
	}


}