package com.techlabs.database.model;


//low level model
public class PosgreSQL implements IDatabase{

	@Override
	public void connect() {
		System.out.println("Connected to PostgreSQL..");
	}

}
