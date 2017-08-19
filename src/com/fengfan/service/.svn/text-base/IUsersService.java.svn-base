package com.fengfan.service;

import com.fengfan.model.Users;


public interface IUsersService extends ISearchService{
	public void changePassword(String oldPassword, String newPassword);
	public void resetPassword(String newPassword,Users user);
	public boolean validateName(String username);
	public Users getUsers(String userName);
	public void update(Users user);
	public String addUser(Users user);
	public boolean removeUser(String[] usernames);

}
