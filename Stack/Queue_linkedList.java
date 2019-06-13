package Stack;

import java.util.Scanner;

public class Queue_linkedList {

	static class MyQueue {
		QueueNode front, rear;

		// This function should add an item at

		// rear
		void push(int a) {
			if (front == null) {
				QueueNode node = new QueueNode(a);
				rear = node;
				front = node;
			} else if (front == rear) {
				QueueNode node = new QueueNode(a);
				rear = node;
				front.next = rear;
			} else {
				QueueNode node = new QueueNode(a);

				node.next = rear;

				rear = node;

			}
		}

		// This function should remove front
		// item from queue and should return
		// the removed item.
		int pop() {

			if (front == null) {
				return -1;
			} else if (front == rear) {
				front = null;
				rear = null;
				return front.data;
			} else {

				QueueNode temp = front;

				front = front.next;

				return front.data;
			}
		}

	}

	// Dont make changes here
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;// number of operationsto be performed
		while (i != n) {
			int q = sc.nextInt();
			if (q == 1) {
				queue.push(sc.nextInt());
			} else if (q == 2)
				System.out.println(queue.pop());
			i++;
		}
	}

	static class QueueNode {
		int data;
		QueueNode next;

		QueueNode(int a) {
			data = a;
			next = null;
		}
	}
}