package com.mmkarami.patterns.general.mvc;

public class CarView {

	public void printCarInfo(String carName) {
		String lable = "Car name: ";
		System.out.printf("%s%s", lable, carName);
	}
}