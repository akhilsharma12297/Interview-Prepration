package HashMap_Heap;

import java.util.*;

public class Number_of_pair_in_Matrices {

	public static int solve(int[][] num1, int[][] num2, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[0].length; j++) {
				hmap.put(num1[i][j], hmap.getOrDefault(num1[i][j], 0) + 1);
			}
		}

		int ans = 0;
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[0].length; j++) {
				int req = k - num2[i][j];
				if (hmap.containsKey(req)) {
					ans += hmap.get(req);
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for size of matrices.
		int N = sc.nextInt();

		int[][] mat1 = new int[N][N];

		// Input for first matrix
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		int[][] mat2 = new int[N][N];

		// Input for second matrix.
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}

		int K = sc.nextInt();

		System.out.println(solve(mat1, mat2, K));

	}

	// Function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}