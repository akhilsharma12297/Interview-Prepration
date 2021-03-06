package LinkedList;

import java.util.Scanner;

public class Polynomial {

	// Class declaration for a Node of the Linked List
	static class Node {
		int coeff;
		int pow;
		Node next;

		Node(int a, int b) {
			coeff = a;
			pow = b;
			next = null;
		}

	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of two linked lists representing
	// two polynomial numbers.
	// Print the polynomial formed by adding both LL in the function itself.

	public static void addPolynomial(Node poly1, Node poly2) {
		// write your code here
		// Print the polynomial formed by adding both LL in the function itself.
		Node masterhead = null;
		Node mastertail = null;
		int size = 0;

		Node one = poly1;
		Node onenext = poly1.next;
		Node two = poly2;
		Node twonext = poly2.next;

		while (one != null && two != null) {
			if (one.pow == two.pow) {

				if (size == 0) {
					Node node = new Node(one.coeff + two.coeff, one.pow);
					masterhead = node;
					mastertail = masterhead;
					mastertail.next = null;
					size++;
				} else {
					Node node = new Node(one.coeff + two.coeff, one.pow);
					mastertail.next = node;
					mastertail = node;
					size++;
				}

				one = one.next;
				two = two.next;
			} else if (one.pow > two.pow) {

				if (size == 0) {
					Node node = new Node(one.coeff, one.pow);
					masterhead = node;
					mastertail = masterhead;
					mastertail.next = null;
					size++;
				} else {
					Node node = new Node(one.coeff, one.pow);
					mastertail.next = node;
					mastertail = node;
					size++;
				}

				one = one.next;
			} else if (one.pow < two.pow) {

				if (size == 0) {
					Node node = new Node(two.coeff, two.pow);
					masterhead = node;
					mastertail = masterhead;
					mastertail.next = null;
					size++;
				} else {
					Node node = new Node(two.coeff, two.pow);
					mastertail.next = node;
					mastertail = node;
					size++;
				}

				two = two.next;
			}
		}
		while (one != null) {
			
			if (size == 0) {
				Node node = new Node(one.coeff, one.pow);
				masterhead = node;
				mastertail = masterhead;
				mastertail.next = null;
				size++;
			} else {
				Node node = new Node(one.coeff, one.pow);
				mastertail.next = node;
				mastertail = node;
				size++;
			}

			one = one.next;

		}

		while (two != null) {
			
			if (size == 0) {
				Node node = new Node(two.coeff, two.pow);
				masterhead = node;
				mastertail = masterhead;
				mastertail.next = null;
				size++;
			} else {
				Node node = new Node(two.coeff, two.pow);
				mastertail.next = node;
				mastertail = node;
				size++;
			}

			two = two.next;

		}

		Node temp = masterhead;
		while (temp != null) {

			if (temp.next == null) {
				System.out.print(temp.coeff + "x^" + temp.pow);
			} else {
				System.out.print(temp.coeff + "x^" + temp.pow + " + ");
			}
			temp = temp.next;
		}

	}

	//

	// -----------------------------------------------------

	static Node head;

	static Node head2;

	static Node head3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		head = insert(head, a1, b1);

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			head = insert(head, a, b);
		}

		int n2 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		head2 = insert(head2, a2, b2);

		for (int i = 1; i < n2; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			head2 = insert(head2, a, b);
		}

		addPolynomial(head, head2);
	}

	/*
	 * Input Parameters: head: head of the linked list in which a new node is to be
	 * inserted. data: the data value of the node which is to be inserted.
	 * 
	 * Return Value: head of the linked list in which the node is inserted
	 */
	public static Node insert(Node head, int a, int b) {

		if (head == null) {
			return new Node(a, b);
		}

		head.next = insert(head.next, a, b);

		return head;
	}

	/*
	 * Input Parameters: head: head of the linked list in which is to be displayed.
	 * 
	 * Return Value: null
	 */
	public static void display(Node head) {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.coeff + "x^" + node.pow + " ");
		}
	}

}
