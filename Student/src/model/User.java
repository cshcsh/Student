package com.java5200.model;

/**
 * User
 * @author CSH
 * @date 2018��7��16������2:22:25
 */
public class User {

	private Integer id;		//���
	private String userName;//�û���
	private String password;//����
	
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
