package Arrays_String;

import java.util.*;

public class Sort_custom_String {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String S = scn.next();
		String T = scn.next();
		System.out.print(customSortString(S, T));

	}

	public static String customSortString(String S, String T) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < T.length(); i++) {
			char ch = T.charAt(i);
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		int i = 0;
		String ans = "";

		while (i < S.length()) {
			char ch = S.charAt(i);
			if (map.containsKey(ch)) {
				while (map.get(ch) > 0) {
					ans += ch;
					map.put(ch, map.get(ch) - 1);
				}

			}
			i++;
		}

		for (char ch = 'a'; 'z' >= ch; ch++) {
			if (map.containsKey(ch)) {
				while (map.get(ch) > 0) {

					ans += ch;
					map.put(ch, map.get(ch) - 1);
				}
			}
		}
		return ans;
	}
}