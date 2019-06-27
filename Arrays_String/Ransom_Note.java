package Arrays_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ransom_Note {

	public static boolean canConstruct(String rans, String magazine) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.containsKey(magazine.charAt(i)) ? map.get(magazine.charAt(i)) + 1 : 1);
		}

		for (int i = 0; i < rans.length(); i++) {

			char ch = rans.charAt(i);

			if (map.containsKey(ch)) {
				if (map.get(ch) == 0) {
					return false;
				} else {
					map.put(ch, map.get(ch) - 1);
				}
			}
		}
		return true;
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		System.out.print(canConstruct(s, t));

	}

}