package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bjsxt.dao.UserDao;
import com.bjsxt.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User checkUserLoginDao(String uname, String pwd) {
		//声明jdbc变量
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//声明变量
		User u =null;
		try {
			//加载驱动
				Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/407?characterEncoding=UTF-8", "root", "");
			//创建sql命令
			String sql = "select * from t_user where uname=? and pwd=?";
			//创建sql命令对象
			ps = conn.prepareStatement(sql);
				//给占位符赋值
				ps.setString(1, uname);
				ps.setString(2, pwd);
			//执行sql
			rs = ps.executeQuery();
			while(rs.next()) {
				u = new User();
				u.setUid(rs.getInt("uid"));
				u.setUname(rs.getString("uname"));
				u.setPwd(rs.getString("pwd"));
				u.setAge(rs.getInt("age"));
				u.setSex(rs.getString("sex"));
				u.setBirth(rs.getString("birth"));
				System.out.println(u);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return u;
	}

}
