package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class Subarrays_with_equal_0_1 {

	public static int countSubArrays(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[i] = -1;
			}
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		int masterSum = 0;

		int ctr = 0;

		map.put(0, 1);
		for (int i = 0; i < a.length; i++) {
			masterSum += a[i];

			if (map.containsKey(masterSum)) {
				if (map.get(masterSum) >= 1) {
					ctr += map.get(masterSum);
				}
				map.put(masterSum, map.get(masterSum) + 1);
			} else {
				map.put(masterSum, 1);
			}
		}
		return ctr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(countSubArrays(a, n));

	}

}