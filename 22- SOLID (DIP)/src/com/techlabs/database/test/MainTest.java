package com.techlabs.database.test;

import com.techlabs.database.model.ApplicationDIP;
import com.techlabs.database.model.Cloud;
import com.techlabs.database.model.MySQLDatabase;
import com.techlabs.database.model.PosgreSQL;

public class MainTest {
public static void main(String[] args) {
	
	ApplicationDIP app = new ApplicationDIP(new MySQLDatabase());
	app.start();
	
	
	ApplicationDIP app2 = new ApplicationDIP(new PosgreSQL());
	app2.start();
	
	
	ApplicationDIP app3 = new ApplicationDIP(new Cloud());
	app3.start();
	
}
}
