package com.techlabs.database.model;


//low level model
public class Cloud implements IDatabase{

	@Override
	public void connect() {
		System.out.println("Connected to cloud..");
	}

}
