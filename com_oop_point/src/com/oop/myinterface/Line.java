package com.oop.myinterface;

public class Line extends Point {
	private void draw(Point p1, Point p2) {
		System.out.println("draw line " + "p1:" + p1.getX() + ";" + p1.getY() + " p2:" + p2.getX() + ";" + p2.getY());
	}

	public void setCoordinates(Point p1, Point p2) {
		if (Coordinates.checkCoordinatesPoint(p1, p2)) {
			this.draw(p1, p2);
		}
	}

	public void setCoordinates(double x1, double y1, double x2, double y2) {
		Point point1 = new Point(x1, y1);
		Point point2 = new Point(x2, y2);
		this.draw(point1, point2);
	}

	public double[] getCoordinates() {
		return new double[] { 3.0, 4.1, 7.9, 9.2 };
	}
}
