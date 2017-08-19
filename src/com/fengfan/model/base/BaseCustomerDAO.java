package com.fengfan.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.fengfan.model.dao.iface.CustomerDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseCustomerDAO extends _BaseRootDAO{

	public BaseCustomerDAO () {}
	
	public BaseCustomerDAO (Session session) {
		super(session);
	}

	// query name references


	public static CustomerDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static CustomerDAO getInstance () {
		if (null == instance) instance = new com.fengfan.model.dao.CustomerDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.fengfan.model.Customer.class;
	}

    public Order getDefaultOrder () {
		return Order.asc("Name");
    }

	/**
	 * Cast the object as a com.fengfan.model.Customer
	 */
	public com.fengfan.model.Customer cast (Object object) {
		return (com.fengfan.model.Customer) object;
	}

	public com.fengfan.model.Customer get(java.lang.String key)
	{
		return (com.fengfan.model.Customer) get(getReferenceClass(), key);
	}

	public com.fengfan.model.Customer get(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Customer) get(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Customer load(java.lang.String key)
	{
		return (com.fengfan.model.Customer) load(getReferenceClass(), key);
	}

	public com.fengfan.model.Customer load(java.lang.String key, Session s)
	{
		return (com.fengfan.model.Customer) load(getReferenceClass(), key, s);
	}

	public com.fengfan.model.Customer loadInitialize(java.lang.String key, Session s) 
	{ 
		com.fengfan.model.Customer obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.fengfan.model.Customer> findAll () {
		return super.findAll();
	}


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param customer a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Customer customer)
	{
		return (java.lang.String) super.save(customer);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param customer a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.fengfan.model.Customer customer, Session s)
	{
		return (java.lang.String) save((Object) customer, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param customer a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.fengfan.model.Customer customer)
	{
		saveOrUpdate((Object) customer);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param customer a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.fengfan.model.Customer customer, Session s)
	{
		saveOrUpdate((Object) customer, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param customer a transient instance containing updated state
	 */
	public void update(com.fengfan.model.Customer customer) 
	{
		update((Object) customer);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param customer a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.fengfan.model.Customer customer, Session s)
	{
		update((Object) customer, s);
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
	 * @param customer the instance to be removed
	 */
	public void delete(com.fengfan.model.Customer customer)
	{
		delete((Object) customer);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param customer the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.fengfan.model.Customer customer, Session s)
	{
		delete((Object) customer, s);
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
	public void refresh (com.fengfan.model.Customer customer, Session s)
	{
		refresh((Object) customer, s);
	}


}