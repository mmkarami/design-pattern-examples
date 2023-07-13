package com.mmkarami.patterns.creational.factorymethod;

public class LandRoverDefender implements Vehicle {

	@Override
	public String drive() {
		String drive = "Go anywhere, do anything.";
		System.out.println(drive);
		return drive;
	}
}