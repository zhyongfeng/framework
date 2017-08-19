package com.fengfan.action;

import java.util.Map;

import com.fengfan.service.IUsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport
{
	private String username;
	private String password;
	private String email;
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
        String ver2 = (String )session.get("rand");
		session.put("rand" , null);
        if (vercode.equals(ver2))
        {   if(usersService.validateName(username)!=true){
//				if (rbacUserService.addRbacUser(username, password , email)!=null)
//				{	
//					ActionContext.getContext().getSession().put("username",username);
//					return "success";
//				}
        	}
			else
			{
				addActionError("���û��Ѵ��ڣ��뻻���û���");
			}
        }
        else
        {
			addActionError("��֤�벻ƥ��,����������");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}


}