package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class subArray_range_with_given_sum {

	static int subArraySum(int arr[], int n, int sum) {

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);

		int mastersum = 0;
		int ctr = 0;

		for (int i = 0; i < arr.length; i++) {
			mastersum += arr[i];
			map.put(mastersum, map.containsKey(mastersum) ? map.get(mastersum) + 1 : 1);
		}

		for (int val : map.keySet()) {

			int find = sum - val;

			if (map.containsKey(find)) {
				ctr++;
			} else if (find == 0) {
				ctr++;
			}

		}
		return ctr;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = scn.nextInt();
		int[] arr = new int[n];
		for (int z = 0; z < n; z++) {
			arr[z] = scn.nextInt();
		}
		System.out.println(subArraySum(arr, n, sum));
	}
}