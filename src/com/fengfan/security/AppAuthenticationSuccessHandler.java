package com.fengfan.security;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.fengfan.common.util.Constants;
import com.fengfan.model.Users;
import com.fengfan.model.dao.iface.UsersDAO;

public class AppAuthenticationSuccessHandler extends
		SimpleUrlAuthenticationSuccessHandler {
	
	

	@Autowired
	private UsersDAO usersDAO;

	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws ServletException, IOException {

		handle(request, response, authentication);

		HttpSession session = request.getSession(false);

		if (session == null) {
			return;
		}

		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);

		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		Users currentUser = usersDAO.get(userDetails.getUsername());
		session.setAttribute(Constants.SESSION_USER_KEY, currentUser);
		
		boolean isAdmin = false;
		Set<GrantedAuthority> dbAuthsSet = new HashSet<GrantedAuthority>();
		dbAuthsSet.addAll(userDetails.getAuthorities());
		for(GrantedAuthority grantedAuthority : dbAuthsSet){
			String role = grantedAuthority.getAuthority();
			if("ROLE_ADMIN".equals(role)){
				isAdmin = true;
				break;
			}
		}
		String role = isAdmin ? Constants.ADMIN_ROLE : Constants.USER_ROLE;
		session.setAttribute(Constants.SESSION_USER_ROLE, role);

	}
}