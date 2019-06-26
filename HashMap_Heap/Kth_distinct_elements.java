package HashMap_Heap;

import java.util.*;

public class Kth_distinct_elements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();

		distinct(arr, n, k);
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array and n length of array.
	// It should return a boolean value.
	public static void distinct(int arr[], int n, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int val : arr) {
			map.put(val, map.containsKey(val) ? map.get(val) + 1 : 1);
		}

		int ctr = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) == 1) {
				if (++ctr == k) {
					flag = true;
					System.out.print(arr[i]);
				}

			}

		}

		if (!flag) {
			System.out.print(-1);
		}
	}
}