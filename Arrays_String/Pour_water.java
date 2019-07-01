package Arrays_String;

import java.util.*;

public class Pour_water {

	public static int[] pourWater(int[] heights, int v, int k) {
		for (int i = 0; i < v; i++) {
			int cur = k;// place where a drop of water is poured
			// Move left
			while (cur > 0 && heights[cur] >= heights[cur - 1]) {
				cur--;
			}
			// Move right
			while (cur < heights.length - 1 && heights[cur] >= heights[cur + 1]) {
				cur++;
			}
			// Move left to K
			while (cur > k && heights[cur] >= heights[cur - 1]) {
				cur--;
			}
			heights[cur]++;
		}

		return heights;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for length of first array.
		int N = sc.nextInt();

		int[] arr1 = new int[N];

		// Input for array1 elements.
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		int V = sc.nextInt();
		int K = sc.nextInt();

		int[] result = pourWater(arr1, V, K);
		display(result);

	}

	// function to display an array.
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
