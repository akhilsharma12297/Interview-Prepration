package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class FourSomeV2 {

	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int sum = A[i] + B[j];
				map.put(sum, map.containsKey(sum) ? map.get(sum) + 1 : 1);
			}
		}

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < D.length; j++) {

				int sum = C[i] + D[j];
				sum *= -1;
				if (map.containsKey(sum)) {
					res += map.get(sum);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		int[] arr4 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr3[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr4[i] = sc.nextInt();
		}

		System.out.println(fourSumCount(arr1, arr2, arr3, arr4));

	}

}
