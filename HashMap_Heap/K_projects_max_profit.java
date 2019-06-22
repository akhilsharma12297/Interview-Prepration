package HashMap_Heap;

import java.util.Scanner;

public class K_projects_max_profit {

	public static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
		// write your code here
		int captial = 0;
		return captial;
	}

	public abstract class Pair implements Comparable<Pair> {
		int p;
		int c;

		Pair(int p, int c) {
			this.p = p;
			this.c = c;
		}

	}

	public class maxProfit implements Comparable<Pair> {

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return 0;
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