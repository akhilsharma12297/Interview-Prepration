package LinkedList;

import java.util.Scanner;

public class MergeRevSorted {

	public static Node mergeResult(Node head1, Node head2) {
		// write your code here
		Node temp1 = rev(head1);

		Node temp2 = rev(head2);

		Node head = null;

		Node tail = null;

		while (temp1 != null || temp2 != null) {
			if (temp1 != null && temp2 != null) {
				if (temp1.data > temp2.data) {

					if (head == null) {
						Node node = temp1;

						head = node;

						tail = node;
					} else {
						Node node = temp1;

						tail.next = node;

						tail = node;

					}

					temp1 = temp1.next;
				} else {
					if (head == null) {
						Node node = temp2;

						head = node;

						tail = node;
					} else {
						Node node = temp2;

						tail.next = node;

						tail = node;

					}

					temp2 = temp2.next;
				} /**/
			}

			if (temp2 == null) {

				while (temp1 != null) {
					if (head == null) {
						Node node = temp1;

						head = node;

						tail = node;
					} else {
						Node node = temp1;

						tail.next = node;

						tail = node;

					}

					temp1 = temp1.next;
				}
			}

			if (temp1 == null) {

				while (temp2 != null) {
					if (head == null) {
						Node node = temp2;

						head = node;

						tail = node;
					} else {
						Node node = temp2;

						tail.next = node;

						tail = node;

					}

					temp2 = temp2.next;
				}
			}

		}

		return head;

	}

	public static Node rev(Node node) {
		Node prev = null;
		Node curr = node;

		while (curr != null) {
			Node mynext = curr.next;

			curr.next = prev;

			prev = curr;

			curr = mynext;
		}

		return prev;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();
		head = insert(head, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			head = insert(head, a);
		}

		int n2 = sc.nextInt();
		int a2 = sc.nextInt();
		head2 = insert(head2, a2);
		for (int i = 1; i < n2; i++) {
			int a = sc.nextInt();
			head2 = insert(head2, a);
		}

		head3 = mergeResult(head, head2);
		display(head3);

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

	static Node head;

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
	}

}