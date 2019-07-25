package HashMap_Heap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.MarshallerImpl;

public class Smallest_distinct_window {

	public static int minLength(String s) {
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		HashMap<Character, Integer> map = new HashMap<>();

		int i = -1;
		int j = 0;

		int minLength = Integer.MAX_VALUE;

		while (j < s.length()) {

			while (j < s.length() && map.size() < set.size()) {
				map.put(s.charAt(j), map.containsKey(s.charAt(j)) ? map.get(s.charAt(j)) + 1 : 1);
				j++;
			}

			minLength = Math.min(minLength, j - i + 1);

			while (map.size() != set.size() - 1) {
				i++;
				if (map.get(s.charAt(i)) == 1) {
					map.remove(s.charAt(i));
				} else {
					map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
				}
			}
		}

		minLength = Math.min(minLength, j - i);

		return minLength;

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
		System.out.println(minLength("aabcbcdbca"));
	}
}