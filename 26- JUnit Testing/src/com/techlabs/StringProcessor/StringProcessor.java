package com.techlabs.StringProcessor;

public class StringProcessor {

	public boolean isPalindrome(String s) {
        if (s == null) return false;
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
