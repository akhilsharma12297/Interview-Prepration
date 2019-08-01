package HashMap_Heap;

import java.util.HashMap;

public class subArray_Sum_0 {

	public static void main(String[] args) {

		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };

		System.out.println(maxLen(arr));
	}

	static int maxLen(int arr[]) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		hmap.put(0, -1);
		int maxLen = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (hmap.containsKey(sum)) {
				int idx = hmap.get(sum);
				if (i - idx > maxLen) {
					maxLen = i - idx;
				}
			} else {
				hmap.put(sum, i);
			}
		}

		return maxLen;
	}
}
