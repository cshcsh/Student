package com.java5200.model;

import java.util.Date;

/**
 * Student
 * @author CSH
 * @date 2018年7月16日下午2:22:43
 */
public class Student {

	private Integer id;		//编号
	private String stuNo;	//学号
	private String stuName;	//姓名
	private String sex;		//性别
	private Date birthday;	//生日
	private Integer gradeId=-1;	//班级
	private String email;	//邮箱
	private String stuDesc;	//描述
	
	public Student() {
		super();
	}
	
	public Student(String stuNo, String stuName, String sex, Date birthday, Integer gradeId, String email,
			String stuDesc) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.sex = sex;
		this.birthday = birthday;
		this.gradeId = gradeId;
		this.email = email;
		this.stuDesc = stuDesc;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStuDesc() {
		return stuDesc;
	}
	public void setStuDesc(String stuDesc) {
		this.stuDesc = stuDesc;
	}
	
}
