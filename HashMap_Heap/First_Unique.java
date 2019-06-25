package HashMap_Heap;

import java.util.*;

public class First_Unique {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.print(firstUniqChar(s));
	}

	static class pair {
		int idx;
		boolean flag;

		pair(int idx, boolean flag) {
			this.idx = idx;
			this.flag = flag;
		}
	}

	public static int firstUniqChar(String s) {

		HashMap<Character, pair> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (map.containsKey(ch)) {
				pair temp = new pair(map.get(ch).idx, false);
				map.put(ch, temp);
			} else {
				pair temp = new pair(i, true);
				map.put(ch, temp);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (map.get(ch).flag) {
				return map.get(ch).idx;
			}

		}
		return -1;
	}
}
