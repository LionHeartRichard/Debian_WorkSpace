package com.oop.geometric;

public class Line extends Point {
	private int x2;
	private int y2;
	
	Line() {
		System.out.println("Constructor Line");
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public int[] getLine() {
		int[] mas = new int[4];
		mas[0] = this.getX1();
		mas[1] = this.getY1();
		mas[2] = x2;
		mas[3] = y2;
		return mas;
	}
}
