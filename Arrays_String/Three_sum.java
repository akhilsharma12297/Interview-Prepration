package Arrays_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_sum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scn.nextInt();
		}
		System.out.print(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] arr) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(arr);

		int n = arr.length;
		for (int i = 0; i < n; i++) {

			if (i > 0 && arr[i - 1] == arr[i]) {
				continue;
			}

			int c = arr[i];

			int l = i + 1;
			int r = n - 1;

			while (r > l) {
				int val = arr[l] + arr[r];

				if (val + c == 0) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(arr[i]);
					temp.add(arr[l]);
					temp.add(arr[r]);
					ans.add(temp);
					l++;
					r--;
				} else if (val + c > 0) {

					r--;

				} else if (val + c < 0) {
					l++;
				}

			}

		}
		return ans;
	}
}