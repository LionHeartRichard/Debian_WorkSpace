package com.myfiles;

import java.util.Arrays;
import java.util.HashSet;

public class SumToNumberThisArray {
	public int[] enumerationForFor(int[] mas, int target) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] + mas[j] == target) {
					return new int[] { mas[i], mas[j] };
				}
			}
		}
		return new int[] { 0, 0 };
	}

//////////////////////////////////////////////////////////////////////////
	public int[] binarySearch(int[] mas, int target) {
		Arrays.sort(mas);
		for (int i = 0; i < mas.length; i++) {
			int numberToFind = target - mas[i];
			int left = i + 1, right = mas.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (mas[mid] == numberToFind) {
					return new int[] { mas[i], numberToFind };
				}
				if (numberToFind < mas[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
		}

		return new int[] { 0, 0 };
	}

//////////////////////////////////////////////////////////////////////////
	public int[] saveElementsHashSet(int[] mas, int target) {
		HashSet<Integer> set = new HashSet<>();
		int numberToFind;
		for (int i = 0; i < mas.length; i++) {
			numberToFind = target - mas[i];
			if (set.contains(numberToFind)) {
				return new int[] { numberToFind, mas[i] };
			}
			set.add(mas[i]);
		}
		return new int[] { 0, 0 };
	}

////////////////////////////////////////////////////////////////////////////
	public int[] twoPoints(int[] mas, int target) {
		Arrays.sort(mas);
		int left = 0, right = mas.length - 1;
		while (left < right) {
			int sum = mas[left] + mas[right];
			if (target == sum) {
				return new int[] { mas[left], mas[right] };
			}
			if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] { 0, 0 };
	}
}
