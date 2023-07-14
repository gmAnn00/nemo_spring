package com.mynemo.nemo.group.vo;

import java.sql.Date;

public class AttendVO {

	private int attend_id;
	private int group_id;
	private Date schedule_date;
	private String schedule_time;
	private String user_id;
	
	public AttendVO() {
		// TODO Auto-generated constructor stub
	}

	public int getAttend_id() {
		return attend_id;
	}

	public void setAttend_id(int attend_id) {
		this.attend_id = attend_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public Date getSchedule_date() {
		return schedule_date;
	}

	public void setSchedule_date(Date schedule_date) {
		this.schedule_date = schedule_date;
	}

	public String getSchedule_time() {
		return schedule_time;
	}

	public void setSchedule_time(String schedule_time) {
		this.schedule_time = schedule_time;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
}
