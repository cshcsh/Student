package com.java5200.model;

/**
 * Grade
 * @author CSH
 * @date 2018年7月16日下午2:36:19
 */
public class Grade {

	private Integer id;		 //编号
	private String gradeName;//班级名称
	private String gradeDesc;//班级描述
	
	public Grade() {
		super();
	}
	
	public Grade(String gradeName, String gradeDesc) {
		super();
		this.gradeName = gradeName;
		this.gradeDesc = gradeDesc;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public String getGradeDesc() {
		return gradeDesc;
	}
	public void setGradeDesc(String gradeDesc) {
		this.gradeDesc = gradeDesc;
	}
	
}
