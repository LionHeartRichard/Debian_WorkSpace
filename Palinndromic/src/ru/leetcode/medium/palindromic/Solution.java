package ru.leetcode.medium.palindromic;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public String longestPalindrome(String s) {
		if (s.length() == 1) {
			return s;
		}
		if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1))
				return s;
			else
				return "" + s.charAt(0);
		}
		String strToFind = "";
		
		int counterLengthStrToFind = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		
		int left = 0;
		int right = 0;
		boolean bool = false;
		int j = s.length() - 1;
		
		System.out.println(s.length());

		for (int i = 0; i < s.length(); i++) {
			
			while (i < j) {
				if (s.charAt(i) == s.charAt(j)) {
					if (Collections.max(arrayList) < j - i) {
						left = i;
						right = j + 1;
						counterLengthStrToFind = right - left;
						arrayList.add(counterLengthStrToFind);
					}
					j--;
					break;
				} else {
					j--;
					bool = false;
					continue;
				}
			}
			
			if (bool == false) {
				
				if (Collections.max(arrayList) + i < s.length()) {
					counterLengthStrToFind = 0;
				}
				j = s.length() - 1;
			}
			if (Collections.max(arrayList) + i < s.length()) {
				j = s.length() - 1;
			} else {
				break;
			}
		}
		if (right != 0) {
			System.out.println("left: " + left);
			System.out.print("right: " + right);
			strToFind = s.substring(left, right);
			return strToFind;
		}
		return "" + s.charAt(0);
	}
}
