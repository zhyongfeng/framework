package com.fengfan.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.directwebremoting.extend.AccessDeniedException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.cache.NullUserCache;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

public class CustomJdbcDaoImpl extends JdbcDaoImpl implements IChangePassword {
	
	public static final String DEF_CHANGE_PASSWORD_SQL =
        "update users set password = ? where username = ?";
	
	
	private String changePasswordSql = DEF_CHANGE_PASSWORD_SQL;
	 
	private AuthenticationManager authenticationManager;

    private UserCache userCache = new NullUserCache();
    
	public void changePassword(String oldPassword, String newPassword) throws AuthenticationException {
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();

        if (currentUser == null) {
            // This would indicate bad coding somewhere
            throw new AccessDeniedException("Can't change password as no Authentication object found in context " +
                    "for current user.");
        }

        String username = currentUser.getName();

        // If an authentication manager has been set, re-authenticate the user with the supplied password.
        if (authenticationManager != null) {
            logger.debug("Reauthenticating user '"+ username + "' for password change request.");

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, oldPassword));
        } else {
            logger.debug("No authentication manager set. Password won't be re-checked.");
        }

        logger.debug("Changing password for user '"+ username + "'");

        getJdbcTemplate().update(changePasswordSql, newPassword, username);

        SecurityContextHolder.getContext().setAuthentication(createNewAuthentication(currentUser, newPassword));

        userCache.removeUserFromCache(username);
    }

	protected Authentication createNewAuthentication(Authentication currentAuth, String newPassword) {
        UserDetails user = loadUserByUsername(currentAuth.getName());

        UsernamePasswordAuthenticationToken newAuthentication =
                new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities());
        newAuthentication.setDetails(currentAuth.getDetails());

        return newAuthentication;
    }

	@Override
	protected UserDetails createUserDetails(String username,
			UserDetails userFromUserQuery,
			List<GrantedAuthority> combinedAuthorities) {
		String returnUsername = userFromUserQuery.getUsername();
		if (!isUsernameBasedPrimaryKey()) {
			returnUsername = username;
		}
		return new SaltedUser(returnUsername, userFromUserQuery.getPassword(),
				userFromUserQuery.isEnabled(), true, true, true,
				combinedAuthorities, ((SaltedUser) userFromUserQuery).getSalt());
	}

	@Override
	protected List<UserDetails> loadUsersByUsername(String username) {
		return getJdbcTemplate().query(getUsersByUsernameQuery(),
				new String[] { username }, new RowMapper<UserDetails>() {
					public UserDetails mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						String username = rs.getString(1);
						String password = rs.getString(2);
						boolean enabled = rs.getBoolean(3);
						String salt = rs.getString(4);
						return new SaltedUser(username, password, enabled,
								true, true, true,
								AuthorityUtils.NO_AUTHORITIES, salt);
					}
				});
	}
}
