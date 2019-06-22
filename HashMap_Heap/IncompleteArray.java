package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class IncompleteArray {

	public static int incomplete(int[] arr) {

		HashSet<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);

			set.add(arr[i]);

		}

		return ((max - min) - 1) - (set.size() - 2);
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(incomplete(arr));
	}
}