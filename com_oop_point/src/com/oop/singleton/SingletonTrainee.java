package com.oop.singleton;

public class SingletonTrainee {

	private int x, y;
	private static int count;

	static {
		count = 0;
	}

	{
		x = 0;
		y = 0;
	}

	private static SingletonTrainee singleton;

	private SingletonTrainee() {
		count++;
	}

	public static SingletonTrainee getInstance() {
		if (singleton == null) {
			singleton = new SingletonTrainee();
		}
		return singleton;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}
}
