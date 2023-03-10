package org.oop.mytype;

import java.util.Scanner;

class MyNumberType<Boolean, T extends Number> {
	Boolean typeData;
	T value;
}

public class MainMyType {

	private static Scanner scanner = new Scanner(System.in);
	private static char ch;
	public static final char[] MAS_CHAR = { '+', '-', '/', '*' };
	private static MyNumberType typeMy;

	public static void main(String[] args) {
		System.out.println("Enter a variable:");
		getVariable();
		if ((boolean) typeMy.typeData) {
			double x = (double) typeMy.value;
			System.out.println(x);
		} else {
			long x = (long) typeMy.value;
			System.out.println(x);
		}

		System.out.println();
	}

	
	
	
	private static MyNumberType getVariable() {
		if (scanner.hasNextDouble()) {
			typeMy = new MyNumberType<Boolean, Double>();
			typeMy.value = scanner.nextDouble();
			typeMy.typeData = true;
			return typeMy;
		}
		if (scanner.hasNextLong()) {
			typeMy = new MyNumberType<Boolean, Long>();
			typeMy.value = scanner.nextLong();
			typeMy.typeData = false;
			return typeMy;
		}
		System.out.println("Error: You entered to variable! Value variable is not possible!");
		return getVariable();
	}

}
