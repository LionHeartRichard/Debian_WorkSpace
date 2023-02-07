package ru.isaev.dynamically.proraming;

public class DynamicallyTest {
	private static long[] cashe = new long[100];

	public long fibCashe(int n) {
		if (n <= 2)
			return 1;
		if (cashe[n] == 0)
			cashe[n] = fibCashe(n - 1) + fibCashe(n - 2);
		return cashe[n];
	}

	public long fibDynamic(int n) {
		long[] fib = new long[n + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}
}
