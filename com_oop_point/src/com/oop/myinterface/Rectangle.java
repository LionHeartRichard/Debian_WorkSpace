package com.oop.myinterface;

public class Rectangle extends Point implements MathGeometric {
	private void draw(Point p1, Point p2, Point p3, Point p4) {
		System.out.println("draw rectangle p1: " + p1.getX() + "; " + p1.getY() + ";");
		System.out.println(" p2: " + p2.getX() + "; " + p2.getY());
		System.out.println(" p3: " + p3.getX() + "; " + p3.getY());
		System.out.println(" p4: " + p4.getX() + "; " + p4.getY());
	}

	public void setCoordinates(Point p1, Point p2, Point p3, Point p4) {
		this.draw(p1, p2, p3, p4);
	}

	public void setCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);
		Point p4 = new Point(x4, y4);
		this.draw(p1, p2, p3, p4);
	}

	public double getSquare(double x, double y) {
		return x * y;
	}

	public double[] getCoordinates() {
		return new double[] { 234, 3576, 99.4567, 3.14 };
	}
}
