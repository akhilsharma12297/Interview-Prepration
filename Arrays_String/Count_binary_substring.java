package Arrays_String;

import java.util.*;

public class Count_binary_substring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.print(countBinarySubstrings(s));
	}

	public static int countBinarySubstrings(String s) {

		int prev = 0;
		int curr = 1;
		int ans = 0;

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i - 1) == s.charAt(i)) {

				curr++;
			} else {
				prev = curr;
			}

			if (prev >= curr) {
				ans++;
			}

		}
		return ans;

	}
}