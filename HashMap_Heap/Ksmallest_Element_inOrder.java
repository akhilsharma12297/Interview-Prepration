package HashMap_Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ksmallest_Element_inOrder {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		print_k_smallest_elements_in_their_original_order(n, k, arr);
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input length of array, value of k and array of length
	// n
	// It should print k smallest elements in their original order
	public static void print_k_smallest_elements_in_their_original_order(int n, int k, int[] arr) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}

		for (int j = k; j < arr.length; j++) {

			if (pq.peek() > arr[j]) {
				pq.poll();
				pq.add(arr[j]);
			}
		}

		for (int val : arr) {
			if (val <= pq.peek()) {
				System.out.print(val + " ");
			}
		}

	}

}