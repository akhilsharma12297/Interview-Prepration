package HashMap_Heap;

import java.util.Scanner;

public class K_projects_max_profit {

	public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
		// write your code here
		int captial = 0;

		return captial;
	}

	public class pair implements Comparable<pair> {
		public int p;
		public int c;

		pair(int p, int c) {
			this.p = p;
			this.c = c;
		}

		public int compareTo(pair o) {
			return o.c - this.c;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int w = sc.nextInt();

		int n = sc.nextInt();
		int[] profits = new int[n];
		int[] capital = new int[n];

		for (int i = 0; i < n; i++) {
			profits[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			capital[i] = sc.nextInt();
		}

		System.out.println(findMaximizedCapital(k, w, profits, capital));

	}

}