package com.fengfan.common.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author yfzhang
 * 
 */
public abstract class BaseDAO<T, ID extends Serializable> extends
		HibernateDaoSupport implements IBaseDAO<T, ID> {
	private Log logger = LogFactory.getLog(getClass());

	protected Class<T> entityClass;

	public BaseDAO() {

	}

	public List<T> find(String queryString, Object value)
			throws DataAccessException {
		List<T> find = (List<T>) getHibernateTemplate()
				.find(queryString, value);
		return find;
	}

	public List<T> find(String queryString, Object[] values)
			throws DataAccessException {
		List<T> find = (List<T>) getHibernateTemplate().find(queryString,
				values);
		return find;
	}

	public List<T> find(String queryString) throws DataAccessException {
		return (List<T>) getHibernateTemplate().find(queryString);
	}

}
