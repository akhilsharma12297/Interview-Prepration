package LinkedList;

import java.util.Scanner;

public class VnC {

//	6
//	a e g h i m
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char h = sc.next().charAt(0);
		insert(h);

		for (int i = 1; i < n; i++) {
			char ch = sc.next().charAt(0);
			insert(ch);
		}

		head = arcv(head);
		display();

	}

	// ---------------------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function should return the head of node after sorting.

	public static Node arcv(Node head) {
		Node temp = head;
		Node vhead = new Node();
		Node vtail = new Node();
		int vsize = 0;

		Node chead = new Node();
		Node ctail = new Node();
		int csize = 0;

		while (temp != null) {
			if (temp.data == 'a' || temp.data == 'e' || temp.data == 'i' || temp.data == 'o' || temp.data == 'u') {

				if (vsize == 0) {

					Node node = new Node();
					node.data = temp.data;
					vhead = node;
					vtail = vhead;
					vtail.next = null;
					vsize++;

				} else {
					Node node = new Node();
					node.data = temp.data;
					vtail.next = node;
					vtail = node;
					vsize++;

				}

			} else {
				if (csize == 0) {

					Node node = new Node();
					node.data = temp.data;
					chead = node;
					ctail = chead;
					ctail.next = null;
					csize++;

				} else {
					Node node = new Node();
					node.data = temp.data;
					ctail.next = node;
					ctail = node;
					csize++;

				}
			}
			temp = temp.next;
		}

		if (vsize == 0) {

			head = chead;
			tail = ctail;
			size = csize;
			tail.next = null;

		} else if (csize == 0) {

			head = vhead;
			tail = vtail;
			size = vsize;
			tail.next = null;

		} else {
			head = vhead;
			vtail.next = chead;
			tail = ctail;
			tail.next = null;
			size = csize + vsize;

		}
		return head;

	}

	// ------------------------------------------------------------------
	private static class Node {
		char data;
		Node next;

	}

	static Node head;
	static Node tail;
	static int size;

	public static void insert(char data) {

		Node nn = new Node();
		nn.data = data;
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