package Arrays_String;

import java.util.Scanner;

public class Rotate_arraty {

	public static void rotate(int[] a, int k) {

		if (k != 0 || k != a.length) {

			k %= a.length;

			revArr(a, 0, a.length - k - 1);
			revArr(a, a.length - k, a.length - 1);
			revArr(a, 0, a.length - 1);

		}
	}

	private static void revArr(int[] arr, int l, int r) {

		while (r > l) {

			int temp = arr[l];

			arr[l] = arr[r];

			arr[r] = temp;
			l++;
			r--;
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		rotate(ar, k);
		for (int v : ar)
			System.out.print(v + " ");
	}

}