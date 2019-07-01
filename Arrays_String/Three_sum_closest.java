package Arrays_String;

import java.util.Arrays;
import java.util.Scanner;

public class Three_sum_closest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		System.out.print(threeSumClosest(nums, k));
	}
	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array and an integer
	// It should return an integer value.

	public static int threeSumClosest(int[] arr, int target) {

		Arrays.sort(arr);

		int min = Integer.MAX_VALUE;

		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {

			if (i > 0 && arr[i - 1] == arr[i]) {
				continue;
			}
			int l = i + 1;
			int r = n - 1;

			while (r > l) {

				int sum = (arr[i] + arr[l] + arr[r]);

				int diff = Math.abs(target - sum);

				if (diff < min) {
					min = diff;
					ans = sum;
				}

				if (target > sum) {
					l++;
				} else if (target < sum) {
					r--;
				} else {
					return target;
				}
			}

		}

		return ans;
	}
}