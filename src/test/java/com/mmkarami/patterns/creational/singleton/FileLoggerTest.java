package com.mmkarami.patterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class FileLoggerTest {

	@Test
	public void testInitialization_whenGetFileLogger_thenReturnFileLogger() {
		// Arrange
		Logger logger;

		// Act
		logger = FileLogger.getFileLogger();

		// Assert
		assertNotNull(logger, "Expecting an object.");
	}

	@Test
	public void testLog_whenLog_thenFileMustHaveLog() throws IOException {
		// Arrange
		Logger logger;

		// Act
		logger = FileLogger.getFileLogger();
		logger.log("Hello World.");

		// Assert
		String logFileContent = null;
		try {
			File myObj = new File("log_01.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				logFileContent = myReader.nextLine();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		assertNotNull(logFileContent, "Expecting content.");
		assertTrue(logFileContent.indexOf("Hello World.") != -1, "Expecting true by existing content.");
	}

	@Test
	public void testOneInstanceCreation_whenGetTwoLogFile_thenMustReturnOneInstance() throws IOException {
		// Arrange
		Logger firstLogger;
		Logger secondLogger;

		// Act
		firstLogger = FileLogger.getFileLogger();
		secondLogger = FileLogger.getFileLogger();

		// Assert
		assertEquals(firstLogger, secondLogger, "Expecting not equal.");
	}
}