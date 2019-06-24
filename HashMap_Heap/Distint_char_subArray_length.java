package HashMap_Heap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Distint_char_subArray_length {

	public static int sumLength(int[] arr) {

		HashSet<Integer> set = new HashSet<>();

		for (int val : arr) {
			set.add(val);
		}

		HashMap<Integer, Integer> map = new HashMap<>();

		return 0;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(sumLength(arr));
	}
}