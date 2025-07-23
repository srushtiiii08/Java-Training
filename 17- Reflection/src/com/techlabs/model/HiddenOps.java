package com.techlabs.model;

public class HiddenOps {

	public String secretCode(String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
