/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:07:53 PM
 */
package com.fengfan.service.impl;

import java.util.Date;
import java.util.List;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.Authorities;
import com.fengfan.model.Provider;
import com.fengfan.model.Users;
import com.fengfan.model.dao.ProviderDAO;
import com.fengfan.model.dao.iface.AuthoritiesDAO;
import com.fengfan.model.dao.iface.UsersDAO;
import com.fengfan.service.IProviderService;

public class ProviderServiceImpl implements IProviderService {

	private static final String USER_DEFAULT_PASSWORD = "password";
	private static final String USER_DEFAULT_ROLE = "ROLE_PROVIDER";

	private ProviderDAO providerDAO;
	private UsersDAO usersDAO;
	private AuthoritiesDAO authoritiesDAO;


	public AuthoritiesDAO getAuthoritiesDAO() {
		return authoritiesDAO;
	}

	public void setAuthoritiesDAO(AuthoritiesDAO authoritiesDAO) {
		this.authoritiesDAO = authoritiesDAO;
	}

	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}


	public ProviderDAO getProviderDAO() {
		return providerDAO;
	}

	public void setProviderDAO(ProviderDAO dao) {
		this.providerDAO = dao;
	}

	@Override
	public List<Provider> listProvider() {
		return providerDAO.findAll();
	}

	@Override
	public boolean addProvider(Provider provider) {
		provider.setCreateTime(new Date());
		provider.setLastUpdateTime(provider.getCreateTime());
		String providerId = providerDAO.save(provider);
		// add a default admin user for the provider.
		// user id is the provider is and password is "password"
		if (providerId != null && !"".equals(providerId)) {
			Users user = new Users();
			user.setUsername(providerId);
			user.setPassword(USER_DEFAULT_PASSWORD);
			user.setProviderId(providerId);
			user.setEnabled(1);
			usersDAO.save(user);
			
			Authorities auth = new Authorities();
			auth.setUsername(providerId);
			auth.setAuthority(USER_DEFAULT_ROLE);
			authoritiesDAO.save(auth);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean editProvider(Provider provider) {
		provider.setCreateTime(provider.getCreateTime());
		provider.setLastUpdateTime(new Date());
		providerDAO.update(provider);
		return true;
	}

	@Override
	public boolean removeProvider(String[] idset) {
		for (String id : idset) {
			providerDAO.delete(id);
		}
		return true;
	}

	@Override
	public boolean isProviderNoExists(String providerNo) {
		try {
			Provider entity = providerDAO.get(providerNo);
			return entity != null;
		} catch (Exception ex) {
			return true;
		}
	}

	@Override
	public Provider getProvider(String id) {
		return providerDAO.get(id);
	}

	@Override
	public Result<Provider> search(ISearchCondition searchCondition,
			int pageSize, int currentPage) {
		return providerDAO.search(searchCondition, pageSize, currentPage);
	}
}
