package com.oop.enummy;

public class MainEnum {

	public static void main(String[] args) {

	}

}

enum GeometricType {
	POINT, LINE, TRIANGLE, RECTANGLE
}

abstract class Geometric {
	abstract void draw();
	abstract boolean checkElement();
}

class Point extends Geometric implements DrawGeom {

	protected int x, y;
		
	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("POINT DRAW");
	}
	
	@Override
	public void draw(String s) {
	}

	@Override
	public int[] getElement() {
		
		return null;
	}

	@Override
	public boolean checkElement() {
		
		return false;
	}

}

class Line extends Point implements DrawGeom {

	@Override
	public void draw(String s) {
		System.out.println(this.getClass() + " " + s);
	}

}

class Triangle extends Line implements DrawGeom {

}

class Rectangle extends Line implements DrawGeom {

}

interface DrawGeom {
	public void draw(String s);
	public int[] getElement();
}