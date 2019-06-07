package LinkedList;

import java.util.Scanner;

public class SplitLinkedListKParts {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified linked list.
	public static Node[] splitListToParts(Node head, int k) {
		Node[] arr = new Node[k];
		Node forsize = head;
		int count = 0;
		while (forsize != null) {
			forsize = forsize.next;
			count++;
		}
		int n = count;
		int width = n / k;
		int rem = n % k;// parts having extra
		Node cur = head;
		for (int i = 0; i < k; i++) {
			Node lt = new Node(0);
			Node vrl = lt;
			for (int j = 0; j < width + (i < rem ? 1 : 0); j++) {
				vrl.next = new Node(cur.data);
				vrl = vrl.next;
				if (cur != null) {
					cur = cur.next;
				}
				arr[i] = lt.next;
			}

		}
		return arr;
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

		Node[] arr = splitListToParts(head1, k);

		for (int i = 0; i < arr.length; i++) {
			display(arr[i]);
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