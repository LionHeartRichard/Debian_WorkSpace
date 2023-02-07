package com.copy.calculate;

import java.util.Scanner;
import static java.lang.System.out;

public class Calculator {

	private static Scanner scanner = new Scanner(System.in);
	private static char operation;
	private static int x;
	private static int y;

	public static void main(String[] args) {
		x = getVariable();
		y = getVariable();
		operation = getOperation();
		int result;
		result = getResult(x, y, operation);
		out.println("Rezultat operation: " + x + operation + y + " = " + result);
		scanner.close();
	}

	public static int getVariable() {
		out.println("Enter variable:");
		int i;
		if (scanner.hasNextInt()) {
			i = scanner.nextInt();
		} else {
			out.println("Your input invalide data");
			scanner.next();
			i = getVariable();
		}
		return i;
	}

	public static char getOperation() {
		out.println("Enter OPERATION:");
		if (scanner.hasNext()) {
			operation = scanner.next().charAt(0);
		} else {
			out.println("Your input invalide operation!!!");
			scanner.next();
			operation = getOperation();
		}
		return operation;
	}

	public static int getResult(int x, int y, char operation) {
		int res;
		if (operation == '+') {
			res = x + y;
			return res;
		}
		if (operation == '-') {
			return res = x - y;
		}
		if (operation == '*') {
			res = x * y;
			return res;
		}
		if (operation == '/') {
			res = x / y;
			return res;
		}
		out.println("____Is not possible operation___!!!___");
		return res = getResult(x, y, getOperation());
	}
}
