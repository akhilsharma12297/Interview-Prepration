package HashMap_Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_pair_with_smallest_sum {

	static class pair implements Comparable<pair> {
		int i;
		int j;
		int sum;

		public pair(int i, int j, int sum) {
			this.i = i;
			this.j = j;
			this.sum = sum;
		}

		@Override
		public int compareTo(pair o) {
			return this.sum - o.sum;
		}
	}

	public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

		if (nums1.length == 0 || nums2.length == 0) {
			List<List<Integer>> l1 = new ArrayList<>();
			return l1;
		}

		PriorityQueue<pair> pq = new PriorityQueue<>();

		pair p = new pair(0, 0, nums1[0] + nums2[0]);
		pq.add(p);

		List<List<Integer>> list = new ArrayList<>();
		int count = 0;

		HashSet<String> set = new HashSet<>();
		while (count < k && pq.size() > 0) {
			pair rv = pq.remove();
			if (set.contains(rv.i + " " + rv.j) == true) {
				continue;
			} else {
				set.add(rv.i + " " + rv.j);
			}

			List<Integer> ll = new ArrayList<>();
			ll.add(nums1[rv.i]);
			ll.add(nums2[rv.j]);
			list.add(ll);

			if (rv.i < nums1.length - 1) {
				pq.add(new pair(rv.i + 1, rv.j, nums1[rv.i + 1] + nums2[rv.j]));
			}

			if (rv.j < nums2.length - 1) {
				pq.add(new pair(rv.i, rv.j + 1, nums1[rv.i] + nums2[rv.j + 1]));
			}

			count++;
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for length of first array.
		int N = sc.nextInt();

		int[] arr1 = new int[N];

		// Input for array1 elements.
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		// Input for length of second array.
		int M = sc.nextInt();

		int[] arr2 = new int[M];

		// Input for array2 elements.
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		int K = sc.nextInt();

		List<List<Integer>> result = kSmallestPairs(arr1, arr2, K);
		result.sort(new ListComparator());

		display(result);

	}

	// Comparator for sorting the result list.
	static class ListComparator implements Comparator<List<Integer>> {

		@Override
		public int compare(List<Integer> l1, List<Integer> l2) {

			int sum1 = l1.get(0) + l1.get(1);
			int sum2 = l2.get(0) + l2.get(1);

			if (sum1 != sum2) {
				return sum1 - sum2;
			} else {
				return l1.get(0) - l2.get(0);
			}

		}
	}

	// Function to display a List of Lists of integers.
	public static void display(List<List<Integer>> list) {

		for (int i = 0; i < list.size(); i++) {

			List<Integer> currList = list.get(i);

			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}

			System.out.println();
		}

	}

}