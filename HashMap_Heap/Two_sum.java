package HashMap_Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Two_sum {

	static class pair implements Comparable<pair> {
		public int data;
		public int index;

		pair(int data, int index) {
			this.data = data;
			this.index = index;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}

	}

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