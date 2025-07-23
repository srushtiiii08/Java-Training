package com.techlabs.Product;

import java.util.Comparator;

public class ComparatorSort implements Comparator<Product>{

	@Override
	public int compare(Product a, Product b) {
		
		//category compare
		int categorySort = a.category.compareTo(b.category);
		if (categorySort != 0) {
			return categorySort; 	//diff category,sorting done
		}
		
		//price within category
		if (a.price<b.price)
			return -1; //a before b
		if (a.price>b.price)
			return 1; //a after b
		return 0; //same price
					
	}

}
