package Arrays_String;

import java.util.*;

public class shortest_word_distance {

	public static int shortestWordDistance(String[] words, String word1, String word2) {

		int a = -1;
		int b = -1;
		int max = -1;
		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			if (word.equals(word1)) {
				a = i;
			}

			if (word.equals(word2)) {
				b = i;
			}

			max = Math.max(max, b - a);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
		}
		String word1 = sc.next(), word2 = sc.next();
		System.out.println(shortestWordDistance(words, word1, word2));
	}

}