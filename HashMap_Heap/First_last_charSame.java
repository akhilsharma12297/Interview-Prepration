package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class First_last_charSame {

	public static int count(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		int ctr = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (map.containsKey(ch)) {

				ctr += map.get(ch);
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}
		}
		return ctr + str.length();
	}

	// Don't write your code here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int ans = count(str);
		System.out.println(ans);
	}

}
