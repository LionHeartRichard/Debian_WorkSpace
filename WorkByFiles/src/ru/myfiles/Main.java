package ru.myfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("/root/eclipse-workspace/WorkByFiles/src/resourse/", "Test.txt");
		FileInputStream inputFile = new FileInputStream(file); // "/root/eclipse-workspace/WorkByFiles/src/resourse/Test.txt");
		System.out.println(file.length());

		int lengthFile = (int) file.length();

		System.out.println(inputFile.available());

		byte[] masByte = new byte[lengthFile];

		

		inputFile.read(masByte);

		///////////////////////////////////////////////////

		inputFile.close();

		/////////////////////////////////////////////////////

		String text = new String(masByte);

		System.out.print(text);
		System.out.println("");
		String[] arrayStr = text.split(",");
		int[] masInt = new int[arrayStr.length];
		for (int i=0; i<arrayStr.length;i++) {
			masInt[i] = Integer.parseInt(arrayStr[i]);
		}
		FileOutputStream outputFile = new FileOutputStream(file, true);
		String stringTest = ",34,13,55,-65,66,999,341,7";
		outputFile.write(stringTest.getBytes());
		
		outputFile.close();
		
		for(int i:masInt) {
			System.out.println(i);
		}
	}

}
