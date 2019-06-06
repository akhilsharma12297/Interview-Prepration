package Stack;

import java.util.Stack;
import java.util.Scanner;

public class CompareTwoString {

	public static boolean compareString(String str, String str2) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#') {
				stack.pop();
			} else {
				stack.add(str.charAt(i));
			}
		}

		Stack<Character> stack2 = new Stack<>();

		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == '#') {
				stack2.pop();
			} else {
				stack2.add(str2.charAt(i));
			}
		}

		if (stack.size() == stack2.size()) {
			return true;
		}

		return false;

		// write your code here
	}

//Driver program
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();

		System.out.println(compareString(s1, s2));
	}
}