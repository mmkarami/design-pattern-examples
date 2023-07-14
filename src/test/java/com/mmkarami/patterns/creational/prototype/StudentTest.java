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
		Student student = new Student("Daryoush", new GregorianCalendar(1386, Calendar.MAY, 25).getTime());

		// Act
		Student clonedStudent = student.clone();

		// Assert
		assertNotEquals(student, clonedStudent, "Expecting not equal.");
	}

	@Test
	public void testEquality_whenGetClone_thenObjectsInstanceVariablesShouldBeSame() {
		// Arrange
		Student student = new Student("Daryoush", new GregorianCalendar(1386, Calendar.MAY, 25).getTime());

		// Act
		Student clonedStudent = student.clone();

		// Assert
		assertEquals("Daryoush", clonedStudent.getName(), "Expecting equality.");
		assertEquals(clonedStudent.getBirthday(), new GregorianCalendar(1386, Calendar.MAY, 25).getTime(),
				"Expecting equality.");
	}
}
