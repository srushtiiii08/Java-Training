package com.techlabs.database.model;


//low level model
public class MySQLDatabase implements IDatabase{

	@Override
	public void connect() {
		System.out.println("Connected to MySQL databse..");
	}

}
