package com.oop.myinterface;

public class GroupInterface {
	public interface ValidataGeometric {
		public void validataGeometric();
	}

	public interface myCheck {
		public static boolean myCheckCircle(Point p1, Point p2) {
			if (Check.check(p1.getX(), p1.getY()) || Check.check(p2.getX(), p2.getY())) {
				System.out.println("Is circle!");
				return true;
			}
			System.out.println("is not circle");
			return false;
		}
		
		public default double setSquere() {
			return 0;
		}
	}

	private interface Check {
		private static boolean check(double x, double y) {
			if (x == y)
				return true;
			return false;
		}
	}
}
