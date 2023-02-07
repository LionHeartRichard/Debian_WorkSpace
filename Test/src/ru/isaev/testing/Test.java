package ru.isaev.testing;

public class Test {
	public static void main(String[] args) {
		int[] nums1 = { -18,12,3,0 };
		int[] nums2 = { 3, 2, 4 };
		int[] nums3 = { 3, 3 };
		int target1 = -6;
		int target2 = 7;

		Solution solution = new Solution();
		int[] rezult = solution.twoSum(nums1, target1);
		System.out.println("rezult1: [" + rezult[0] + "," + rezult[1] + "]");
		rezult = solution.twoSum(nums2, target2);
		System.out.println("rezult2: [" + rezult[0] + "," + rezult[1] + "]");
		rezult = solution.twoSum(nums3, 6);
		System.out.println("rezult3: [" + rezult[0] + "," + rezult[1] + "]");

		rezult = solution.twoPoints(nums3, 6);
		System.out.println("twoPoints = [" + rezult[0] + "," + rezult[1] + "]");

	}
}
