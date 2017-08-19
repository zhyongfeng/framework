package com.fengfan.common.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

public interface IBaseDAO<T, ID extends Serializable> {
	
	public List<T> find(String queryString, Object value)
			throws DataAccessException;

	public List<T> find(String queryString, Object[] values)
			throws DataAccessException;

	public List<T> find(String queryString) throws DataAccessException;

}
