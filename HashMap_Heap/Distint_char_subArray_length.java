package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class Distint_char_subArray_length {

	public static int sumLength(int[] arr) {

		HashSet<Integer> visited = new HashSet<Integer>();

		int n = arr.length;

		int ans = 0;
		int end = 0;
		for (int i = 0; i < n; i++) {

			while (end < n && !visited.contains(arr[end])) {
				visited.add(arr[end]);
				end++;
			}

			ans += ((end - i) * (end - i + 1) / 2);

			visited.remove(arr[i]);
		}

		return ans;

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