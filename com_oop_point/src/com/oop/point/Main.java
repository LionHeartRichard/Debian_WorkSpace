package com.oop.point;

public class Main {
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(12);
		point.setY(4);
		System.out.println("method DROW Linne: " + point.drowLine());
		point = new Point(89, 7);
		System.out.println(point.drowLine());
	}
}
