package HashMap_Heap;

import java.util.HashMap;

public class is_two_string_are_k_anagram {

	public static void func(String str1, String str2, int k) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			map.put(str1.charAt(i), map.containsKey(str1.charAt(i)) ? map.get(str1.charAt(i)) + 1 : 1);
		}

		for (int i = 0; i < str2.length(); i++) {
			if (map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
			}
		}

		int sum = 0;

		for (int val : map.values()) {
			sum += val;
		}

		if (sum == k) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
