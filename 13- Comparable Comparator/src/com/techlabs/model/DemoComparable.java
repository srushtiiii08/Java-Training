package com.techlabs.model;

public class DemoComparable implements Comparable<DemoComparable>{

	int id;
	String name;
	
	public DemoComparable(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int compareTo(DemoComparable o) {
		//sorting using id
//		return this.id - o.id; 
		
		//sorting via names in asc
		return this.name.compareTo(o.name);
		
		//sorting via names in desc order
//		return o.name.compareTo(this.name);
	}
	
	

}
