/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:07:53 PM
 */
package com.fengfan.service.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.cache.NullUserCache;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import com.fengfan.action.base.ISearchCondition;
import com.fengfan.common.result.Result;
import com.fengfan.model.Users;
import com.fengfan.model.dao.UsersDAO;
import com.fengfan.service.IUsersService;

public class UsersServiceImpl extends JdbcUserDetailsManager implements
		IUsersService {

	public void UsersService() {
		setEnableAuthorities(true);
	}

	private UsersDAO usersDAO;

	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	private String changePasswordSql = DEF_CHANGE_PASSWORD_SQL;

	private AuthenticationManager authenticationManager;

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	private UserCache userCache = new NullUserCache();

	public static final String DEF_UPDATE_USER_SQL = "update users set email = ?,description=? where username = ?";

	public void changePassword(String oldPassword, String newPassword)
			throws AuthenticationException {
		Authentication currentUser = SecurityContextHolder.getContext()
				.getAuthentication();

		if (currentUser == null) {
			// This would indicate bad coding somewhere
			throw new AccessDeniedException(
					"Can't change password as no Authentication object found in context "
							+ "for current user.");
		}

		String username = currentUser.getName();

		// If an authentication manager has been set, re-authenticate the user
		// with the supplied password.
		if (authenticationManager != null) {
			logger.debug("Reauthenticating user '" + username
					+ "' for password change request.");

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
							username, oldPassword));
		} else {
			logger.debug("No authentication manager set. Password won't be re-checked.");
		}

		logger.debug("Changing password for user '" + username + "'");

		getJdbcTemplate().update(changePasswordSql, newPassword, username);

		userCache.removeUserFromCache(username);
		SecurityContextHolder.getContext().setAuthentication(
				createNewAuthentication(currentUser, newPassword));

	}

	public void resetPassword(String newPassword, Users user)
			throws AuthenticationException {
		logger.debug("Resetting password for user '" + user.getUsername() + "'");
		try {
			getJdbcTemplate().update(changePasswordSql, newPassword,user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(final Users user) {
		getJdbcTemplate().update(DEF_UPDATE_USER_SQL,
				new PreparedStatementSetter() {
					public void setValues(PreparedStatement ps)
							throws SQLException {
						ps.setString(1, user.getEmail());
						ps.setString(2, user.getDescription());
						ps.setString(3, user.getUsername());
					}
				});
	}

	@Override
	public boolean removeUser(String[] usernames) {
		for (String id : usernames) {
			usersDAO.delete(id);
		}
		return true;
	}

	public boolean validateName(String username) {
		Users u = usersDAO.get(username);
		if (u != null) {
			return true;
		}
		return false;
	}

	public Users getUsers(String userName) {
		return usersDAO.get(userName);
	}

	@Override
	public Result<Users> search(ISearchCondition searchCondition, int pageSize,
			int currentPage) {
		return usersDAO.search(searchCondition, pageSize, currentPage);
	}

	@Override
	public String addUser(Users user) {
		return usersDAO.save(user);
	}

}
