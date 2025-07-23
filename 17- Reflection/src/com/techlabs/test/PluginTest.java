package com.techlabs.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.Plugin;

public class PluginTest {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	
	Plugin plug = new Plugin();
	
	Class c = Plugin.class;
	
	//1. Acess pvt constructor
	System.out.println("\nConstructors are: ");
	for (Constructor result : c.getDeclaredConstructors()) {
		System.out.println("Constructor name: " +result.getName());
	}
	
	//2. set version = 3.1
	Field versionField = c.getDeclaredField("version");
	versionField.setAccessible(true);
	versionField.set(plug, 3.1);
	System.out.println("Updated version is: " +versionField.get(plug));
	
	//3. call execute() method
	System.out.println();
	Method methodExecute = c.getDeclaredMethod("execute");
	methodExecute.setAccessible(true);
	methodExecute.invoke(plug);
	
	//4.print version
	System.out.println("\nVersion: " +versionField.get(plug));
	
}
}
