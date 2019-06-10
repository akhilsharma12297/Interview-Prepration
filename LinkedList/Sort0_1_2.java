package LinkedList;

public class Sort0_1_2 {

	public static void func(Node head) {
		int[] count = { 0, 1, 2 };

		Node temp = head;

		while (temp != null) {
			count[temp.data]++;

			temp = temp.next;
		}

		int i = 0;
		temp = head;

		while (temp != null) {

			if (count[i] == 0) {
				i++;
			} else {
				temp.data = i;
				--count[i];
				temp = temp.next;

			}

		}

	}

	class Node {
		Node next;
		int data;
	}

	Node head;

}
