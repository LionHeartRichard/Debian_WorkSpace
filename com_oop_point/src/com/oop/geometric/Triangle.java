package com.oop.geometric;

public class Triangle extends Line {
	private int x3;
	private int y3;

	Triangle() {
		System.out.println("Constructor Triangle");
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

}
