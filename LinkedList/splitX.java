package LinkedList;

import java.util.Scanner;

public class splitX {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This takes as input the head of the linked list and x.
	// It should return the head of the modified list.
	public static Node partition(Node n, int x) {
		// write your code here
		Node temp = n;

		Node smallh = null;
		Node smallt = null;
		int ssize = 0;

		Node bigh = null;
		Node bigt = null;
		int bsize = 0;

		int ctr = 0;

		while (temp != null) {
			if (temp.data > x) {

				if (bsize == 0) {
					Node node = new Node(temp.data);
					bigh = node;
					bigt = bigh;
					bigt.next = null;
					bsize++;
				} else {
					Node node = new Node(temp.data);
					bigt.next = node;
					bigt = node;
					bsize++;
				}

			} else if (temp.data < x) {

				if (ssize == 0) {
					Node node = new Node(temp.data);
					smallh = node;
					smallt = smallh;
					smallt.next = null;
					ssize++;
				} else {
					Node node = new Node(temp.data);
					smallt.next = node;
					smallt = node;
					ssize++;
				}

			} else if (x == temp.data) {
				ctr += 1;
			}

			temp = temp.next;
		}

		for (int i = 1; i <= ctr; i++) {
			Node node = new Node(x);
			smallt.next = node;
			smallt = node;

		}

		smallt.next = bigh;
		return smallh;
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

		int x = sc.nextInt();

		head1 = partition(head1, x);
		display(head1);

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
	}

}