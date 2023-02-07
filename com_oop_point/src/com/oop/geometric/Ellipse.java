package com.oop.geometric;

public class Ellipse extends Line {
	Ellipse() {
		System.out.println("Constructor Ellipse");
	}

	Ellipse(int x1, int y1, int x2, int y2) {
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
	}

	public void draw() {
		System.out.println("*****************************");
		int[] masSuperPoint = super.getPoint();
		for (int i : masSuperPoint) {
			System.out.println("superPoint = " + i);
		}

		int[] masSuperLine = super.getLine();
		for (int i : masSuperLine) {
			System.out.println("superLine = " + i);
		}

		int[] masThisPoint = this.getPoint();
		for (int i : masThisPoint) {
			System.out.println("masThisPoint = " + i);
		}

		int[] masThisLine = this.getLine();
		for (int i : masThisLine) {
			System.out.println("masThisLine = " + i);
		}

	}
}
