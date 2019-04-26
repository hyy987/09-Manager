package com.bjsxt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(name = "user", urlPatterns = { "/user" })
public class UserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
		req.setCharacterEncoding("UTF-8");
		//设置响应编码格式
		resp.setContentType("text/hrml;charset=utf-8");
		//获取操作符
		String oper = req.getParameter("oper");
		if("login".equals(oper)) {
			//调用登录请求处理方法
			checkUserLogin(req,resp);
		}else if("reg".equals(oper)) {
			//调用注册功能
		}else {
			System.out.println("没有找到对应操作符："+oper);
		}
		
		//获取请求信息
		//处理请求信息
		//响应处理结果
			//直接响应
			//请求转发
			//重定向
	}

	private void checkUserLogin(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}
}
