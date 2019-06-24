package HashMap_Heap;

import java.util.*;

public class uncommon_char {

	public static void uncommon(String str1, String str2) {

		HashMap<Character, Boolean> map = new HashMap<>();
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			map.put(ch, true);
			set.add(ch);
		}

		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, false);
				set.remove(ch);
			} else if (map.containsKey(ch) == false) {
				map.put(ch, true);
				set.add(ch);
			}
		}

		Object[] ans = set.toArray();

		Arrays.sort(ans);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();

		String str2 = sc.next();

		uncommon(str1, str2);

	}
}