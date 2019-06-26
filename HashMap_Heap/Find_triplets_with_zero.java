package HashMap_Heap;

import java.util.*;

public class Find_triplets_with_zero {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.print(findTriplets(arr, n));
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array and n length of array.
	// It should return a boolean value.
	public static boolean findTriplets(int arr[], int n) {

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {

			int tar = arr[i];

			int l = i + 1;
			int r = n - 1;

			while (r > l) {
				int sum = arr[l] + arr[r];

				if (tar + sum == 0) {
					return true;
				} else if (tar > sum) {
					l++;
				} else if (tar < sum) {
					r--;
				}

			}

		}

		return false;
	}
}
