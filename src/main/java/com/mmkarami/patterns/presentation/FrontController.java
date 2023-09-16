package com.mmkarami.patterns.presentation;

public class FrontController {

	private Dispacher dispacher;

	public static int count = 0;

	public FrontController() {
		this.dispacher = new Dispacher();
	}

	private boolean checkAuthentication() {
		return true;
	}

	private void logRequestCount(String requet) {
		System.out.println(++count);
	}
	
	public String handleRequest(String request) {
		
		logRequestCount(request);
		
		if (checkAuthentication()) {
			return getDispacher().dispatch(request);
		} else {
			return "Unauthenticated.";
		}
	}

	public Dispacher getDispacher() {
		return dispacher;
	}
}