package com.oop.newabstact;

public class Main {
	public static void main(String[] args) {
		Car[] cars = new Car[4];
		cars[0] = new BMW3();
		cars[1] = new Mersedes600();
		cars[2] = new ToytaCamry();
		cars[3] = new Mersedes600();

		for (int i = 0; i < 4; i++) {
			cars[i].go();
			cars[i].stop();
		}

	}
}
