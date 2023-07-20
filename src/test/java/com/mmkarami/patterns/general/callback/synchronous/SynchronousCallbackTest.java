package com.mmkarami.patterns.general.callback.synchronous;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SynchronousCallbackTest {

	@Test
	public void testExecuteAction_whenExecute_thenItMustReturnCorrectString() {
		
		// Arrange
		var listener = new ListenerImpl();
		var consumer = new Consumer(listener);
		
		// Act
		String output = consumer.doSynchronousAction();
		
		// Assert
		assertEquals("My action is performed.", output, "Expecting correct String.");
	}
}