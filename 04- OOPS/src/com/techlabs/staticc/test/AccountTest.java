package com.techlabs.staticc.test;

import com.techlabs.staticc.model.Account;

public class AccountTest {
public static void main(String[] args) {
	Account acc1 = new Account(00012);
	Account acc2 = new Account(00014);
	
	acc1.show();
	acc2.show();
	
	Account.bankName = "ICICI";
	
	acc1.show();
	acc2.show();
}
}
