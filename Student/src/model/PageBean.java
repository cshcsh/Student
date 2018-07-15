package com.java5200.model;

/**
 * PageBean
 * @author CSH
 * @date 2018年7月16日下午2:51:16
 */
public class PageBean {

	private Integer page; // 第几页
	private Integer rows; // 每页记录数
	private Integer start;// 起始页
	
	public PageBean() {
		super();
	}
	
	public PageBean(Integer page, Integer rows) {
		super();
		this.page = page;
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	
}
