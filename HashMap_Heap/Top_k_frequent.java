package HashMap_Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Top_k_frequent {
	static public class pair implements Comparable<pair> {

		public int data;
		public int freq;

		pair(int data, int freq) {
			this.data = data;
			this.freq = freq;
		}

		@Override
		public int compareTo(pair o) {
			return o.freq - this.freq;
		}

	}

	public static ArrayList<Integer> topKFrequent(int n, int[] nums, int k) {

		ArrayList<Integer> ans = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		PriorityQueue<pair> pq = new PriorityQueue<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (int val : map.keySet()) {
			pq.add(new pair(val, map.get(val)));
		}

		for (int i = 0; i < k; i++) {
			ans.add(pq.remove().data);
		}

		return ans;

	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> res = topKFrequent(n, ar, k);
		Collections.sort(res);
		System.out.println(res);
	}

}