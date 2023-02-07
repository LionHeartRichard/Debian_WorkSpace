package ru.leetCode.SubString;

public class Main {
	public static void main(String[] args) {
		String str = "busvutpwmu";
		Solution instance = new Solution();
		int i = instance.lengthOfLongestSubstring(str);
		System.out.println("subString length = " + i);
		i = instance.lengthMaxSubStr(str);
		System.out.println("recursive length = " + i);
	}
}
