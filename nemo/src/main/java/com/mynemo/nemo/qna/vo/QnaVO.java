package com.mynemo.nemo.qna.vo;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component("qnaVO")
public class QnaVO {
	private int qna_no;
	private String user_id;
	private int parent_no;
	private String title;
	private String content;
	private Timestamp create_date;
	
	public QnaVO() {
		// TODO Auto-generated constructor stub
	}

	public int getQna_no() {
		return qna_no;
	}

	public void setQna_no(int qna_no) {
		this.qna_no = qna_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getParent_no() {
		return parent_no;
	}

	public void setParent_no(int parent_no) {
		this.parent_no = parent_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	
	
}
