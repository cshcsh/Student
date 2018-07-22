package com.java5200.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DbUtil
 * @author CSH
 * @date 2018��7��16������3:07:52
 */
public class DbUtil {

	private String jdbcName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/db_studentInfo";
	private String dbUserName="root";
	private String dbPassword="123456";
	
	//��ȡ���ݿ�����
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName(jdbcName);
		Connection connection=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		if(connection!=null){
			System.out.println("���ݿ����ӳɹ�");
		}else{
			System.out.println("���ݿ�����ʧ��");
		}
		return connection;
	}
	
	//�ر����ݿ�����
	public void closeConnetion(Connection connection) throws SQLException{
		if(connection!=null){
			connection.close();
			System.out.println("���ݿ�رճɹ�");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DbUtil dbUtil=new DbUtil();
		Connection connection=dbUtil.getConnection();
		if(connection!=null){
			System.out.println("���ݿ����ӳɹ�");
		}else{
			System.out.println("���ݿ�����ʧ��");
		}
	}

}
