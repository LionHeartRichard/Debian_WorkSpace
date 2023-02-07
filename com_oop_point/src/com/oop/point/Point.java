package com.oop.point;

public class Point {
	private int x, y;

	{
		x = 0;
		y = 0;
	}

	public Point() {
	}

	public Point(int x, int y) {
		if (x < 0) {
			this.x = 0;
		} else {
			this.x = x;
		}
		if (y < 0) {
			this.y = 0;
		} else {
			this.y = y;
		}
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
	
	public int drowLine() {
		return this.y - this.x;
	}
}
