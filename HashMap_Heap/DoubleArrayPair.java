package HashMap_Heap;

import java.util.Arrays;
import java.util.HashMap;

public class DoubleArrayPair {

	public static boolean func(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			map.put(arr[i], map.containsKey(arr[i]) ? map.get(arr[i]) + 1 : 1);
		}

		System.out.println(map);

		if (map.containsKey(0)) {
			if (map.get(0) % 2 != 0) {
				return false;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			int val = map.get(arr[i]);

			if (map.containsKey(2 * val)) {
				int val2 = map.get(2 * val);
			}

		}

		return true;

	}

}
