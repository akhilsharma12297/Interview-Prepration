package HashMap_Heap;

import java.util.*;

public class Siding_Window_Max {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };

		int k = 3;
		func(arr, k);

		System.out.println();

	}

	public static void func(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		int j = 0;
		int i = 0;

		while (j < arr.length) {

			while (j < arr.length && pq.size() <= k) {
				pq.add(arr[j]);
				j++;
			}

			System.out.print(pq.peek() + " ");

			pq.remove(arr[i]);

			i++;
		}
	}

}