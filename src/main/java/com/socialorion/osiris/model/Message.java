package com.socialorion.osiris.model;

import java.util.ArrayList;
import java.util.Date;

public class Message {
	private Integer id;
	private String text;
	private Integer senderId;
	private Integer receiverId;
	private Date time;
	private ArrayList<String> attachments;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getSenderId() {
		return senderId;
	}
	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}
	public Integer getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public ArrayList<String> getAttachments() {
		return attachments;
	}
	public void setAttachments(ArrayList<String> attachments) {
		this.attachments = attachments;
	}
}
