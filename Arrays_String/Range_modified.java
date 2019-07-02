package Arrays_String;

import java.util.*;

public class Range_modified {

	public static int[] getModifiedArray(int length, int[][] updates) {

		int[] ans = new int[length];

		int start = 0;
		int end = 0;
		int val = 0;
		for (int i = 0; i < updates.length; i++) {

			start = updates[i][0];
			end = updates[i][1];
			val = updates[i][2];

			ans[start] += val;
			if (end + 1 < length) {
				ans[end + 1] += -val;
			}
		}

		int prefix = ans[0];
		for (int i = 1; i < length; i++) {

			ans[i] += prefix;

			prefix = ans[i];

		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for length of first array.
		int length = sc.nextInt();

		int K = sc.nextInt();

		int[][] updates = new int[K][3];

		for (int i = 0; i < updates.length; i++) {
			for (int j = 0; j < updates[0].length; j++) {
				updates[i][j] = sc.nextInt();
			}
		}

		int[] result = getModifiedArray(length, updates);
		display(result);
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}