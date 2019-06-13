package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveRep {

	static long removeRep(long n) {
		String str = Long.toString(n);

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!stack.isEmpty() && ch == stack.peek()) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		String ans = new String();
		for (int i = 0; i < stack.size(); i++) {

			ans += stack.get(i);
		}
		return Long.parseLong(ans);
	}

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); long A = sc.nextLong();
		 */
		System.out.println(removeRep(122288112));

	}

}