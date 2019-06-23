package HashMap_Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Two_sum {

	static public class pair implements Comparable<pair> {

		public int data;
		public int idx;

		pair(int data, int idx) {
			this.data = data;
			this.idx = idx;
		}

		@Override
		public int compareTo(pair o) {
			return this.data - o.data;
		}

	}

	public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {

		ArrayList<pair> list = new ArrayList<>();

		for (int i = 0; i < nums.size(); i++) {

			list.add(new pair(nums.get(i), i));

		}

		Collections.sort(list);

		ArrayList<Integer> ans = new ArrayList<>();
		int s = 0;

		int e = nums.size() - 1;

		while (e > s) {

			if (list.get(s).data + list.get(e).data == target) {
				if (list.get(s).idx < list.get(e).idx) {
					ans.add(list.get(s).idx);
					ans.add(list.get(e).idx);
					return ans;
				} else {
					ans.add(list.get(e).idx);
					ans.add(list.get(s).idx);
					return ans;
				}
			} else if (list.get(s).data + list.get(e).data > target) {
				e--;
			} else {
				s++;
			}

		}

		return ans;

	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			nums.add(s.nextInt());
		}
		int target = s.nextInt();
		System.out.println(twoSum(nums, target));

	}

}