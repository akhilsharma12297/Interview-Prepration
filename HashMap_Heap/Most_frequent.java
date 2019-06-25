package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class Most_frequent {

	public static int solve(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char maxch = s.charAt(s.length() - 1);
		int max = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);

				if (map.get(ch) > max) {
					maxch = ch;
					max = map.get(ch);
				}

			} else {

				map.put(ch, 1);
			}

		}

		return maxch - 48;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(solve(s));
	}

}