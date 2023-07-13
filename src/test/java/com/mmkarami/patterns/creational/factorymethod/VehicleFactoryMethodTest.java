package com.mmkarami.patterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class VehicleFactoryMethodTest {

	@Test
	public void testNullState_whenStateIsNull_thenMustReturnNull() {
		// Arrange
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle;

		// Act
		vehicle = vehicleFactory.getVehicle(null);

		// Assert
		assertNull(vehicle, "Expecting null.");
	}
	
	@Test
	public void testOffRoadState_whenStateIsOffRoad_thenMustReturnDriveOffRoad() {
		// Arrange
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle;
		String drive;

		// Act
		vehicle = vehicleFactory.getVehicle("OffRoad");
		drive = vehicle.drive();
		
		// Assert
		assertEquals(drive, "Go anywhere, do anything.", "Expecting: Go anywhere, do anything..");
	}
	
	@Test
	public void testRaceState_whenStateIsRace_thenMustReturnDriveRace() {
		// Arrange
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle;
		String drive;

		// Act
		vehicle = vehicleFactory.getVehicle("Race");
		drive = vehicle.drive();
		
		// Assert
		assertEquals(drive, "Drive too fast.", "Expecting: Drive too fast.");
	}
}