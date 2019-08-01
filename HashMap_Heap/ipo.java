package HashMap_Heap;

import java.util.*;

public class ipo {

	public static void main(String[] args) {

	}

	public static class Node {
		int c;
		int p;

		Node(int p, int c) {
			this.p = p;
			this.c = c;
		}
	}

	public static class profitComparator implements Comparator<Node> {
		public int compare(Node a, Node b) {
			return a.p - b.p;
		}
	}

	public static class costComparator implements Comparator<Node> {
		public int compare(Node a, Node b) {
			return a.c - b.c;
		}
	}

	private static void func(int[] cost, int[] profit, int w, int k) {

		Arrays.sort(cost);
		Arrays.sort(profit);

		PriorityQueue<Node> pq = new PriorityQueue<>(new costComparator());
		for (int i = 0; i < cost.length; i++) {
			pq.add(new Node(profit[i], cost[i]));
		}

		PriorityQueue<Node> pq2 = new PriorityQueue<>(Collections.reverseOrder(new profitComparator()));

	}

}
