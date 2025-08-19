package com.entity;

public class Specialist {
	String spec_name ;
	String category ;
	String contact_no ;
	int id ;

	public Specialist(String spec_name, String category, String contact_no, int id) {
		super();
		this.spec_name = spec_name;
		this.category = category;
		this.contact_no = contact_no;
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	
	public String getSpec_name() {
		return spec_name;
	}
	public void setSpec_name(String spec_name) {
		this.spec_name = spec_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
