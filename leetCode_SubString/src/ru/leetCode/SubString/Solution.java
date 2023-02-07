package ru.leetCode.SubString;

import java.util.HashSet;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<Character>();
		int maxLengthLeft = 0;
		int maxLengthRigth = 0;
		int i = 0;
		int j = 0;

		while (i < s.length()) {
			boolean check = false;
			if (set.add(s.charAt(i)) == true) {
				if (maxLengthLeft < set.size())
					maxLengthLeft = set.size();
			} else {
				set.clear();
				if (j == s.length() - 1)
					break;
				i = j++;
				check = true;
			}
			if (check != true)
				i++;
		}

		set.clear();

		/*
		 * for (int i = s.length() - 1; i > -1; i--) { if (set.add(s.charAt(i)) == true)
		 * { if (maxLengthRigth < set.size()) maxLengthRigth = set.size(); } else {
		 * set.clear(); if (i == 0) break; if (s.charAt(i) != s.charAt(i-1))
		 * set.add(s.charAt(i+1)); } }
		 */

		if (maxLengthLeft > maxLengthRigth) {
			return maxLengthLeft;
		} else
			return maxLengthRigth;
	}

	private int maxLnStr = 0;
	private String cashStr = "";

	public int lengthMaxSubStr(String str) {
		if (str.length() == 0)
			return 0;
		if (str.length() == 1)
			return 1;
		recursivSubString(str);
		return maxLnStr;
	}

	private String recursivSubString(String str) {
		if (str.length() == 0)
			return str;
		if (cashStr != str) {
			HashSet<Character> set = new HashSet<Character>(str.length());
			for (int i = 0; i < str.length(); i++) {
				if (set.add(str.charAt(i)) == true) {
					if (maxLnStr < set.size())
						maxLnStr = set.size();
				} else {
					break;
				}
			}
			cashStr = recursivSubString(str.substring(1, str.length()));
		}
		return cashStr;

	}
}
