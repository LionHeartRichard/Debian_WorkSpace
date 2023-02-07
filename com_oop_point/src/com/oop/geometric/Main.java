package com.oop.geometric;

public class Main {
	public static void main(String[] args) {
		Ellipse ellipse = new Ellipse(15, 10, -4, -1);
		ellipse.draw();
		Rectangle rectangle = new Rectangle();
		
		System.out.println(rectangle.getSize());
	}
}
