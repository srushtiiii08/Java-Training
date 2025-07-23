package com.MiniProject.model;

public class SMSNotifier implements INotifier{

	@Override
	public void notifyLowStock(Product product) {
		System.out.println("[SMS] Low stock alert for " +product.getName());
	}

}
