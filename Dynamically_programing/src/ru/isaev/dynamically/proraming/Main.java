package ru.isaev.dynamically.proraming;

public class Main {
	public static void main(String[] args) {
		DynamicallyTest instance = new DynamicallyTest();
		for (int i = 1; i < 50; i++) {
			System.out.println("Fib CASHE " + i + " = " + instance.fibCashe(i));
		}
		
		for (int i = 1; i<50;i++) {
			System.out.println("fib for " + i + " = " + instance.fibDynamic(i));
		}
		
		ConversionNumeric convert = new ConversionNumeric();
		int rez = convert.convTwoByDec("11100010011100");
		System.out.println("11100010011100 = " + rez);
		
		System.out.println(convert.convDecByTwo(31));
	}
	
}
