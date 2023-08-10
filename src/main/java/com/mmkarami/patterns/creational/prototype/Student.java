package com.mmkarami.patterns.creational.prototype;

public class Student implements Cloneable {

	private String name;

	private Address address;

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Student clone() {
		try {
			Student clonedStudent = (Student) super.clone();
			clonedStudent.setAddress(clonedStudent.getAddress().clone());
			return clonedStudent;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException();
		}
	}

}
