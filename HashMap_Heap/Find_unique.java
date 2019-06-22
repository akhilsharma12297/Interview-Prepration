package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class Find_unique {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scn.nextInt();
			}
			solve(num, k);
		}
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array and n length of array.
	// It should return a boolean value.
	public static void solve(int[] arr, int k) {

		HashMap<Boolean, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(false, arr[i]);
			} else {
				map.put(true, arr[i]);
			}
		}

		for (Boolean flag : map.keySet()) {
			if (!flag) {
				System.out.print(map.get(flag));
			}
		}

	}
}