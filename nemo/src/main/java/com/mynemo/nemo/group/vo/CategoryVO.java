package com.mynemo.nemo.group.vo;

public class CategoryVO {
	private String main_cate;
	private String sub_cate;
	
	public CategoryVO() {
		// TODO Auto-generated constructor stub
	}
	
	public CategoryVO(String main_cate, String sub_cate) {
		this.main_cate = main_cate;
		this.sub_cate = sub_cate;
	}

	public String getMain_cate() {
		return main_cate;
	}

	public void setMain_cate(String main_cate) {
		this.main_cate = main_cate;
	}

	public String getSub_cate() {
		return sub_cate;
	}

	public void setSub_cate(String sub_cate) {
		this.sub_cate = sub_cate;
	}
	
	
}
