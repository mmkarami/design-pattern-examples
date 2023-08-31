package com.mmkarami.patterns.general.mvc;

public class CarController {

	private Car car;

	private CarView carView;

	public CarController(Car car, CarView carView) {
		super();
		this.car = car;
		this.carView = carView;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarView getCarView() {
		return carView;
	}

	public void setCarView(CarView carView) {
		this.carView = carView;
	}

	public void setCarName(String carName) {
		getCar().setName(carName);
		this.updateView();
	}

	public void updateView() {
		getCarView().printCarInfo(getCar().getName());
	}
}
