package org.myarraylist;

public class Main {
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<>();
		System.out.println(list.length());

		for (int i = 0; i < 1000; i++) {
			list.add("str" + i);
		}

		for (int i = 0; i < list.length(); i++) {
			System.out.println(list.get(i));
		}

		myPrint(43);
		myPrint("Alexey");
		myPrint(list);
	}

	public static <T> void myPrint(T parametr) {
		System.out.println(parametr);
	}
}
