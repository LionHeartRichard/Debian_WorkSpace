package ru.leetcode.listnode;

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int x = l1.val;
		int y = l2.val;
		int sum = x + y;
		l1 = l1.next;
		l2 = l2.next;
		if (sum == 0 && l1 == null && l2 == null)
			return new ListNode(0);
		ListNode head = new ListNode(0);
		ListNode node = head;
		while (sum != 0 || l1 != null || l2 != null) {
			int decimalPart = sum / 10;
			node.next = new ListNode(sum % 10);
			node = node.next;
			if (l1 != null) {
				x = l1.val;
				l1 = l1.next;
			} else {
				x = 0;
			}
			if (l2 != null) {
				y = l2.val;
				l2 = l2.next;
			} else {
				y = 0;
			}
			sum = x + y + decimalPart;
		}
		return head.next;

	}
}
