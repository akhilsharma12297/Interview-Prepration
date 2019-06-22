package HashMap_Heap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_largest_Elements {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		solve(n, num, k);
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input an array,n length of array and k.
	// It should print required output.
	public static void solve(int n, int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {

			if (i < k) {
				pq.add(arr[i]);
			} else if (pq.peek() < arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}

		}
		ArrayList<Integer> list = new ArrayList<>();
		while (pq.size() > 0) {
			list.add(pq.remove());
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			int val = list.get(i);
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
