package com.mmkarami.patterns.general.mvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MVCTest {

	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	private final PrintStream printStream = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(byteArrayOutputStream));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(printStream);
	}

	@Test
	public void testChangeCarName_whenNameIsChangedInModel_thenItMustBeChangedInView() {

		// Arrange
		Car carModel = new Car("land rover defender");
		CarView carView = new CarView();
		CarController carController = new CarController(carModel, carView);

		// Act
		carController.setCarName("land rover defender 2023");

		// Assert
		assertEquals("Car name: " + "land rover defender 2023", byteArrayOutputStream.toString(),
				"Expecting correct String.");
	}
}