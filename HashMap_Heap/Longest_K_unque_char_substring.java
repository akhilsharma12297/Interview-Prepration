package HashMap_Heap;

import java.util.HashMap;

public class Longest_K_unque_char_substring {

	public static void func(String str, int k) {
		if (str.length() < k) {
			System.out.println("-1");
		}

		HashMap<Character, Integer> map = new HashMap<>();

		int i = -1;
		int j = 0;

		int mylen = 0;

		int maxLen = 0;

		boolean ansFound = false;

		while (j < str.length()) {

			while (j < str.length() && map.size() < k) {
				map.put(str.charAt(j), map.containsKey(str.charAt(j)) ? map.get(str.charAt(j)) + 1 : 1);
				j++;
			}

			while (map.size() != k - 1) {
				i++;
				char toRemove = str.charAt(i);
				if (map.get(toRemove) == 1) {
					map.remove(toRemove);
				} else {
					map.put(toRemove, map.get(toRemove) - 1);
				}
				mylen--;
			}

		}

		if (mylen > maxLen) {
			maxLen = mylen;
		}

		System.out.println(maxLen);

	}

	public static void main(String[] args) {

		func("aabacbebebe", 3);

	}
}
