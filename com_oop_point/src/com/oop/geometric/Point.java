package com.oop.geometric;

public class Point extends Geometric {

	private int x1;
	private int y1;

	{
		x1 = 0;
		y1 = 0;
	}

	Point() {
		System.out.println("Constructor Point");
	}

	Point(int x1, int y1) {
		System.out.println("Constructor Point args x1 and y1");
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public void setPoint(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public int[] getPoint() {
		return new int[] { x1, y1 };
	}

}
