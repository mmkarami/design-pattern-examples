package com.mmkarami.patterns.collectional.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContainerImplTest {

	@Test
	public void testEmtyInitialization_whenInitialContainerEmpty_thenContainerSizeShouldBeZero() {
		// Arrange
		Container<String> container;

		// Act
		container = new ContainerImpl<String>();

		// Assert
		assertEquals(0, container.size(), "Expecting 0 value.");
	}

	@Test
	public void testInitializationBySpecificSize_whenInitialContainerViaSpecificSize_thenContainerSizeMustBeZero() {
		// Arrange
		Container<Integer> container;

		// Act
		container = new ContainerImpl<>(7);

		// Assert
		assertEquals(0, container.size(), "Expecting 7 value.");
	}

	@Test
	public void testSize_whenAddOneElement_thenSizeMustBeOne() {
		// Arrange
		Container<String> container = new ContainerImpl<String>(10);
		
		//Act
		container.add("First");
		
		//Assert
		assertEquals(1, container.size(), "Expecting 1.");
	}
	
	@Test
	public void testGrow_whenAddMoreThanDefaultCapacity_thenContainerSizeMustBeGrow() {
		//Arrange
		Container<Integer> container = new ContainerImpl<>();
		
		//Act
		container.add(1);
		container.add(2);
		container.add(3);
		container.add(4);
		container.add(5);
		container.add(6);
		container.add(7);
		container.add(8);
		container.add(9);
		container.add(10);
		container.add(11);
		
		//Assert
		assertEquals(11, container.size(), "Expecting 11.");
	}
	
	
	
}