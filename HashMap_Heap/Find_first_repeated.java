package HashMap_Heap;

import java.util.*;

public class Find_first_repeated {

	public static char solve(String s) {

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (set.contains(ch)) {
				return ch;
			} else {
				set.add(ch);
			}
		}

		return 'a';

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solve(str));

	}

}