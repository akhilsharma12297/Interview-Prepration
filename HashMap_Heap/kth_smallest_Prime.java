package HashMap_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_smallest_Prime {

	static class PrimePair implements Comparable<PrimePair> {
		int n;
		int d;
		float val;

		public PrimePair(int n, int d, float val) {
			this.n = n;
			this.d = d;
			this.val = val;
		}

		public int compareTo(PrimePair o) {

			if (this.val > o.val) {
				return 1;
			} else if (this.val < o.val) {
				return -1;
			} else {
				return 0;
			}

		}

	}

	public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
		PriorityQueue<PrimePair> pq = new PriorityQueue<PrimePair>();

		int last = arr.length - 1;

		for (int i = 0; i < arr.length - 1; i++) {

			pq.add(new PrimePair(i, last, (float) arr[i] / arr[last]));
		}
		k -= 1;
		while (k-- > 0) {

			PrimePair temp = pq.poll();

			if (temp.n != temp.d - 1) {
				pq.add(new PrimePair(temp.n, temp.d - 1, (float) arr[temp.n] / arr[temp.d - 1]));
			}

		}

		int[] ans = new int[2];

		PrimePair temp = pq.poll();

		ans[0] = arr[temp.n];
		ans[1] = arr[temp.d];

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] ans = kthSmallestPrimeFraction(arr, k);

		System.out.println(ans[0] + "/" + ans[1]);

	}

}