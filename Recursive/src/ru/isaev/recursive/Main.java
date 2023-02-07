package ru.isaev.recursive;

public class Main {

	public static void main(String[] args) {
		RecursionAlgoritms instance = new RecursionAlgoritms();
		instance.numberDecomposition(123456789);
		System.out.println("");
		System.out.println("Factorial = " + instance.factorial(5));
		System.out.println("Grand common divisor = " + instance.grandCommonDivisor(12, 8));
		System.out.println("Exponentiation = " + instance.exponentiation(12, 2));
		System.out.println("Fibonacci = "  + instance.fibonacci(10));
		instance.hanoi(4, 1, 2);
	}

}
