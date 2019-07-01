package Arrays_String;

import java.util.HashSet;
import java.util.LinkedList;

public class nesting_array {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 0, 3, 1, 6, 2 };
		func(arr);
	}

	private static void func(int[] arr) {

		HashSet<Integer> visited = new HashSet<Integer>();

		LinkedList<Integer> queue = new LinkedList<Integer>();

		queue.add(arr[0]);

		visited.add(arr[0]);

		int ctr = 1;
		int max = 0;
		int i = 1;
		while (i < arr.length) {

			if (queue.size() != 0) {
				int temp = queue.remove();
				if (!visited.contains(arr[temp])) {
					queue.add(arr[temp]);
					visited.add(arr[temp]);
					ctr++;
				} else {

					max = Math.max(max, ctr);
				}
			} else {
				queue.add(arr[i]);
				ctr = 0;
				i++;
			}

		}

		System.out.println(max);

	}
}
