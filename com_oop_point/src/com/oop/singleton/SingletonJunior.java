package com.oop.singleton;

public class SingletonJunior {
	private static int count;
	static {
		count = 0;
	}
	
	private static SingletonJunior singleton;
	private SingletonJunior() {
		count++;
	}
	public synchronized static SingletonJunior getInstance() {
		if (singleton == null) {
			singleton = new SingletonJunior();
		}
		return singleton;
	}
	public int getCount() {
		return count;
	}
}
