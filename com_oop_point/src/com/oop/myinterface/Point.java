package com.oop.myinterface;

public class Point extends Geometric implements Coordinates {
	private double x, y;

	public double[] getCoordinates() {
		return new double[] { this.x, this.y };
	}

	Point() {
	}

	Point(double[] mas) {
		if (Coordinates.checkPointIsRange(mas[0], mas[1])) {
			this.x = mas[0];
			this.y = mas[1];
		} else {
			System.out.println("Your array is not possible!!!");
			this.x = 0.0;
			this.y = 0.0;
		}
	}

	Point(double x, double y) {
		if (Coordinates.checkPointIsRange(x, y)) {
			this.x = x;
			this.y = y;
		} else {
			this.x = 0.0;
			this.y = 0.0;
		}

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("draw POINT");
	}

}
