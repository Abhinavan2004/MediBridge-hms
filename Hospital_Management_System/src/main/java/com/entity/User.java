package com.entity;

public class User {

	private int id ;
	private String fullname ;
	private String emailid;
	private String contact;
	
	
	public User() {
		super();
	}

	public User(String fullname, String emailid, String contact, String password) {
		super();
		this.fullname = fullname;
		this.emailid = emailid;
		this.contact = contact;
		this.password = password;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String i) {
		this.emailid = i;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password ;
	
}
