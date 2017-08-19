/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 24, 2007 2:46:49 PM
 */
package com.fengfan.action;

import java.util.Map;

import com.fengfan.service.IUsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String vercode;
	private IUsersService usersService;
	public IUsersService getUsersService() {
		return usersService;
	}
	public void setUsersService(IUsersService usersService) {
		this.usersService = usersService;
	}

	@Override
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		session.put("rand", null);
		if (vercode.equals(ver2)) {
//			Users user = rbacUserService.loginValid(username, password);
//			if (user != null) {
//				session.put("username", username);
//				return "success";
//			} else {
//				addActionError("用户名密码不匹配");
//			}
		} else {
			addActionError("验证码不匹配，请重新输入");
		}
		return "input";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

}
