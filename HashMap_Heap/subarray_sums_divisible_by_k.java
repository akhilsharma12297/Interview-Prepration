package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class subarray_sums_divisible_by_k {

	public static int subarraysDivByK(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int masterSum = 0;
		int ctr = 0;
		map.put(0, 1);
		for (int i = 0; i < arr.length; i++) {

			masterSum += arr[i];

			int val = 0;
			if (masterSum < 0) {
				val = ((masterSum % k) + k) % k;
			} else {
				val = masterSum % k;
			}
			if (map.containsKey(val)) {
				ctr += map.get(val);
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
		}

		return ctr;

	}

	public static int subarraysDivByKOG(int[] A, int K) {

		int sum = 0, count = 0;
		int[] rem = new int[K];
		for (int i = 0; i < A.length; ++i) {
			sum += A[i];
			if (sum % K == 0)
				++count;
			count += rem[(sum % K + K) % K]++;
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];
		for (int z = 0; z < n; z++) {
			arr[z] = scn.nextInt();
		}
		System.out.println(subarraysDivByK(arr, k));
	}
}