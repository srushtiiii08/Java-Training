package com.techlabs.staticc.test;

import com.techlabs.staticc.model.StaticNonStaticCall;

public class StaticNonStaticCallTest {
public static void main(String[] args) {
	StaticNonStaticCall.showStatic();
	
	StaticNonStaticCall obj = new StaticNonStaticCall();
	obj.showNonStatic();
	
	//static method belongs to class, while non static belongsto object
}
}
