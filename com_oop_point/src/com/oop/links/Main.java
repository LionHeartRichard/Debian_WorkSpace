package com.oop.links;

public class Main {

	public static void main(String[] args) {
		Links A = new Links();
		Links B = new Links();
		A.myNumber = 100;
		B = A;

		System.out.println(B.myNumber);
		System.out.println("A-" + A + " B-" + B);

		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array = new int[] {};

		array = mas;

		mas[5] = 9999;

		for (int i : array) {
			System.out.println(i);
		}
	

	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class LinkedList {
	public static Node push(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}

	public static Node deleteNode(Node head, int position) {
		   // List is empty
		   if (head == null){
		      return head;
		   }

		   // If position is 1st, removing head node
		   if (position == 1) {
		       head = head.next;
		       return head;
		   }
		   Node prevNode = head;
		   int i = 2;
		   while (prevNode != null && i != position) {
		       prevNode = prevNode.next;
		       i++;
		   }
		   // When position is more than number of node
		   if (prevNode == null || prevNode.next == null) {
		       return head;
		   }
		   prevNode.next = prevNode.next.next;
		   return head;
		}

	public static void printList(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
}