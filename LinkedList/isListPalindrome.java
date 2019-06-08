package LinkedList;

import java.util.Scanner;

public class isListPalindrome {

	static Node left;

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return true if list is palindrome, else return false.

	public static boolean isPalindrome(Node head) {
		Node slow = head;

		Node fast = slow.next;

		while (fast != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node head1 = head;

		Node head2 = slow.next;

		slow.next = null;

		head2 = reverseList(head2);

		while (head1 != null && head2 != null) {
			if (head1.data != head2.data) {
				return false;
			}
			head1 = head1.next;
			head2 = head2.next;
		}

		return true;
	}

	// -----------------------------------------------------

	private static Node reverseList(Node node) {

		Node prev = null;
		Node curr = node;
		Node next = null;

		while (curr != null) {

			next = curr.next;

			curr.next = prev;
			prev = curr;
			curr = next;

		}

		node = prev;
		return node;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 = sc.nextInt();
		head = insert(head, a1);

		for (int i = 1; i < n1; i++) {
			int a = sc.nextInt();
			head = insert(head, a);
		}

		if (isPalindrome(head)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

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