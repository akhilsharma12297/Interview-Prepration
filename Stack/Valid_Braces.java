package Stack;

import java.util.Stack;;

public class Valid_Braces {

	public static void ans(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			}

			else if (ch == '}' && stack.peek() == '{' || ch == ']' && stack.peek() == '['
					|| ch == ')' && stack.peek() == '(') {
				stack.pop();
			}

		}

		if (stack.size() == 0) {
			System.out.println("BALANCED");
		} else {
			System.out.println("UNBALANCED");
		}
	}

	public static void main(String[] args) {

		ans("[([[(({}))]])}	");
	}

}
