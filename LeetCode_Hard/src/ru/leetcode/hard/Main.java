package ru.leetcode.hard;

public class Main {
	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 6, 8, 10 };
		int[] nums2 = { 2, 4 };
		double rez = 0.0;
		Solution solution = new Solution();
		rez = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println("mediana = " + rez);
	}
}
