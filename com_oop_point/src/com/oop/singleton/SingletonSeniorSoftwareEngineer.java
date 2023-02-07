package com.oop.singleton;

public class SingletonSeniorSoftwareEngineer {
	private static int count;
	static {
		count = 0;
	}

	private static volatile SingletonSeniorSoftwareEngineer singleton;

	private SingletonSeniorSoftwareEngineer() {
		count++;
	}

	public static SingletonSeniorSoftwareEngineer getInstance() {
		if (singleton == null) {
			synchronized (SingletonSeniorSoftwareEngineer.class) {
				if (singleton == null) {
					singleton = new SingletonSeniorSoftwareEngineer();
				}
			}
		}
		return singleton;
	}

	public int getCount() {
		return count;
	}
}
