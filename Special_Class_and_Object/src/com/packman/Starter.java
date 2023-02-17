package com.packman;

public class Starter {
	public static void main(String[] args) {
		Object object = new String("tryu");
		System.out.println("1-" + object.equals(args));
		System.out.println("2-" + object.getClass());
		System.out.println("3-" + object.hashCode());
		System.out.println("4-" + object.toString());

		Class clazz = Object.class;
		Class clazz2 = object.getClass();
		Class clazz3 = object.getClass();
		Class clazz4 = Double.class;
		System.out.println("5-" + clazz.equals(clazz3));
		System.out.println("6-" + clazz4.getName());
	}
}
