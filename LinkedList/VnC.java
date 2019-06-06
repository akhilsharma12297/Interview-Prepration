package LinkedList;

import java.util.Scanner;

public class VnC {

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

		Node vhead = new Node('$', null);
		Node vtail = new Node('$', null);
		int vsize = 0;

		Node chead = new Node('$', null);
		Node ctail = new Node('$', null);
		int csize = 0;

		while (temp != null) {
			if (temp.data == 'a' || temp.data == 'e' || temp.data == 'i' || temp.data == 'o' || temp.data == 'u') {

				vhead = addlast(vhead, vtail, temp.data, vsize);

			} else {

				chead = addlast(chead, ctail, temp.data, csize);

			}

			temp = temp.next;
		}

		head = vhead;

		vtail.next = chead;

		tail = ctail;
		return head;
	}
	// ------------------------------------------------------------------

	private static Node addlast(Node xhead, Node xtail, char data, int size) {
		if (size == 0) {
			Node node = new Node();
			node.data = data;
			xhead = xtail = node;
			size++;

			return xhead;
		} else {
			Node node = new Node();
			node.data = data;F

			xtail = node;
			size++;

			return xhead;

		}

	}

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