package LinkedList;

import java.util.Scanner;

public class AddTwoLinkedList {

	// -----------------------------------------------------
	// This is a functional problem. You have to complete this function.
	// This function takes as input the head of two the linked lists.
	// It should return the head of the resultant list.
	public static Node addTwoNumbers(Node n1, Node n2) {
		// write your code here.
		n1 = reverse(n1);
		n2 = reverse(n2);
		// write your code here.
		Node head = null;
		Node prev = null;

		int sum = 0;
		int carry = 0;

		while (n1 != null || n2 != null) {
			int ld, rd = 0;

			if (n1 != null) {
				ld = n1.data;
			} else {
				ld = 0;
			}

			if (n2 != null) {
				rd = n2.data;
			} else {
				rd = 0;
			}

			sum = ld + rd + carry;

			carry = sum / 10;

			sum = sum % 10;

			if (head == null) {
				head = new Node(sum, null);
				prev = head;
			} else {
				Node n = new Node(sum, null);
				prev.next = n;
				prev = prev.next;

			}
			if (n1 != null) {
				n1 = n1.next;
			}
			if (n2 != null) {
				n2 = n2.next;
			}
		}
		if (carry != 0) {
			Node n3 = new Node(carry, null);
			prev.next = n3;
		}

		head = reverse(head);
		return head;
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node cur = head;

		while (cur != null) {
			Node ocn = cur.next;
			cur.next = prev;
			prev = cur;
			cur = ocn;
		}
		return prev;
	}

	// -----------------------------------------------------

	static Node head1;

	static Node head2;

	static Node head3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();

		Node tail;
		head1 = tail = insert(null, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			tail = insert(tail, a);
		}

		int n2 = sc.nextInt();
		int a2 = sc.nextInt();

		head2 = tail = insert(null, a2);

		for (int i = 1; i < n2; i++) {
			int a = sc.nextInt();
			tail = insert(tail, a);
		}

		head3 = addTwoNumbers(head1, head2);
		display(head3);

	}

	// Class declaration for a Node of the Linked List
	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	/*
	 * Input Parameters: tail: head of the linked list in which a new node is to be
	 * inserted. data: the data value of the node which is to be inserted.
	 * 
	 * Return Value: tail of the linked list/the node that is inserted
	 */
	public static Node insert(Node tail, int data) {

		if (tail == null) {
			return new Node(data, null);
		}

		Node nn = new Node(data, null);
		tail.next = nn;
		return nn;
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
