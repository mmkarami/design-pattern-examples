package com.mmkarami.patterns.structural.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FacadeTest {

	@Test
	public void testChangeMode_whenChangeToSnowMode_thenItMustBeDriveCarefully() {

		// Arrange
		AutomatedGear automatedGear = new AutomatedGear();
		String drive;

		// Act
		drive = automatedGear.changeGearToSnowMode();

		// Assert
		assertEquals("Go carefully.", drive, "Expecting correct String.");
	}
	
	@Test
	public void testChangeMode_whenChangeToSportMode_thenItMustBeDriveFast() {

		// Arrange
		AutomatedGear automatedGear = new AutomatedGear();
		String drive;

		// Act
		drive = automatedGear.changeGearToSportMode();

		// Assert
		assertEquals("Go very fast.", drive, "Expecting correct String.");
	}

}