package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.fengfan.model.dao.iface.ProviderDAO;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseProviderDAO extends com.fengfan.model.dao._RootDAO {

	public BaseProviderDAO () {}
	
	public BaseProviderDAO (Session session) {
		super(session);
	}

	// query name references


	public static ProviderDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static ProviderDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.ProviderDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.Provider.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.fengfan.model.Provider
	 */
	public com.fengfan.model.Provider cast (Object object) {
		return (com.fengfan.model.Provider) object;
	}

	public com.fengfan.model.Provider get(java.lang.String key)
	{
		return (com.fengfan.model.Provider) get(getReferenceClass(), key);
	}

	public com.fengfan.model.Provider get(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Provider) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Provider load(java.lang.String key)
	{
		return (com.fengfan.model.Provider) load(getReferenceClass(), key);
	}

	public com.fengfan.model.Provider load(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Provider) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Provider loadInitialize(java.lang.String key, Session s) 
	{ 
		com.fengfan.model.Provider obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.Provider> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.Provider> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.fengfan.model.Provider> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param provider a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Provider provider)
	{
		return (java.lang.String) super.save(provider);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param provider a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Provider provider, Session s)
	{
		return (java.lang.String) save((Object) provider, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param provider a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.Provider provider)
	{
		saveOrUpdate((Object) provider);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param provider a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.Provider provider, Session s)
	{
		saveOrUpdate((Object) provider, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param provider a transient instance containing updated state
	 */
	public void update(com.fengfan.model.Provider provider) 
	{
		update((Object) provider);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param provider a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.Provider provider, Session s)
	{
		update((Object) provider, s);
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
	 * @param provider the instance to be removed
	 */
	public void delete(com.fengfan.model.Provider provider)
	{
		delete((Object) provider);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param provider the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.Provider provider, Session s)
	{
		delete((Object) provider, s);
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
	public void refresh (com.fengfan.model.Provider provider, Session s)
	{
		refresh((Object) provider, s);
	}

}