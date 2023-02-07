package ru.isaev.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int numberToFind = target - nums[i];
			if (list.contains(numberToFind))
				return new int[] { list.indexOf(numberToFind), i };
			list.add(nums[i]);
		}
		return new int[] {};
	}
	

	public int[] twoPoints(int[] nums, int target) {
		int x = 0, y = 0;
		int left = 0, right = nums.length - 1;
		int[] mas = Arrays.copyOf(nums, nums.length);
		Arrays.sort(nums);
		while (left != right) {
			int sum = nums[left] + nums[right];
			if (sum == target) {
				if (mas == nums)
					return new int[] { left, right };
				x = nums[left];
				y = nums[right];
				break;
			}
			if (sum < target)
				left++;
			if (sum > target)
				right--;
		}
		boolean searchX = false;
		boolean searchY = false;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == x) {
				if (searchX && searchY == true)
					break;
				left = i;
				searchX = true;
				continue;
			}
			if (mas[i] == y) {
				if (searchX && searchY == true)
					break;
				right = i;
			}
		}
		return new int[] { left, right };
	}

}
