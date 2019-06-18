package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class Is_isogram {

	public static boolean isIsogram(String data) {
		// Write your code here

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < data.length(); i++) {

			char ch = data.charAt(i);

			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);

		}

		for (int val : map.values()) {
			if (val != 1) {
				return false;
			}
		}

		return true;

	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(isIsogram(str));

	}
}