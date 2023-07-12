package com.mmkarami.patterns.creational.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

	private static FileLogger logger = null;

	private FileLogger() {
	}

	public static Logger getFileLogger() {
		if (logger == null) {
			synchronized (FileLogger.class) {
				if (logger == null)
					logger = new FileLogger();
			}
		}
		return logger;
	}

	public synchronized void log(String log) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("log_01.txt"));
		writer.write(log);
		writer.close();
	}
}