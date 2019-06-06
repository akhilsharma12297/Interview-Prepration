package LinkedList;

import java.util.Scanner;

public class ZigZag_LL {

	// ---------------------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	public static void fashion(Node head) {
		if (head == null) {
			return;
		}
		Node prev = head;
		Node curr = prev.next;

		boolean flag = true;

		while (curr != null) {
			if (flag) {
				// check if curr < curr.next
				if (prev.data > curr.data) {
					swap(prev, curr);
				}
				flag = !flag;
			} else {
				// check if curr > curr.next
				if (prev.data < curr.data) {
					swap(prev, curr);
				}
				flag = !flag;
			}

			prev = prev.next;
			curr = curr.next;
		}
	}

	private static void swap(Node a, Node b) {
		int t = a.data;
		a.data = b.data;
		b.data = t;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a1 = sc.nextInt();
		insert(a1);

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			insert(a);
		}

		fashion(head);
		display();

	}

	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	static Node head;
	static Node tail;
	static int size;

	public static void insert(int data) {

		Node nn = new Node(data, null);
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			tail = nn;
		}
		size++;
	}

	public static void display() {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
	}

}