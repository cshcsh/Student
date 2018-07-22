package com.java5200.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DbUtil
 * @author CSH
 * @date 2018年7月16日下午3:07:52
 */
public class DbUtil {

	private String jdbcName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/db_studentInfo";
	private String dbUserName="root";
	private String dbPassword="123456";
	
	//获取数据库连接
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName(jdbcName);
		Connection connection=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		if(connection!=null){
			System.out.println("数据库连接成功");
		}else{
			System.out.println("数据库连接失败");
		}
		return connection;
	}
	
	//关闭数据库连接
	public void closeConnetion(Connection connection) throws SQLException{
		if(connection!=null){
			connection.close();
			System.out.println("数据库关闭成功");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DbUtil dbUtil=new DbUtil();
		Connection connection=dbUtil.getConnection();
		if(connection!=null){
			System.out.println("数据库连接成功");
		}else{
			System.out.println("数据库连接失败");
		}
	}

}
