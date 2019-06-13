package Stack;

import java.util.Stack;;

public class DecdoingString {

	public static String decode(String s) {
		// Write your code here

		Stack<String> stack = new Stack<>();

		StringBuilder sb = new StringBuilder();

		System.out.println(s.charAt(2));

		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) == '[') {

				while ((s.charAt(i) != ']') && (!stack.isEmpty())) {

					if (stack.peek().charAt(0) == ']') {
						break;
					}

					String str = stack.pop();
					if (isAlpha(str.charAt(0))) {
						sb.append(str);
					} else if (isDigit(str.charAt(0))) {
						sb.append(MultiSB(sb, str.charAt(0) - '0'));
					}
				}
				String ans = sb.toString();
				stack.push(ans);
			} else if (isDigit(s.charAt(0))) {
				sb.append(MultiString(stack.pop(), s.charAt(0) - '0'));
				String ans = sb.toString();
				stack.push(ans);

			} else {
				String pusher = s.charAt(i) + "";
				stack.push(pusher);
			}
		}

		String ans = sb.toString();
		return ans;

	}

	private static StringBuilder MultiSB(StringBuilder sb, int n) {
		for (int i = 0; i < n; i++) {
			sb.append(sb);
		}
		return sb;
	}

	private static String MultiString(String sb, int n) {
		for (int i = 0; i < n; i++) {
			sb += sb;
		}
		return sb;
	}

	private static boolean isDigit(char ch) {
		return Character.isDigit(ch);
	}

	private static boolean isAlpha(char ch) {
		return Character.isLetter(ch);
	}

	public static void main(String[] args) {
		String s = "[a2[b]]";
		System.out.println(decode(s));
	}

}