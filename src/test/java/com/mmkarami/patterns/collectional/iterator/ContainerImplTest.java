package com.mmkarami.patterns.collectional.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mmkarami.patterns.collectional.iterator.ContainerImpl;

public class ContainerImplTest {

	@Test
	public void testEmtyInitialization_whenInitialContainerEmpty_thenContainerSizeShouldBeZero() {
		// Arrange
		ContainerImpl<String> containerImpl;

		// Act
		containerImpl = new ContainerImpl<String>();

		// Assert
		assertEquals(0, containerImpl.size(), "Expecting 0 value.");
	}

	@Test
	public void testInitializationBySpecificSize_whenInitialContainerViaSpecificSize_thenContainerSizeMustBeZero() {
		// Arrange
		ContainerImpl<Integer> containerImpl;

		// Act
		containerImpl = new ContainerImpl<>(7);

		// Assert
		assertEquals(0, containerImpl.size(), "Expecting 7 value.");
	}

	@Test
	public void testZize_whenAddOneElement_thenSizeMustBeOne() {
		// Arrange
		ContainerImpl<String> containerImpl = new ContainerImpl<String>(10);
		
		//Act
		containerImpl.add("First");
		
		//Assert
		assertEquals(1, containerImpl.size(), "Expecting 1.");
	}
}