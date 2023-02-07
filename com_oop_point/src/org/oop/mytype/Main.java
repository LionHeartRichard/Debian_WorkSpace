package org.oop.mytype;

public class Main {
	public static void main(String[] args) {
		Point<Integer> pt = new Point<>();
		pt.x = 90;
		pt.y = -13;
		
		System.out.println(pt.x + ";" + pt.y);
		
		
	}
}

class Point<T> {
	T x,y;
}

class MyMap<TypeID, TypeValue> {
	TypeID id;
	TypeValue value;
}