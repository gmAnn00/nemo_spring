package com.mynemo.nemo.group.vo;

import java.sql.Date;

public class ScheduleVO {
	private int schedule_id;
	private Date schedule_date;
	private String schedule_time;
	private int group_id;
	private String user_id;
	private String sche_title;
	private String sche_cont;
	private String location;
	private int attendee_cnt;
	
	public ScheduleVO() {
		// TODO Auto-generated constructor stub
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
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

	public String getSche_title() {
		return sche_title;
	}

	public void setSche_title(String sche_title) {
		this.sche_title = sche_title;
	}

	public String getSche_cont() {
		return sche_cont;
	}

	public void setSche_cont(String sche_cont) {
		this.sche_cont = sche_cont;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAttendee_cnt() {
		return attendee_cnt;
	}

	public void setAttendee_cnt(int attendee_cnt) {
		this.attendee_cnt = attendee_cnt;
	}
	
	
}
