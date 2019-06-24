package HashMap_Heap;

import java.util.*;

public class Valid_anagram {

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
		}

		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))) {

				if (map.get(t.charAt(i)) - 1 < 0) {
					return false;
				}

				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);

			} else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		if (isAnagram(s, t)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}