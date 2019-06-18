package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class arr2_check {

	public static boolean isTwoArrayEqual(long[] num1, long[] num2) {
		// write your code here

		HashSet<Long> set = new HashSet<>();

		for (long val : num1) {
			set.add(val);
		}

		for (long val : num2) {
			if (!set.contains(val)) {
				return false;
			}
		}

		return true;

	}

	// Don't make changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] num = new long[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextLong();
		}
		int m = n;
		long[] arr = new long[m];
		for (int i = 0; i < m; i++) {
			arr[i] = scn.nextLong();
		}
		boolean x = isTwoArrayEqual(num, arr);
		System.out.println(x);
	}

}