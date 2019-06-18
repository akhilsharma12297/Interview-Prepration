package HashMap_Heap;

import java.util.HashMap;

public class Pair_with_k {

	public static void main(String[] args) {

		int[] arr = { 11, 3, 8, 9, 12, 7, 4, 14, 16, 21, 25, 0, 29, 35, 10, 17, 19, 20, 27 };

		System.out.println(func(arr, 7));
	}

	public static boolean func(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			map.put((arr[i] % k), map.containsKey(arr[i]) ? map.get(arr[i]) + 1 : 1);

		}

		System.out.println(map);

		for (int val : map.keySet()) {

			if (val != 0) {
				if (map.containsKey(k - val)) {

					if (map.get(k - val) != map.get(val)) {
						return false;
					}

				}
			}

		}

		return true;

	}
}
