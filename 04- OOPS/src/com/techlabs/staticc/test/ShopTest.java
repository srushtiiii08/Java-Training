package com.techlabs.staticc.test;

import com.techlabs.staticc.model.Shop;

public class ShopTest {
public static void main(String[] args) {
	double total = Shop.calcTotal(1002);
	System.out.println("Total cost with tax: " +total);
}
}
