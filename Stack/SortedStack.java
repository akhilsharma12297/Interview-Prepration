package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SortedStack {

	public static Stack<Integer> sortstack(Stack<Integer> input) {

		Stack<Integer> helper = new Stack<>();

		while (!input.isEmpty()) {
			int temp = input.pop();

			if (!helper.isEmpty() && helper.peek() > temp) {
				input.push(helper.pop());
			}
			helper.push(temp);
		}

		return helper;
	}

	public static void main(String args[]) {
		Stack<Integer> input = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			input.push(sc.nextInt());

		Stack<Integer> res = sortstack(input);

		while (!res.empty()) {
			System.out.print(res.pop() + " ");
		}
	}
}