package com.oop.myinterface;

public class Triangle extends Geometric implements MathGeometric, Coordinates{

	private double height, base;

	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void draw() {
		System.out.println("draw triangle");
	}

	public double getSquare(double x, double y) {
		base = x;
		height = y;
		double square = (x * y) / 2;
		return square;
	}
	
	public double[] getCoordinates() {
		return new double[] {777.89, 999.666, 555.444, 333.111};
	}
}
