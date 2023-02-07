package com.oop.myinterface;

public interface Coordinates {
	public static final int MAX_COORD = 1000;
	int MIN_COORD = -1000;

	public static void showAllovableRange() {
		System.out.println("[" + MIN_COORD + ";" + MAX_COORD + "]");
	}

	public static boolean checkPointIsRange(double x, double y) {
		if (x > MAX_COORD || x < MIN_COORD || y > MAX_COORD || y < MIN_COORD) {
			System.out.println("Error: You exceeded range!!!");
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean checkCoordinatesPoint(Point p1, Point p2) {
		if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
			System.out.println("Error: Point coordinates is not possible!!!");
			return false;
		}
		return true;
	}

	public double[] getCoordinates();
}
