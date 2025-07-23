package com.techlabs.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.MathUtil;

public class MathUtilTest {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	MathUtil util = new MathUtil();
	
	Class clazz = MathUtil.class;
	
	//1. get method object
	Method method = clazz.getDeclaredMethod("square", int.class);
	method.setAccessible(true);
	Object result = method.invoke(util, 5);
	System.out.println("Result: " +result);
	
	
}
}
