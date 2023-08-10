package com.mmkarami.patterns.general.callback.asynchronous;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.junit.jupiter.api.Test;

public class AsynchronousCallbackTest {

	@Test
	public void testExecuteAction_whenExecute_thenItMustReturnCorrectString() {

		ListenerImpl listener = new ListenerImpl();
		ActionListener actionListener = listener;

		Timer timer = new Timer(3 * 1000, actionListener);
		timer.start();

		int expectedTimeToPerform = 7 * 1000;
		try {
			System.out.println("Please wait around " + expectedTimeToPerform / 1000 + " seconds.");
			Thread.sleep(expectedTimeToPerform);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		assertEquals(true, listener.isActionPerformed(), "Expecting true value.");
	}
}