package com.techlabs.abstractt.test;

import com.techlabs.abstractt.model.CommercialCustomer;
import com.techlabs.abstractt.model.Customer;
import com.techlabs.abstractt.model.ResCustomer;

public class CustomerTest {
public static void main(String[] args) {
	Customer customer[] = new Customer[3];
	
	customer[0] = new ResCustomer("Srushti", 121);
	customer[1] = new CommercialCustomer("Om", 150);
	customer[2] = new ResCustomer("Aradhya", 173);
	
	for (Customer result : customer) {
		System.out.println("Name: " +result.getName()+  ", Total Bill: " + result.calcBill());
	}
	
}
}
