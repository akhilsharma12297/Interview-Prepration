package Stack;

import java.util.Stack;

public class ValidStack {

	public static void main(String[] args) {

		int[] arr = { 12, 21, 34, 43, 45, 54, 56, 65, 67, 76, 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 4, 3, 2, 1, 76, 67, 65, 56, 54, 45, 43, 34, 21, 12 };

		System.out.println(validateStackSequences(arr, arr2));
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		int i = 0;
		int j = 0;
		Stack<Integer> st = new Stack<>();
		while (j < pushed.length) {
			st.push(pushed[j++]);
			while (!st.isEmpty() && st.peek() == popped[i] && i < popped.length) {
				st.pop();
				i++;
			}
		}
		if (i < popped.length) {
			return false;
		}
		return true;
	}

}