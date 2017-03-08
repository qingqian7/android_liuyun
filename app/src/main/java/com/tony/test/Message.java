package com.tony.test;

import java.io.Serializable;

public class Message {
	private String from_username;/*发送者*/
	private Long create_time;/*发送时间*/
	private String text;/*消息内容*/
	public String getFrom_username() {
		return from_username;
	}
	
	public Long getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public void setFrom_username(String from_username) {
		this.from_username = from_username;
	}
	
}
