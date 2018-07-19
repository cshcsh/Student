package com.java5200.model;

/**
 * User
 * @author CSH
 * @date 2018年7月16日下午2:22:25
 */
public class User {

	private Integer id;		//编号
	private String userName;//用户名
	private String password;//密码
	
	public User() {
		super();
	}
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
