package com.mmkarami.patterns.creational.prototype;

public class Address implements Cloneable {

	private String name;
	
	private String location;
	
	public Address(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}