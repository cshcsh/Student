package com.java5200.model;

import java.util.Date;

/**
 * Student
 * @author CSH
 * @date 2018��7��16������2:22:43
 */
public class Student {

	private Integer id;		//���
	private String stuNo;	//ѧ��
	private String stuName;	//����
	private String sex;		//�Ա�
	private Date birthday;	//����
	private Integer gradeId=-1;	//�༶
	private String email;	//����
	private String stuDesc;	//����
	
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