package LinkedList;

import java.util.Scanner;

public class NkthNode {
	// -----------------------------------------------------
	// This is a functional problem. You have to complete this function.
	// This function takes as input the head of the linked list and k.
	// It should return the data of n/k th node.
	public static int nknode(Node head, int k) {
		// write your code here.

		int size = 0;

		Node sizer = head;

		while (sizer != null) {
			size++;
			sizer = sizer.next;
		}

		Node temp = head;
		int element = size / k;

		while (temp != null && element-- > 0) {
			temp = temp.next;
		}

		if (temp != null) {
			return temp.data;
		} else {
			return -1;
		}
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();
		head1 = insert(head1, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			head1 = insert(head1, a);
		}

		int k = sc.nextInt();
		System.out.println(nknode(head1, k));

	}

	// Class declaration for a Node of the Linked List
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static Node head1;

	static Node head2;

	static Node head3;

	/*
	 * Input Parameters: head: head of the linked list in which a new node is to be
	 * inserted. data: the data value of the node which is to be inserted.
	 * 
	 * Return Value: head of the linked list in which the node is inserted
	 */
	public static Node insert(Node head, int data) {

		if (head == null) {
			return new Node(data);
		}

		head.next = insert(head.next, data);
		return head;
	}

	/*
	 * Input Parameters: head: head of the linked list in which is to be displayed.
	 * 
	 * Return Value: null
	 */
	public static void display(Node head) {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
		System.out.println();
	}

}