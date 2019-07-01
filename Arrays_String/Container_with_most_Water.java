package Arrays_String;

import java.util.*;

public class Container_with_most_Water {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = scn.nextInt();
		}
		System.out.print(maxArea(height));
	}

	public static int maxArea(int[] arr) {

		int max = Integer.MIN_VALUE;

		int l = 0;
		int r = arr.length - 1;

		while (r > l) {
			int area = Math.min(arr[l], arr[r]) * (r - l);
			max = Math.max(area, max);
			if (arr[l] > arr[r]) {

				r--;

			} else {
				l++;
			}

		}
		return max;
	}
}
