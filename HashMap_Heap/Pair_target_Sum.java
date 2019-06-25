package HashMap_Heap;

import java.util.*;

public class Pair_target_Sum {

	public static void print(int[] arr1, int[] arr2, int k) {
		ArrayList<String> list = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int l = 0;
		int r = arr2.length - 1;
		while (l < arr1.length && r >= 0) {
			int currSum = arr1[l] + arr2[r];
			if (currSum < k) {
				l++;
			} else if (currSum > k) {
				r--;
			} else {
				list.add(arr1[l] + " " + arr2[r]);
				l++;
				r--;
			}
		}

		if (list.size() == 0) {
			System.out.print("-1");
		}
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + ", ");
			}
		}

	}

	// Don't make changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = scn.nextInt();
		int[] num = new int[n];
		int[] num2 = new int[m];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}

		for (int i = 0; i < m; i++) {
			num2[i] = scn.nextInt();
		}
		print(num, num2, k);
		System.out.println();

	}
}
