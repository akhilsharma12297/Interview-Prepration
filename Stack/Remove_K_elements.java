package Stack;

import java.util.Stack;

import java.util.Scanner;

public class Remove_K_elements {

	public static String removeMakeSmallest(String num, int k) {

		Stack<Character> stack = new Stack<>();
		int i = 0;

		while (i < num.length()) {

			while (k > 0 && !stack.isEmpty() && !stack.empty() && stack.peek() > num.charAt(i)) {
				stack.pop();
				k--;
			}

			stack.push(num.charAt(i));
			i++;

		}

		while (k > 0) {
			stack.pop();
			k--;
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty())
			sb.append(stack.pop());
		sb.reverse();

		while (sb.length() > 1 && sb.charAt(0) == '0')
			sb.deleteCharAt(0);
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		System.out.println(removeMakeSmallest(s, k));
	}

}