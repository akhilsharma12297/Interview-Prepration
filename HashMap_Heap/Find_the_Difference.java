package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class Find_the_Difference {

	// This is a functional problem. You have to complete this function.
	// It takes as input the String s ant t. It should return the different
	// character.
	public static char findTheDifference(String s, String t) {
		// write your code here.

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			set.add(ch);
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (set.contains(ch)) {
				set.remove(ch);
			} else {
				set.add(ch);
			}
		}

		// Char[] arr = set.toArray();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(findTheDifference(s, t));

	}

}