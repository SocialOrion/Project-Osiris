package com.socialorion.osiris.model;

import java.util.ArrayList;

public class Conversation {
	private Integer id;
	private ArrayList<Message> messageList;
	private Boolean active;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ArrayList<Message> getMessageList() {
		return messageList;
	}
	public void setMessageList(ArrayList<Message> messageList) {
		this.messageList = messageList;
	}
	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
}
