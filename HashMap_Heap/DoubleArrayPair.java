package HashMap_Heap;

import java.util.*;

public class DoubleArrayPair {

	public static void main(String[] args) {

		int[] arr = { -12, 78, 84, 156, 42, -6, -100, -200, 78, 39 };
		System.out.println(func2(arr));
	}

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

			int val = arr[i];

			if (val > 0) {

				if (map.containsKey(2 * val)) {

					int f1 = map.get(val);

					int f2 = map.get(2 * val);

					if (f1 == 0 || f2 == 0) {
						continue;
					} else if (f1 == f2) {

						map.put(val, 0);
						map.put(2 * val, 0);

					} else if (f1 > f2) {

						f1 = f1 - f2;
						map.put(val, f1);
						map.put(2 * val, 0);

					} else {
						f2 = f2 - f1;
						map.put(2 * val, f2);
						map.put(val, 0);

					}

				}
			} else {
				if (map.containsKey(val / 2)) {

					int f1 = map.get(val);

					int f2 = map.get(val / 2);

					if (f1 == 0 || f2 == 0) {
						continue;
					} else if (f1 == f2) {

						map.put(val, 0);
						map.put(val / 2, 0);

					} else if (f1 > f2) {

						f1 = f1 - f2;
						map.put(val, f1);
						map.put(val / 2, 0);

					} else {
						f2 = f2 - f1;
						map.put(val / 2, f2);
						map.put(val, 0);
					}

				}
			}
		}

		System.out.println(map);

		for (int val : map.values()) {
			if (val > 0) {
				return false;
			}
		}

		return true;

	}

	public static boolean func2(int[] arr) {
		Map<Integer, Integer> count = new TreeMap<>();

		for (int val : arr) {
			count.put(val, count.getOrDefault(val, 0) + 1);
		}

		System.out.println(count);
		for (int val : count.keySet()) {

			if (count.get(val) != 0) {
				{
					int want = val < 0 ? val / 2 : val * 2;

					if (val < 0 && val % 2 != 0 || count.get(val) > count.getOrDefault(want, 0)) {
						return false;
					}
					count.put(want, count.get(want) - count.get(val));
				}
			}
		}

		System.out.println(count);
		return true;
	}
}
