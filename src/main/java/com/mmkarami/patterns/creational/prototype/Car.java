package com.mmkarami.patterns.creational.prototype;

public class Car implements Prototype {

	private String color;

	private short Speed;

	public Car(String color, short speed) {
		super();
		this.color = color;
		Speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public short getSpeed() {
		return Speed;
	}

	public void setSpeed(short speed) {
		Speed = speed;
	}

	@Override
	public Car getClone() {
		return new Car(getColor(), getSpeed());
	}
}
