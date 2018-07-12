package com.java5200.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java5200.model.User;

/**
 * UserDao 
 * DAO :(Data Access Objects) 数据访问对象，数据访问层
 * @author CSH
 * @date 2018年7月16日下午3:09:16
 */
public class UserDao {

	//登录验证
	public User login(Connection con, User user) throws Exception {
		User resultUser = null;
		String sql = "select * from t_user where userName=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			resultUser = new User();
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}
}
