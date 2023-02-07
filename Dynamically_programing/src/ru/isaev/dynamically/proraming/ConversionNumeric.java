package ru.isaev.dynamically.proraming;

public class ConversionNumeric {

	public int convTwoByDec(String str) {
		int check = str.length() - 1;
		int numberToFind = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				int j = (int) Math.pow(2, check);
				numberToFind = numberToFind + j;
			}
			check--;
		}
		return numberToFind;
	}

	public String convDecByTwo(int number) {
		if (number == 0)
			return "0";
		if (number == 1)
			return "1";
		String str = "";
		while (number != 0) {
			str = (number % 2) + str;
			number = number / 2;
		}
		return str;
	}
}
