package Arrays_String;

import java.util.HashMap;

public class Morning_Assembly {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 2 };
		func(arr);
	}

	private static void func(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1)) {

				if (i > map.get(arr[i] - 1)) {

					max++;

				}
			}
		}

		System.out.println(arr.length - max);

	}
}
