package com.swabhavtechlabs.forloop;

public class forloops {
	public static void main(String[] args) {
		/* for (int i = 1; i <= 10; i++) {          //print 1 to 10
			System.out.println(i);
		}  */ 
		
		
		/*for (int i = 1; i<=100; i+=2) {            //odd from 1 to 100
			System.out.println(i);
		}  */
		
		
		/*int number = 4;             //factorial
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial *= i;
			}
		System.out.println("factorial is " + factorial);   */
		
		
		/*int number = 10;								//prime
		for (int i = 2; i<=number; i++); {
			if (number%i==0) {
				System.out.println("non prime");
			}
			else {
				System.out.println("prime");
			}
		}   */
		
		
		/* int number = 123;					//rev no
		int revnumber = 0;
		for (int i = 1; number > 0; i++) {
			int lastdigit = number %10;
			revnumber = revnumber * 10 + lastdigit;
			number = number / 10;
		}
		System.out.println("reserse is " + revnumber);    */
		
		
		/*int number = 28;							//Perfect no
		int sum = 0;
		for (int i = 1; i<number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}*/
		
	}

}
