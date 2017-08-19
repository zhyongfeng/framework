/** 
 *
 * @author <a href="mailto:flustar2008@163.com">flustar</a>
 * @version 1.0 
 * Creation date: Dec 25, 2007 6:32:19 PM
 */
package com.fengfan.common.bean;

import com.fengfan.service.IUsersService;

public class ValidateName {
	private IUsersService usersService;
	public IUsersService getUsersService() {
		return usersService;
	}
	public void setUsersService(IUsersService usersService) {
		this.usersService = usersService;
	}
	public String valid(String username){
		String result=null;
		if(!usersService.validateName(username)){
			result="恭喜，"+username+" 可以使用";
		}else{
			result=username+" 已存在，请换一个用户名";
		}
		return result;
	}
	
}
