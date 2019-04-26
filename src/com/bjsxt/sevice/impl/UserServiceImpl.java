package com.bjsxt.sevice.impl;

import com.bjsxt.dao.UserDao;
import com.bjsxt.dao.impl.UserDaoImpl;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User checkUserLoginService(String uname, String pwd) {
		UserDao ud = new UserDaoImpl();
		return ud.checkUserLoginDao(uname, pwd);
	}

}
