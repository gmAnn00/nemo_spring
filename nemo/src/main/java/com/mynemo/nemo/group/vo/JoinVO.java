package com.mynemo.nemo.group.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("joinVO")
public class JoinVO {
	private int group_id;
	private String user_id;
	private Date join_date;
	private int widthdraw;
	
	public JoinVO() {
		// TODO Auto-generated constructor stub
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public int getWidthdraw() {
		return widthdraw;
	}

	public void setWidthdraw(int widthdraw) {
		this.widthdraw = widthdraw;
	}
	
	

}
