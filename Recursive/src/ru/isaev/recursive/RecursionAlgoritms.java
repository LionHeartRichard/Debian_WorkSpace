package ru.isaev.recursive;

public class RecursionAlgoritms {
	public void numberDecomposition(long number) {
		if (0 == number)
			return;
		System.out.printf(" " + number % 10);
		number = number / 10;
		numberDecomposition(number);
	}

	public long factorial(long number) {
		if (0 == number)
			return 1;
		return factorial(number - 1) * number;
	}

	public int grandCommonDivisor(int a, int b) {
		if (b == 0)
			return a;
		return grandCommonDivisor(b, a % b);
	}

	public int exponentiation(int a, int n) {
		if (n == 0)
			return 1;
		if (n % 2 != 0)
			return a * exponentiation(a, n - 1);
		else
			return exponentiation(a * a, n / 2);
	}

	public int fibonacci(int n) {
		if (n <= 1)
			return (n);
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public void hanoi(int n, int i, int k) {
		if (n == 1)
			System.out.println("Move disk N_1 from pin " + i + " to " + k);
		else {
			int tmp = 6 - i - k;
			hanoi(n - 1, i, tmp);
			System.out.println("Move disk N_" + n + "from pin " + i + " to " + k);
			hanoi(n - 1, tmp, k);
		}
		
	}
}
