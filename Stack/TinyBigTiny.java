package Stack;

import java.util.*;

public class TinyBigTiny {
	public static boolean find132pattern(int[] arr) {

		int i = 0;
		int j = 1;
		int k = 2;

		while (k <= arr.length) {

			if ((arr[i] < arr[j]) && (arr[j] > arr[k])) {
				return true;
			}
			i++;
			j++;
			k++;

		}

		return false;

	}

	// Dont make changes here
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
			A[i] = sc.nextInt();
		System.out.println(find132pattern(A));
	}

}