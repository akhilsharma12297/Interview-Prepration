package LinkedList;

import java.util.Scanner;

public class Countloops {

	public static int countNodesInLoop(Node head) {
		Node slow = head;

		Node fast = head;

		Node start = null;
		Node end = null;
		while (slow != null && fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				start = slow;
				fast = fast;
				break;
			}

		}

		start = start.next;

		int count = 1;
		while (start != end) {
			count++;
			slow = slow.next;
		}

		return count;

	}

	// ------------------------------------------------------------------

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a1 = sc.nextInt();
		insert(a1);

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			insert(a);
		}

		Node temp = null;
		Node te = null;
		int c = sc.nextInt();
		if (c > 0) {
			temp = head;
			te = head;
			while (te.next != null)
				te = te.next;
			while (c-- > 0)
				temp = temp.next;
			te.next = temp;

		}
		System.out.println(countNodesInLoop(head));

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

	public static Node search_Node(Node head, int k) {
		while (head != null) {
			if (head.data == k) {
				return head;
			}
			head = head.next;
		}
		return null;
	}

	public static void display() {
		for (Node node = head; node != null; node = node.next) {
			System.out.print(node.data + " ");
		}
	}

}