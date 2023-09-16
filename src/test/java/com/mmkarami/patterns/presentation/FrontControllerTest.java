package com.mmkarami.patterns.presentation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrontControllerTest {

	@Test
	public void testChangeCarName_whenNameIsChangedInModel_thenItMustBeChangedInView() {

		// Arrange
		FrontController frontController = new FrontController();

		// Act
		String orderRequestResult = frontController.handleRequest("ORDER");
		String purchaseRequestResult = frontController.handleRequest("PURCHASE");

		// Assert
		assertEquals("Product is ordered.", orderRequestResult, "Expecting correct String.");
		assertEquals("Product is purchased.", purchaseRequestResult, "Expecting correct String.");
	}
}