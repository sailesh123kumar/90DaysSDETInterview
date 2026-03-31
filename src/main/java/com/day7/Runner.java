package com.day7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
	
	public static void main(String[] args) {
		
		Calculator cal= new Calculator();   //cal--> object reference
		int result = cal.add(20, 30);
		System.out.println(result);
		
		//Reflection
		//Class Reference --> Storing the meta information of the class
		//Variables (instance/static) methods and constructors
		Class<?> clazz=Calculator.class;
		Field declaredField=null;
		try {
			declaredField = clazz.getDeclaredField("x");
			declaredField.setAccessible(true);
			Method addMethod = clazz.getMethod("add", int.class,int.class);
			Method demoMethod = clazz.getMethod("demo");
			int invoke2 = (int) addMethod.invoke(cal, 10,40);
			System.out.println(invoke2);
			Object invoke = demoMethod.invoke(null);
			
			try {
				System.out.println(declaredField.getInt(cal));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		}
		
		
		
	}

}
