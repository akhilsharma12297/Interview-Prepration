package HashMap_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class K_Closest_Point {

	static class Pair implements Comparable<Pair> {
		public int x;
		public int y;
		public int val;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
			this.val = (x * x) + (y * y);
		}

		public int compareTo(Pair o) {
			return (this.x * this.x) + (this.y * this.y);
		}
	}

	public static int[][] kClosest(int[][] points, int K) {

		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

		for (int i = 0; i < K; i++) {
			pq.add(new Pair(points[i][0], points[i][1]));
		}

		for (int i = K; i < points[0].length; i++) {

			Pair temp = new Pair(points[i][0], points[i][1]);

			if (pq.peek().val > temp.val) {
				pq.remove();
				pq.add(temp);
			}
		}

		int[][] mat = new int[1][2];
		mat[0][0] = pq.peek().x;
		mat[0][1] = pq.peek().y;

		return mat;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int[][] points = new int[row][2];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = scn.nextInt();
			}
		}
		int k = scn.nextInt();
		int[][] res = kClosest(points, k);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(res[i][j] + " ");
			System.out.println();
		}
	}
}