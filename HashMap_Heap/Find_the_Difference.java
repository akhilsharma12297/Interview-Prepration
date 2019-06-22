package HashMap_Heap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Find_the_Difference {

	// This is a functional problem. You have to complete this function.
	// It takes as input the String s ant t. It should return the different
	// character.
	public static char findTheDifference(String s, String t) {
		// write your code here.

		char c = 0;

		for (int i = 0; i < s.length(); i++) {
			c ^= s.charAt(i);
		}

		for (int j = 0; j < s.length(); j++) {
			c ^= t.charAt(j);
		}
		return c;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(findTheDifference(s, t));

	}

}