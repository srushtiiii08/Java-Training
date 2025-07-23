package com.MiniProject.model;

import java.util.List;

public class FIFOValuation implements IValuationStrategy{

	@Override
	public double calculateValue(List<Product> product) {
		return product.stream().mapToDouble(p -> p.getQuantity() * p.getPrice()).sum();
	}

}
