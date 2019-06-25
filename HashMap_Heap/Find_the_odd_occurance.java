package HashMap_Heap;

import java.util.*;

public class Find_the_odd_occurance {

	public static int solve(int[] arr) {

		int ans = 0;
		for (int val : arr) {
			ans ^= val;
		}

		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solve(arr));

	}

}
