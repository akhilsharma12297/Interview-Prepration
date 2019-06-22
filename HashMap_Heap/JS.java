package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class JS {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String J = scn.next();
		String S = scn.next();
		System.out.print(numJewelsInStones(J, S));
	}

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input 2 strings.
	// It should return an integer value.
	public static int numJewelsInStones(String J, String S) {
		// Write your code here
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < J.length(); i++) {
			char ch = J.charAt(i);
			set.add(ch);
		}

		int ctr = 0;

		for (int j = 0; j < S.length(); j++) {
			char ch = S.charAt(j);

			if (set.contains(ch)) {
				ctr++;
			}
		}

		return ctr;
	}
}