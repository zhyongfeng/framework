package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.fengfan.model.dao.iface.UsersDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseUsersDAO extends _BaseRootDAO{

	public BaseUsersDAO () {}
	
	public BaseUsersDAO (Session session) {
		super(session);
	}

	// query name references


	public static UsersDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static UsersDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.UsersDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.Users.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.Users
	 */
	public com.fengfan.model.Users cast (Object object) {
		return (com.fengfan.model.Users) object;
	}

	public com.fengfan.model.Users get(java.lang.String key)
	{
		return (com.fengfan.model.Users) get(getReferenceClass(), key);
	}

	public com.fengfan.model.Users get(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Users) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Users load(java.lang.String key)
	{
		return (com.fengfan.model.Users) load(getReferenceClass(), key);
	}

	public com.fengfan.model.Users load(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Users) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Users loadInitialize(java.lang.String key, Session s) 
	{ 
		com.fengfan.model.Users obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.Users> findAll () {
		return super.findAll();
	}


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param users a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Users users)
	{
		return (java.lang.String) super.save(users);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param users a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Users users, Session s)
	{
		return (java.lang.String) save((Object) users, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param users a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.Users users)
	{
		saveOrUpdate((Object) users);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param users a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.Users users, Session s)
	{
		saveOrUpdate((Object) users, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param users a transient instance containing updated state
	 */
	public void update(com.fengfan.model.Users users) 
	{
		update((Object) users);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param users a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.Users users, Session s)
	{
		update((Object) users, s);
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
	 * @param users the instance to be removed
	 */
	public void delete(com.fengfan.model.Users users)
	{
		delete((Object) users);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param users the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.Users users, Session s)
	{
		delete((Object) users, s);
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
	public void refresh (com.fengfan.model.Users users, Session s)
	{
		refresh((Object) users, s);
	}


}