package ru.leetcode.hard;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = 0;
		if (nums1.length > nums2.length) {
			n = nums1.length;
		} else {
			n = nums2.length;
		}
		for (int i = 0; i < n; i++) {
			if (i < nums1.length)
				list.add(nums1[i]);
			if (i < nums2.length)
				list.add(nums2[i]);
		}
		Collections.sort(list);
		if (list.size() % 2 == 0) {
			n = list.get(list.size() / 2) + list.get(list.size() / 2 - 1);
			return n / 2.0;

		} else {
			return list.get(list.size() / 2);
		}

	}
}
