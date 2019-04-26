package com.bjsxt.dao;

import com.bjsxt.pojo.User;

public interface UserDao {

	/**
	 * 根据用户名密码查询用户信息
	 * @param uname
	 * @param pwd
	 * @return
	 */
	User checkUserLoginDao(String uname,String pwd);
}
