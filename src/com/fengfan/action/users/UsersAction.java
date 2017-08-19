package com.fengfan.action.users;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.fengfan.action.base.ActionUtils;
import com.fengfan.action.base.BaseAction;
import com.fengfan.common.util.Constants;
import com.fengfan.model.Users;
import com.fengfan.model.enums.UserStatus;
import com.fengfan.model.enums.YesNoRadio;
import com.fengfan.service.ISearchService;
import com.fengfan.service.IUsersService;

public class UsersAction extends BaseAction {

	private IUsersService usersService;
	private UserSearchCondition searchCondition;
	public UserStatus[] getUserStatuses() {
		return userStatuses;
	}
	public void setUserStatuses(UserStatus[] userStatuses) {
		this.userStatuses = userStatuses;
	}
	public void setYesNoRadios(YesNoRadio[] yesNoRadios) {
		this.yesNoRadios = yesNoRadios;
	}

	private UserStatus[] userStatuses = UserStatus.values();
	private YesNoRadio[] yesNoRadios = YesNoRadio.values();
	private Users users;

	public UserStatus[] getUserStatus() {
		return userStatuses;
	}
	public YesNoRadio[] getYesNoRadios() {
		return yesNoRadios;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public IUsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(IUsersService usersService) {
		this.usersService = usersService;
	}

	public String changePassword() throws Exception {
		return "change_password";
	}

	public String processChangePassword() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();

		String oldPassword = (String) request.getParameter("old_password");
		String newPassword = (String) request.getParameter("new_password");
		String confirmPassword = (String) request.getParameter("confirm_password");
		if(!newPassword.equals(confirmPassword)){
			request.setAttribute("error", "PasswordNotEqual");
			return "change_password";
		}
		
		Users user = (Users) request.getSession().getAttribute("SessionUser");
		
		if(!oldPassword.equals(user.getPassword())){
			request.setAttribute("error", "WrongPassword");
			return "change_password";
		}
		usersService.changePassword(oldPassword, newPassword);
		user.setPassword(newPassword);
		
		systemLogWithDesc(Users.class,user.getUsername(),user.getProviderId(), "修改密码");

		// go to index by role after changing password
		String url = request.getRequestURI();
		if (url.indexOf("admin_provider") != -1) {
			return "index_provider";
		} else {
			return "index_admin";
		}
	}

	public String resetPassword() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("id");
		this.users = usersService.getUsers(id);
		return "reset_password";
	}
	
	public String processResetPassword() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("users.username");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		if(!newPassword.equals(confirmPassword)){
			request.setAttribute("error", "PasswordNotEqual");
			this.users = usersService.getUsers(id);
			return "reset_password";
		}
		if(!StringUtils.isEmpty(id)){
			Users entity = usersService.getUsers(id);
			if(entity != null){
				usersService.resetPassword(newPassword, entity);
				systemLogWithDesc(Users.class, id,entity.getProviderId(), "重置密码");
			}
		}
		return "redirect";
	}
	
	public String profile() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String url = request.getRequestURI();
		
		if(url.indexOf("admin_provider") != -1){
            return "profile_provider";
        }else{
        	return "profile_admin";
        }
	}

	public String list() throws Exception{
		search();
		return "list";
	}
	
	public String add() throws Exception{
		if(ActionUtils.isPostMethod()){
			HttpServletRequest request = ServletActionContext.getRequest();
			String password = request.getParameter("password");
			String verifyPpassword = request.getParameter("verify_password");
			if(StringUtils.isEmpty(password)){
				this.addFieldError("password", "密码不能为空！");
				return "input";
			}
			if(!StringUtils.equals(password, verifyPpassword)){
				this.addFieldError("verify_password", "密码与确认密码不一致！");
				return "input";
			}
			this.users.setPassword(password);
			try{
			if(null == usersService.addUser(users)){
				this.addFieldError("customer.id", "用户编号必须唯一");
				return "input";
			}
			}catch(Exception ex){
				ex.printStackTrace();
			}
			systemLogAdd(users.getClass(), users.getUsername(),users.getProviderId());
			return "redirect";
		}else{
			return "add";
		}
	}
	
	public String edit() throws Exception{
		return update();
	}
	
	public String view() throws Exception{
		try {
			String id = ServletActionContext.getRequest().getParameter("id");
			this.users = usersService.getUsers(id);
		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("exception", e.getMessage());
			return "exception";
		}
		return "view";
	}
	
	public String update() throws Exception{
		try {
			String username = ServletActionContext.getRequest().getParameter("id");
			if(StringUtils.isEmpty(username)){
				usersService.update(users);
				HttpServletRequest request = ServletActionContext.getRequest();
				request.getSession().setAttribute(Constants.SESSION_USER_KEY, users);
				return profile();
			}else{
				if(ActionUtils.isPostMethod()){
					Users entity = usersService.getUsers(username);
					ActionUtils.CopyFormDataToEntity(users, entity, "users.");
					usersService.update(entity);
					systemLogUpdate(entity.getClass(), entity.getUsername(),entity.getProviderId());
					return "redirect";
				}else{
					this.users = usersService.getUsers(username);
					return "edit";
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("exception", e.getMessage());
			return "exception";
		}
	}
	
	public String remove() throws Exception{
		String id = ServletActionContext.getRequest().getParameter("users");
		if(!StringUtils.isEmpty(id)){
			Users entity = usersService.getUsers(id);
			usersService.removeUser(new String[]{id});
			systemLogDelete(Users.class, id,entity.getProviderId());
		}
		return "redirect";
	}
	
	
	@Override
	public ISearchService getSearchService() {
		return usersService;
	}

	@Override
	public UserSearchCondition getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(UserSearchCondition searchCondition) {
		this.searchCondition = searchCondition;
	}

}
