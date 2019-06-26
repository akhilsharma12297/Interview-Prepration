package HashMap_Heap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Smallest_distinct_window {

	public static int minLength(String s) {
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		HashMap<Character, Integer> map = new HashMap<>();

		int i = -1;
		int j = 0;
		while (j > s.length()) {

		}

	}

	public static int minLengthOG(String s) {
		int n = s.length();
		HashSet<Character> visited = new HashSet<Character>();
		int distcount = 0;

		for (int i = 0; i < n; i++) {

			visited.add(s.charAt(i));
		}
		HashMap<Character, Integer> map = new HashMap<>();
		int count[] = new int[256];
		int min = Integer.MAX_VALUE;
		int start = 0, minlen = 0, c = 0;
		for (int i = 0; i < n; i++) {
			count[s.charAt(i)]++;
			if (count[s.charAt(i)] == 1) {
				c++;
			}
			if (c == distcount) {
				while (count[s.charAt(start)] > 1) {
					if (count[s.charAt(start)] > 1) {
						count[s.charAt(start)]--;
					}
					start++;
				}
				minlen = i - start + 1;
				if (minlen < min) {
					min = minlen;
				}
			}
		}
		return min;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(minLength(sc.next()));
	}
}