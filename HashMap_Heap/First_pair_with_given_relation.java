package HashMap_Heap;

import java.util.*;

public class First_pair_with_given_relation {

	public static int solve(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int tar = arr[i] * arr[j];
				if (set.contains(tar)) {
					return 1;
				} else {
					set.add(tar);
				}

			}
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int res = solve(arr);

		if (res == 1) {
			System.out.println("Found");
		} else if (res == -1) {
			System.out.println("Not Found");
		}

	}

}