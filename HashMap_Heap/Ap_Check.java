package HashMap_Heap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ap_Check {
	public static boolean checkAP(int[] arr) {
		// Write your code here
		HashSet<Integer> set = new HashSet<>();

		Arrays.sort(arr);

		int d = (arr[arr.length - 1] - arr[0]) / (arr.length - 1);

		for (int val : arr) {
			set.add(val);
		}

		for (int i = 0; i < arr.length - 1; i++) {

			if (!set.contains(arr[0] + (i * d))) {
				return false;
			}

		}

		return true;

	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		boolean x = checkAP(num);
		System.out.println(x);
	}
}