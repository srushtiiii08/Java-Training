package com.MiniProject.model;

import java.util.List;

public interface IValuationStrategy {     //new strategy can be added

	double calculateValue(List<Product> product);
}
