package com.swabhavtechlabs.forloop;

public class whileloops {
public static void main(String[] args) {
	
	/*int number = 4;								//factorial
	int factorial = 1;
	int i = 1;
	while (i <= number) {
		factorial*=i;
		i++;
	}
	System.out.println("factorial is " + factorial);  */
	
	
	
	/*int number = 21;							//prime
	boolean isPrime = true;
	
	if (number <= 1) {
		isPrime = false;
	}
	else {
		int i = 2;
		while (i < number) {
			if (number%i==0) {
				isPrime = false;
			}
			i++;
		}
	}
	if (isPrime) {
		System.out.println("prime");
	}
	else {
		System.out.println("non prime");
	}*/
	
	
	/*int i = 1;
	while (i <=10) {
		System.out.println(i);
		i++;
	} */
	
	
	/*int i = 1;
	while (i <= 100) {
		System.out.println(i);
		i +=2; 
	}   */
	
	
	/*int number = 123;							//rev num
	int revnumber = 0;
	while (number > 0) {
		int lastdigit = number % 10;
		revnumber = revnumber * 10 + lastdigit;
		number = number / 10;
	}
	System.out.println("reverse is " + revnumber); */
	
	
	/* int number = 1221;
	int revnumber = 0;
	int original = number;
	while (original > 0) {
		int lastdigit = original % 10;
		revnumber = revnumber * 10 + lastdigit;
		original = original / 10;
	}
	if (number == revnumber) {
		System.out.println("pallindrome");
	}
	else {
		System.out.println("not pallindrome");
	}   */
	
	/*int number = 28;						//Perfect no
	int sum = 0;
	int i = 1;
	while (i<number) {
		if (number % i == 0) {
			sum += i;
		}
		i++;
	}
	if (sum == number) {
		System.out.println("perfect number");
	}
	else {
		System.out.println("not a perfect number");
	} */
	
	
	/*int number = 153;
	int arm = 0;
	int temporary = number;
	
	while (number != 0 ) {
		int r = number % 10;
		arm = r*r*r + arm;
		number= number / 10;
	}
	if (temporary == arm) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("not an armstrong number");
	} */
}
}
