package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void func(int[] arr) {

		int[] left = new int[arr.length];
		int[] right = new int[arr.length];

		Stack<Integer> stack = new Stack<Integer>();

		left[0] = 0;

		stack.push(0);

		for (int i = 0; i < arr.length; i++) {

		}

		stack = new Stack<Integer>();
		right[arr.length - 1] = arr.length - 1;

		stack.push(arr.length - 1);

		for (int i = arr.length - 1; i >= 0; i--) {

			while (stack.size() > 0 && arr[i] < arr[stack.peek()]) {
				stack.pop();
			}

			if (stack.size() == 0) {
				right[i] = arr.length - 1;
			} else {
				right[i] = stack.peek();
			}
			stack.push(i);
		}

	}
}
