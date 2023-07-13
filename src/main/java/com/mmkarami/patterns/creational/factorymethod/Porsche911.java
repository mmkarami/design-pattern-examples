package com.mmkarami.patterns.creational.factorymethod;

public class Porsche911 implements Vehicle {
	
	@Override
	public String drive() {
		String drive = "Drive too fast.";
		System.out.println(drive);
		return drive;
	}
}
