package com.oop.animals;

public interface PropertiesAnimals {
	public static boolean check(int[] mas) {
		for (int i : mas) {
			if (i < 0) {
				System.out.println("Error: size is not possible!!!");
				return false;
			}
		}
		return true;
	}

	public static boolean check(int i) {
		if (i < 0) {
			System.out.println("Error: size is not possible!!!");
			return false;
		}
		return true;
	}
}
