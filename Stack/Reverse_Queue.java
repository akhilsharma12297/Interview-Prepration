package Stack;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Reverse_Queue {

	public static Queue<Integer> rev(Queue<Integer> q) {
		Stack<Integer> stack = new Stack<>();

		while (!q.isEmpty()) {
			stack.push(q.remove());
		}

		while (!stack.isEmpty()) {
			q.add(stack.pop());
		}

		return q;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.add(sc.nextInt());
		}
		Queue<Integer> res = rev(q);
		while (res.size() != 0) {
			System.out.println(res.remove() + " ");
		}
	}
}