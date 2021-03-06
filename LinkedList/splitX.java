package LinkedList;

import java.util.Scanner;

public class splitX {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This takes as input the head of the linked list and x.
	// It should return the head of the modified list.
	public static Node partition(Node n, int x) {
		Node lefthead = null;
		Node righthead = null;
		
		Node right = null;
		Node left = null;
		
		Node head = n;
		
		while (head != null) {
		
			if (head.data < x) {
			
				if (lefthead == null) {
					lefthead = left = head;
					
				} else {
					
					left.next = head;
					left = head;

				}
			} else {
				if (righthead == null) {
					righthead = right = head;
				} else {
					right.next = head;
					right = head;
				}

			}
			head = head.next;

		}
		if (right != null) {
			right.next = null;
		}
		if (left != null) {
			left.next = righthead;
			return lefthead;
		} else {
			return righthead;
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