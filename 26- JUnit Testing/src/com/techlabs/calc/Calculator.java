package com.techlabs.calc;

public class Calculator {

	public boolean isPrime(int num) {
		if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
	}
}
