package Arrays_String;

import java.util.Scanner;

public class Global_local_inversion {
	public static boolean isIdealPermutation(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i] - i) >= 1) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (isIdealPermutation(arr)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}