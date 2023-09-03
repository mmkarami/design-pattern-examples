package com.mmkarami.patterns.structural.facade;

public class SnowMode implements Gear {

	@Override
	public String drive() {
		return "Go carefully.";
	}
}