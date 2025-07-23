package com.MiniProject.model;

public class EmailNotifier implements INotifier{

	@Override
	public void notifyLowStock(Product product) {
		System.out.println("[EMAIL] Low stock alert for " +product.getName());
	}

}
