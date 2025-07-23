package com.MiniProject.model;

import java.util.List;

public class LIFOValuation implements IValuationStrategy{

	@Override
	public double calculateValue(List<Product> product) {
		return product.stream().mapToDouble( p-> p.getQuantity() * p.getPrice() * 0.95).sum();
	}																	//5% reduction in value

}
