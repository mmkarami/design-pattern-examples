package com.mmkarami.patterns.presentation;

public class Dispacher {

	private ProductOrderHandler productOrderHandler;

	private ProductPurchaseHandler productPurchaseHandler;

	private NotFoundRequestHandler notFoundRequestHandler;

	public Dispacher() {
		this.productOrderHandler = new ProductOrderHandler();
		this.productPurchaseHandler = new ProductPurchaseHandler();
	}

	public String dispatch(String request) {

		if ("ORDER".equals(request)) {
			return getProductOrderHandler().orderProduct();
		} else if ("PURCHASE".equals(request)) {
			return getProductPurchaseHandler().purchaseProduct();
		} else {
			return getNotFoundRequestHandler().notFoundRequest();
		}
	}

	public ProductOrderHandler getProductOrderHandler() {
		return productOrderHandler;
	}

	public ProductPurchaseHandler getProductPurchaseHandler() {
		return productPurchaseHandler;
	}

	public NotFoundRequestHandler getNotFoundRequestHandler() {
		return notFoundRequestHandler;
	}
}