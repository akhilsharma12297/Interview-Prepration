package Arrays_String;

import java.util.*;

public class Flip_game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		List<String> res = generatePossibleNextMoves(s);
		System.out.print(res);
	}

	public static List<String> generatePossibleNextMoves(String s) {

		List<String> str = new ArrayList<String>();

		int i = 0;
		int j = 1;
		while (j < s.length()) {

			if (s.charAt(i) == '+' && s.charAt(j) == '+') {

				String ans = s.subSequence(0, i) + "";
				ans += "-" + "-";
				ans += s.subSequence(j + 1, s.length());

				str.add(ans);

			}

			i++;
			j++;
		}
		return str;

	}
}