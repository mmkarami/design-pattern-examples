package com.mmkarami.patterns.creational.prototype;

import java.util.Date;

public class Student implements Cloneable {

	private String name;

	private Date birthday;

	public Student(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Student clone() {
		try {
			Student clonedStudent = (Student) super.clone();
			clonedStudent.setBirthday((Date) birthday.clone());
			return clonedStudent;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException();
		}
	}

}
