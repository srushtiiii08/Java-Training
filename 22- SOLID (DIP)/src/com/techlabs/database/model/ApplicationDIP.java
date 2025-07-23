package com.techlabs.database.model;


//High level model
public class ApplicationDIP {

	IDatabase database;     //Dependency injection
							//database is a type of obj passed only but in a form of Dependency injection
							//bcz we cannot create obj of interface
	
	public ApplicationDIP(IDatabase data) {
		this.database = data;
	}
	
	public void start() {
		database.connect();
	}
}
