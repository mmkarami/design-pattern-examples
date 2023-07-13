package com.mmkarami.patterns.creational.factorymethod;

public class VehicleFactory {

	public Vehicle getVehicle(String state) {
		
		if (state == null) {
			return null;
		} else if (state.equalsIgnoreCase("OffRoad")) {
			return new LandRoverDefender();

		} else if (state.equalsIgnoreCase("Race")) {
			return new Porsche911();
		}
		return null;
	}
}