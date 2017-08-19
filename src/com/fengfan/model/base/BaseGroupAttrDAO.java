package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.fengfan.model.dao.iface.GroupAttrDAO;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseGroupAttrDAO extends com.fengfan.model.dao._RootDAO {

	public BaseGroupAttrDAO () {}
	
	public BaseGroupAttrDAO (Session session) {
		super(session);
	}

	// query name references


	public static GroupAttrDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static GroupAttrDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.GroupAttrDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.GroupAttr.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.GroupAttr
	 */
	public com.fengfan.model.GroupAttr cast (Object object) {
		return (com.fengfan.model.GroupAttr) object;
	}

	public com.fengfan.model.GroupAttr get(java.lang.Integer key)
	{
		return (com.fengfan.model.GroupAttr) get(getReferenceClass(), key);
	}

	public com.fengfan.model.GroupAttr get(java.lang.Integer key, Session s)
	{
		return (com.fengfan.model.GroupAttr) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.GroupAttr load(java.lang.Integer key)
	{
		return (com.fengfan.model.GroupAttr) load(getReferenceClass(), key);
	}

	public com.fengfan.model.GroupAttr load(java.lang.Integer key, Session s)
	{
		return (com.fengfan.model.GroupAttr) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.GroupAttr loadInitialize(java.lang.Integer key, Session s) 
	{ 
		com.fengfan.model.GroupAttr obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.GroupAttr> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.GroupAttr> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.fengfan.model.GroupAttr> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param groupAttr a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.fengfan.model.GroupAttr groupAttr)
	{
		return (java.lang.Integer) super.save(groupAttr);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param groupAttr a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.fengfan.model.GroupAttr groupAttr, Session s)
	{
		return (java.lang.Integer) save((Object) groupAttr, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param groupAttr a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.GroupAttr groupAttr)
	{
		saveOrUpdate((Object) groupAttr);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param groupAttr a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.GroupAttr groupAttr, Session s)
	{
		saveOrUpdate((Object) groupAttr, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param groupAttr a transient instance containing updated state
	 */
	public void update(com.fengfan.model.GroupAttr groupAttr) 
	{
		update((Object) groupAttr);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param groupAttr a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.GroupAttr groupAttr, Session s)
	{
		update((Object) groupAttr, s);
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
	 * @param groupAttr the instance to be removed
	 */
	public void delete(com.fengfan.model.GroupAttr groupAttr)
	{
		delete((Object) groupAttr);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param groupAttr the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.GroupAttr groupAttr, Session s)
	{
		delete((Object) groupAttr, s);
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
	public void refresh (com.fengfan.model.GroupAttr groupAttr, Session s)
	{
		refresh((Object) groupAttr, s);
	}
}