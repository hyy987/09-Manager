package com.bjsxt.test;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.bjsxt.sevice.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		UserService us = new UserServiceImpl();
		User user = us.checkUserLoginService("张三", "123");
		if(null != user) {
			System.out.println("查询成功");
		}else {
			System.out.println("查询失败");
		}
	}
}
