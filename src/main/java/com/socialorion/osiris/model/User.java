package com.socialorion.osiris.model;

import javax.servlet.http.HttpSession;

public class User {
	private HttpSession session;
	private String client;
	private String operatingSystem;
	private Boolean eulaAccepted;
	
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public Boolean isEulaAccepted() {
		return eulaAccepted;
	}
	public void setEulaAccepted(Boolean eulaAccepted) {
		this.eulaAccepted = eulaAccepted;
	}
}
