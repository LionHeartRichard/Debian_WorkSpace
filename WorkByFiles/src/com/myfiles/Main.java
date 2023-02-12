package com.myfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		File file = new File("/root/eclipse-workspace/WorkByFiles/src/resourse/", "Test.txt");
		FileInputStream fileInput = new FileInputStream(file);

		byte[] masByte = new byte[(int) file.length()];
		fileInput.read(masByte);

		String textFile = new String(masByte);

		String[] str = textFile.split(",");

		int[] masInt = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			masInt[i] = Integer.parseInt(str[i]);
		}

		SumToNumberThisArray sum = new SumToNumberThisArray();

		int[] result = sum.enumerationForFor(masInt, 14);
		System.out.println(result[0] +";"+ result[1]);
		
		result = sum.saveElementsHashSet(masInt, 14);
		System.out.println(result[0] +";"+ result[1]);
		
		result = sum.binarySearch(masInt, 14);
		System.out.println(result[0] +";"+ result[1]);
		
		result = sum.twoPoints(masInt, 14);
		System.out.println(result[0] +";"+ result[1]);
	}
}
