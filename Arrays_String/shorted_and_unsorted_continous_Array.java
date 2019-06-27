package Arrays_String;

import java.util.*;

public class shorted_and_unsorted_continous_Array {

	// This is a functional problem. You have to complete this function.
	// It takes as input an integer array. It should return
	// the length of the shortest continuous subarray.
	public static int findUnsortedSubarray(int[] a) {
		// write your code here.
		if (a[0] == a[a.length - 1]) {
			return 0;
		}

		int n = a.length;
		int[] leftmax = new int[n];
		int lm = a[0];
		leftmax[0] = lm;

		int[] rightmin = new int[n];
		int rm = a[a.length - 1];
		rightmin[a.length - 1] = rm;

		for (int i = n - 2; i >= 0; i--) {

			rm = Math.min(rm, a[i]);

			rightmin[i] = rm;
		}

		for (int i = 1; i < n; i++) {
			lm = Math.max(lm, a[i]);

			leftmax[i] = lm;
		}

		int start = 0;
		int end = 0;
		for (int l = 0; l < n; l++) {
			if (leftmax[l] != rightmin[l]) {
				start = l;
				break;
			}
		}
		for (int r = n - 1; r >= 0; r--) {
			if (leftmax[r] != rightmin[r]) {
				end = r;
				break;
			}

		}

		return ((end - start) + 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for length of array.
		int length = sc.nextInt();

		int[] arr = new int[length];

		// Input for elements of array.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findUnsortedSubarray(arr));

	}

	// function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}