package LinkedList;

import java.util.Scanner;

public class OnePlus {

	// -----------------------------------------------------
	// This is a functional problem. You have to complete this function.
	// It takes as input the head of the linked list. It should return the
	// head of the modified linked list.

	public static Node plusOne(Node n) {

		n = rev(n);

		Node temp = n;

		int carry = 1;
		Integer sum = 0;

		while (temp != null) {
			sum = temp.data + carry;
			carry = sum >= 10 ? 1 : 0;
			temp.data = sum % 10;

			temp = temp.next;
		}

		n = rev(n);

		if (carry != 0) {
			Node newcarryhead = new Node(carry);// if last carry left
			newcarryhead.next = n;// prev next update
			n = newcarryhead;
		}

		return n;

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

	static Node head1;

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

		head1 = plusOne(head1);
		display(head1);

	}

	// Class declaration for a Node of the Linked List
	static class Node {
		Integer data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	/*
	 * Input Parameters: tail: tail of the linked list in which a new node is to be
	 * inserted. data: the data value of the node which is to be inserted.
	 * 
	 * Return Value: tail of the linked list/the node that is inserted
	 */
	public static Node insert(Node tail, int data) {

		if (tail == null) {
			return new Node(data);
		}

		Node nn = new Node(data);
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
	}

}