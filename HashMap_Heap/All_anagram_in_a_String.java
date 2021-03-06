package HashMap_Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All_anagram_in_a_String {

	public static ArrayList<Integer> findAnagrams(String s, String p) {

		ArrayList<Integer> arr = new ArrayList<>();
		int[] charhash = new int[26];
		for (char c : p.toCharArray()) {
			charhash[c - 'a']++;
		}

		if (s.length() < p.length()) {
			return arr;
		}

		int[] windowcharhash = new int[26];

		int start = 0 - p.length();
		int end = -1;
		int matchedcount = 0;

		while (true) {
			if (matchedcount == p.length()) {
				arr.add(start);
			}
			end++;
			if (end >= s.length()) {
				break;
			}

			if (end < 0) {

			} else {
				if (windowcharhash[s.charAt(end) - 'a'] < charhash[s.charAt(end) - 'a']) {
					matchedcount++;
				}
				windowcharhash[s.charAt(end) - 'a']++;
			}
			if (start < 0) {

			} else {
				if (charhash[s.charAt(start) - 'a'] > 0
						&& windowcharhash[s.charAt(start) - 'a'] <= charhash[s.charAt(start) - 'a']) {
					matchedcount--;
				}
				windowcharhash[s.charAt(start) - 'a']--;
			}
			start++;
		}
		return arr;

	}

	public static List<Integer> findAnagramss(String s, String p) {
		int[] map = new int[256];
		for (int i = 0; i < p.length(); i++) {
			map[p.charAt(i)]++;
		}
		List<Integer> ans = new ArrayList<>();
		int left = 0;
		int right = 0;
		while (right < s.length()) {
			if (map[s.charAt(right)] > 0) {
				map[s.charAt(right)]--;
				right++;
				if (right - left == p.length()) {
					ans.add(left);
				}
			} else {
				map[s.charAt(left)]++;
				left++;
			}
		}
		return ans;

	}
	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String p = scn.next();
		System.out.println(findAnagrams(s, p));
	}
}