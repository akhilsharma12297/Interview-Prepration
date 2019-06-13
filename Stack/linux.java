package Stack;

import java.util.Stack;

public class linux {

	public static void main(String[] args) {
		String str = "///a/b//c///";

		ans(str);

	}

	public static void ans(String str) {

		Stack<Character> stack = new Stack<>();

		int dctr = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == '/') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '/') {
						continue;
					} else {
						stack.push(ch);
					}
				} else {
					stack.push(ch);
				}

			} else if (ch == '.') {

				/*
				 * if (stack.peek()) {
				 * 
				 * }
				 */
			} else {

				stack.push(ch);

			}

		}

		if (stack.peek() == '/')

		{
			stack.pop();
		}

		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i));
		}

	}

}
