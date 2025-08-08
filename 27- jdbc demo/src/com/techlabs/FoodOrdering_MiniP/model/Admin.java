package com.techlabs.FoodOrdering_MiniP.model;

public class Admin {

	private int adminId;
    private String username;
    private String password;

    public Admin() { }

	public int getAdminId() {
		return adminId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin(int adminId, String username, String password) {
		this.adminId = adminId;
		this.username = username;
		this.password = password;
	}
    
    
}
