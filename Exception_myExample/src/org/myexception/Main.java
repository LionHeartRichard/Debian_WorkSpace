package org.myexception;

import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		MyException myException = new MyException();
		try {
		myException.methodMyTrow();
		} catch (Exception e){
			System.out.println(e.toString());
		}
	}

}
