package LinkedList;

import java.util.Scanner;

public class MergeKlist {

	// -----------------------------------------------------
	// This is a functional problem. You have to complete this function.
	// It takes as input the array of heads of k sorted linked lists, and k.
	// It should return the head of merged list.

	public static Node mergeKList(Node[] arr, int k) {

		int i = 1;
		Node head = arr[0];

		while (i < arr.length) {
			head = merge(head, arr[i]);
			i++;
		}

		return head;
	}

	public static Node merge(Node a, Node b) {
		if (a == null) {
			return b;
		}

		if (b == null) {
			return a;
		}

		Node small;
		if (a.data < b.data) {
			small = a;
			small.next = merge(a.next, b);
		} else {
			small = b;
			small.next = merge(a, b.next);
		}
		return small;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		Node[] arr = new Node[k];

		Node start = null;
		Node curr = null;

		for (int i = 0; i < k; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			start = new Node(a);
			arr[i] = start;

			curr = start;
			for (int j = 1; j < n; j++) {
				Node ptr = new Node(sc.nextInt());
				curr.next = ptr;
				curr = ptr;
			}
			curr.next = null;
			start = null;
		}

		Node res = mergeKList(arr, k);
		display(res);

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
