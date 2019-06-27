package Arrays_String;

import java.util.*;

public class Max_Chunk_to_sorted {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		System.out.println(maxChunksToSorted(a));

	}

	public static int maxChunksToSorted(int[] arr) {
		int n = arr.length;
		int[] leftmax = new int[n];
		int lm = arr[0];
		leftmax[0] = lm;

		int[] rightmin = new int[n];
		int rm = arr[arr.length - 1];
		rightmin[arr.length - 1] = rm;

		for (int i = n - 2; i >= 0; i--) {

			rm = Math.min(rm, arr[i]);

			rightmin[i] = rm;
		}

		for (int i = 1; i < n; i++) {
			lm = Math.max(lm, arr[i]);

			leftmax[i] = lm;
		}

		int ctr = 1;
		for (int i = 1; i < arr.length; i++) {
			if (rightmin[i] >= leftmax[i - 1]) {
				ctr++;
			}
		}

		return ctr;
	}
}
