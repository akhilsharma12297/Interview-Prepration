package HashMap_Heap;

import java.util.Scanner;
import java.util.TreeSet;

public class Smaller_On_left {

	public static int[] greatestSmaller(int[] arr) {

		TreeSet<Integer> set = new TreeSet<>();

		int[] ans = new int[arr.length + 1];

		ans[0] = -1;
		for (int j = 1; j < arr.length; j++) {
			set.add(arr[j - 1]);

			if (set.lower(arr[j]) == null)// TreeSet.lower() method returns the greatest element strictly lower than the
											// // argument given
				ans[j] = -1;
			else {
				ans[j] = set.lower(arr[j]);
			}
		}
		return ans;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int val : greatestSmaller(arr))
			System.out.print(val + " ");
	}
}
