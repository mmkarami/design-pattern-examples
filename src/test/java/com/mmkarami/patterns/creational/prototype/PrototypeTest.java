package com.mmkarami.patterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PrototypeTest {

	@Test
	public void testClone_whenGetClone_thenObjectsMustBeDifferent() {
		// Arrange
		Car car = new Car("Black", (short) 250);
		
		// Act
		Car clonedCar = car.getClone();
		
		//Assert
		assertNotEquals(clonedCar, car, "Expecting not equal.");
	}
	
	@Test
	public void testEquality_whenGetClone_thenObjectsInstanceVariablesShouldBeSame() {
		// Arrange
		Car car = new Car("Black", (short) 250);
		
		// Act
		Car clonedCar = car.getClone();
		
		//Assert
		assertEquals("Black", clonedCar.getColor(), "Expecting equality.");
		assertEquals(250, clonedCar.getSpeed(), "Expecting equality.");
	}
}
