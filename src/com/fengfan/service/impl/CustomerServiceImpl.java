/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:07:53 PM
 */
package com.fengfan.service.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.Customer;
import com.fengfan.model.dao.CustomerDAO;
import com.fengfan.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
	
	public static final String changePasswordSql =
        "update customer set password = ? where custId = ?";
	
	private CustomerDAO customerDAO;
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO dao) {
		this.customerDAO = dao;
	}

	@Override
	public String addCustomer(Customer provider) {
		return customerDAO.save(provider);
	}

	@Override
	public boolean editCustomer(Customer provider) {
		customerDAO.update(provider);
		return true;
	}
	
	public boolean changePassword(String newPassword, String id){
		getJdbcTemplate().update(changePasswordSql,newPassword, id);
		return true;
	}

	@Override
	public boolean removeCustomer(String[] idset) {
		for(String id : idset){
			customerDAO.delete(id);
		}
		return true;
	}

	@Override
	public Customer getCustomer(String id){
		return  customerDAO.get(id);
	}

	@Override
	public Result<Customer> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return customerDAO.search(searchCondition, pageSize, currentPage);
	}

	@Override
	public boolean isCustomerIdExists(String id) {
		try{
			Customer entity = customerDAO.get(id);
			return entity != null;
		}catch(Exception ex){
			return true;
		}
	}

	@Override
	public boolean isLoginNameExists(String loginName) {
		return customerDAO.findByLoginName(loginName) != null;
	}
}
