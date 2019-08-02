package Arrays_String;

import java.util.HashMap;

public class Pair_Sum_divisiblity {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 5, 3 };

		int k = 6;

		System.out.println(func(arr, k));
	}

	private static boolean func(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int val = 0;
			if (arr[i] < 0) {
				val = (arr[i] % k) / k;
			}
			val = arr[i] % k;
			map.put(val, map.containsKey(val) ? map.get(val) + 1 : 1);
		}

		for (int val : map.keySet()) {
			if (val != 0) {
				if (val == k / 2) {
					if (map.get(val) % 2 != 0) {
						return false;
					}
				} else {
					if (map.containsKey(k - val)) {
						if (map.get(val) != map.get(k - val)) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}

}
