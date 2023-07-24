package com.mynemo.nemo.group.vo;

import org.springframework.stereotype.Component;

@Component("attentVO")
public class AttendVO {

	private int attend_id;
	private int schedule_id;
	private String user_id;
	
	public AttendVO() {
		// TODO Auto-generated constructor stub
	}

	public AttendVO(int attend_id, int schedule_id, String user_id) {
		this.attend_id = attend_id;
		this.schedule_id = schedule_id;
		this.user_id = user_id;
	}

	public int getAttend_id() {
		return attend_id;
	}

	public void setAttend_id(int attend_id) {
		this.attend_id = attend_id;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
}
