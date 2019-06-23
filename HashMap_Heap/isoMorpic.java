package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class isoMorpic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		String B = scn.next();
		System.out.print(isIsomorphic(A, B));
	}
	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input 2 strings.
	// It should return a boolean value.

	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map = new HashMap<>();

		int i = 0;

		while (i < s.length()) {

			if (map.containsKey(s.charAt(i))) {

				if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}

			} else {
				map.put(s.charAt(i), t.charAt(i));
			}

			i++;
		}

		return true;
	}
}