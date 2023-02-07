package com.oop.geometric;

public class Rectangle extends Triangle {
	private int x4;
	private int y4;

	Rectangle() {
		System.out.println("Constructor Rectangle");
	}
	
	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getY4() {
		return y4;
	}

	public void setY4(int y4) {
		this.y4 = y4;
	}

}
