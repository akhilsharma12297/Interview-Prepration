package HashMap_Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Identify_string {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.
	public static String reorganizeString(String S) {

		int N = S.length();

		int[] count = new int[26];

		for (char c : S.toCharArray())
			count[c - 'a']++;
		PriorityQueue<MultiChar> pq = new PriorityQueue<MultiChar>(
				(a, b) -> a.count == b.count ? a.letter - b.letter : b.count - a.count);

		for (int i = 0; i < 26; ++i)
			if (count[i] > 0) {
				if (count[i] > (N + 1) / 2)
					return "";
				pq.add(new MultiChar(count[i], (char) ('a' + i)));
			}

		StringBuilder ans = new StringBuilder();
		while (pq.size() >= 2) {
			MultiChar mc1 = pq.poll();
			MultiChar mc2 = pq.poll();

			ans.append(mc1.letter);
			ans.append(mc2.letter);
			if (--mc1.count > 0)
				pq.add(mc1);
			if (--mc2.count > 0)
				pq.add(mc2);
		}

		if (pq.size() > 0)
			ans.append(pq.poll().letter);
		return ans.toString();
	}

	static class MultiChar {
		int count;
		char letter;

		MultiChar(int ct, char ch) {
			count = ct;
			letter = ch;
		}
	}
	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println(reorganizeString(s));

	}

}