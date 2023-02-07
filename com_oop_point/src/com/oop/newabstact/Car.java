package com.oop.newabstact;

public abstract class Car {
	protected String model;

	public abstract void go();

	public abstract void stop();

	public int pathTo(int x, int y) {
		return x + y;
	}
}
