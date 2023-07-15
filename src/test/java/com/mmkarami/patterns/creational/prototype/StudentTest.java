package com.mmkarami.patterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

public class StudentTest {

	@Test
	public void testShallowClone_whenGetClone_thenObjectsMustBeDifferent() {
		// Arrange
		Student student = new Student("Daryoush", new Address("Home", "Tehran, Jordan"));

		// Act
		Student clonedStudent = student.clone();

		// Assert
		assertNotEquals(student, clonedStudent, "Expecting not equal.");
	}

	@Test
	public void testDeepClone_whenGetClone_thenInnerObjectsMustBeDifferent() {
		// Arrange
		Student student = new Student("Daryoush", new Address("Home", "Tehran, Jordan"));

		// Act
		Student clonedStudent = student.clone();

		// Assert
		assertNotEquals(student.getAddress(), clonedStudent.getAddress(), "Expecting not equal.");
	}

	@Test
	public void testEquality_whenGetClone_thenObjectsInstanceVariablesShouldBeSame() {
		// Arrange
		Student student = new Student("Daryoush", new Address("Home", "Tehran, Jordan"));

		// Act
		Student clonedStudent = student.clone();

		// Assert
		assertEquals("Daryoush", clonedStudent.getName(), "Expecting equality.");
		assertEquals("Home", clonedStudent.getAddress().getName(), "Expecting equality.");
	}
}
