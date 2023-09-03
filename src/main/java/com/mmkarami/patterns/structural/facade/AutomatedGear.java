package com.mmkarami.patterns.structural.facade;

public class AutomatedGear {

	private Gear snowMode;

	private Gear sportMode;

	public AutomatedGear() {
		super();
		this.snowMode = new SnowMode();
		this.sportMode = new SportMode();
	}

	public String changeGearToSnowMode() {
		return this.snowMode.drive();
	}

	public String changeGearToSportMode() {
		return this.sportMode.drive();
	}
}