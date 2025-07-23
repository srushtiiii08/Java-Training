package com.techlabs.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.HiddenOps;

public class HiddenOpsTest {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	HiddenOps hidden = new HiddenOps();
	
	Class c = HiddenOps.class;
	
	Method method = c.getDeclaredMethod("secretCode", String.class);
	method.setAccessible(true);
	Object res = method.invoke(hidden, "hello");
	System.out.println("Output: " +res);
}
}
