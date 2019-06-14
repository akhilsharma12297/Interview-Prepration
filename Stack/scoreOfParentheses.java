package Stack;

import java.util.Scanner;
import java.util.Stack;

public class scoreOfParentheses {

	public static int scoreOfParentheses(String s) {

		int ans = 0;
		Stack<String> stack = new Stack();
		for (int i = 0; i < s.length(); i++) {

			int a = -1;

			if (s.charAt(i) == '(') {
				while (!stack.peek().equals(")")) {
					String pop = stack.pop();

					if (a == -1) {
						a = Integer.parseInt(pop);
					} else {
						a += Integer.parseInt(pop);
					}
				}
				stack.pop();
				if (a == -1) {
					a = 1;
				} else {
					a = (2 * a);
				}

				stack.push(a + "");

			} else {
				stack.push("" + s.charAt(i));
			}
		}

		while (stack.size() != 0)
			ans += Integer.parseInt(stack.pop());
		return ans;
	}

	public static int og(String s) {
		int ans = 0;
		Stack<String> stack = new Stack();
		for (int i = 0; i < s.length(); i++) {
			int a = -1;
			if (s.charAt(i) == ')') {

				if (!stack.isEmpty()) {
					while (!stack.isEmpty() && !stack.peek().equals("(")) {
						String p = stack.pop();
						if (a == -1)
							a = Integer.parseInt(p);
						else
							a += Integer.parseInt(p);
					}
					stack.pop();
				}
				stack.push(("" + (a == -1 ? 1 : (2 * a))));
			} else
				stack.push("" + s.charAt(i));
		}
		while (stack.size() != 0)
			ans += Integer.parseInt(stack.pop());
		return ans;
	}

	// Dont make changes here
	public static void main(String[] args) {
		String s = ")))))))))))))))))))))))((";
		// System.out.println(scoreOfParentheses(s));
		System.out.println(og(s));
	}

}