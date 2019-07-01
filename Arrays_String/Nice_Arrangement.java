package Arrays_String;

import java.util.*;

public class Nice_Arrangement {

	public static int[] constructArray(int n, int k) {

		int[] ans = new int[n];

		int number = 1;
		int i = 0;
		int end = n;
		boolean flag = false;

		while (i < n) {
			if (i < (n - 1 - k)) {
				ans[i] = number;
				number++;
			} else {
				if (!flag) {
					ans[i] = number;
					number++;
					flag = true;
				} else {
					ans[i] = end--;
					flag = false;
				}
			}

			i++;
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] result = constructArray(N, K);
		if (verify(result, N, K)) {
			System.out.println("Nice Arrangement");
		} else {
			System.out.println("Try Harder");
		}
	}

	// function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	// function to verify the result. just ignore it.
	private static boolean verify(int[] arr, int N, int K) {

		if (arr.length < N) {
			return false;
		}

		boolean[] a = new boolean[N + 1];
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (a[arr[i]]) {
				return false;
			} else {
				a[arr[i]] = true;
			}

			if (i == N - 1) {
				break;
			} else {
				if (set.contains(Math.abs(arr[i] - arr[i + 1])) == false) {
					set.add(Math.abs(arr[i] - arr[i + 1]));
				}
			}

		}

		if (set.size() != K) {
			return false;
		}

		return true;

	}

}