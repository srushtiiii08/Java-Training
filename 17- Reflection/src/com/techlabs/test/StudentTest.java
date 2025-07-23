package com.techlabs.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.Student;

public class StudentTest {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
	
	Student students = new Student();
	
	Class c = Student.class;
//	System.out.println(c.getClass());   //will write "class" before the name
//	System.out.println(c.getName());
	
//	
//	System.out.println("\nFields are: ");
//	Field[] fields = c.getDeclaredFields();
//	for ( Field res: fields) {
//		System.out.println(res.getName());
//	}
//	
//	
//	System.out.println("\nMethods are: ");           
//	for (Method methods: c.getDeclaredMethods()) {		//Method[] methods = c.getDeclaredMethods();
//		System.out.println(methods.getName());
//		System.out.println("Return type: " + methods.getReturnType());
//		System.out.println("Modifier: " + java.lang.reflect.Modifier.toString(methods.getModifiers()));
//		System.out.println();
//	}
//	
//	
//	System.out.println("\nConstructors are: ");
//	for (Constructor result : c.getDeclaredConstructors()) {
//		System.out.println("Constructor name: " +result.getName());
//		System.out.println(result.getParameters());
//	}
	
	
//	Field fields = c.getDeclaredField("cgpa");
	
//	fields.setAccessible(true);
//	System.out.println("CGPA is: " + fields.get(students));
	
//	
//	Method method = c.getDeclaredMethod("greet");
//	method.setAccessible(true);
//	method.invoke(students);
	
	Field f = c.getDeclaredField("age");
	f.setAccessible(true);
	f.set(students, 15);
	System.out.println("Age: " +f.get(students));
	
	
}
}
