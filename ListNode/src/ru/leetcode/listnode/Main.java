package ru.leetcode.listnode;

public class Main {
	public static void main(String[] args) {

		int number = 1027633061;
		ListNode head = new ListNode(0);
		ListNode node = head;

		while (number > 0) {
			node.next = new ListNode(number % 10);
			node = node.next;
			number = number / 10;
		}

		ListNode headNode = new ListNode(0);
		ListNode nodeNext = headNode;
		number = 1696698036;
		while (number > 0) {
			nodeNext.next = new ListNode(number % 10);
			nodeNext = nodeNext.next;
			number = number / 10;
		}
		
		Solution solution = new Solution();
		ListNode rezult = solution.addTwoNumbers(head.next, headNode.next);
		while (rezult != null) {
			System.out.println(rezult.val);
			rezult = rezult.next;
		}
	}

}
