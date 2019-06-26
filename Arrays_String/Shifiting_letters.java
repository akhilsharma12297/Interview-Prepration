package Arrays_String;

import java.util.*;

public class Shifiting_letters {

	public static String shiftingLetters(String S, int[] shifts) {
		int sumfix = 0;

		int[] delta = new int[shifts.length];

		for (int i = shifts.length - 1; i >= 0; i--) {
			sumfix += shifts[i];
			delta[i] = sumfix;
		}

		String ans = "";

		for (int i = 0; i < shifts.length; i++) {
			ans += (char) ((((S.charAt(i) - 'a') + delta[i]) % 26) + 'a');
		}

		return ans;

	}

	public static String shiftingLettersOG(String S, int[] shifts) {
		int total = 0;
		char[] chars = S.toCharArray();

		for (int i = shifts.length - 1; i >= 0; i--) {

			total = (total + shifts[i]) % 26;

			chars[i] += total; // adding to ASCII

			if (chars[i] > 'z') { // if >'z' ASCII ex = 'z' + 3 then add -26 to
									// become 'a'+ 3 -1;
				chars[i] += 'a' - 'z' - 1;
			}
		}

		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int N = sc.nextInt();

		int[] shifts = new int[N];

		for (int i = 0; i < N; i++) {
			shifts[i] = sc.nextInt();
		}

		System.out.println(shiftingLetters(S, shifts));
	}
}