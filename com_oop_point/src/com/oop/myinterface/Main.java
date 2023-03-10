package com.oop.myinterface;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
	public static void main(String[] args) {
		Geometric[] figures = new Geometric[3];
		figures[0] = new Line();
		figures[1] = new Triangle();
		figures[2] = new Rectangle();

		Collection<Double> arrayList = new ArrayList<Double>();

		ArrayList<Point> listPoint = new ArrayList<Point>();

		for (int i = 0; i < 3; i++) {
			figures[i].draw();
			if (figures[i] instanceof MathGeometric) {
				double square = ((MathGeometric) figures[i]).getSquare(4, 6);
				System.out.println(square);
			}

			double[] mas = (((Coordinates) figures[i]).getCoordinates());
			arrayList.add(mas[0]);
			arrayList.add(mas[1]);
			Point p = new Point((((Coordinates) figures[i]).getCoordinates()));
			listPoint.add(p);

		}

		for (double d : arrayList) {
			System.out.println("mas[double] = " + d);
		}

		System.out.println("****************************");

		for (Point p : listPoint) {
			System.out.print("x = " + p.getX() + "; ");
			System.out.println("y = " + p.getY() + ";");
		}

		System.out.println("------------------------------");
		Line myLine = new Line();
		myLine.setCoordinates(10, 45, 100, 700);
		System.out.println("+++++++++++++++++++++++++++++++++");
		Rectangle myRectangle = new Rectangle();
		myRectangle.setCoordinates(90, 12, 14, 45, 45, 78, 89, 90);

	}
}
