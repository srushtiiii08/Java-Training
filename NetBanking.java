package com.techlabs.E_commerce;

public class NetBanking implements IPaymentGateway{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Net Banking payment of " +amount+ " was successful");
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Net Banking refund of " +amount+ " was successful");
	}

	@Override
	public String getMethodName() {
		// TODO Auto-generated method stub
		return "Net banking";
	}

}
