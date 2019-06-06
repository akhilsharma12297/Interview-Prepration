package Stack;

import java.util.Stack;
import java.util.*;

public class NextWarmerDay {

	public static int[] findWarmerTemp(int temp[]) {
		int res[] = new int[temp.length];
		Stack<Integer> st = new Stack<>();

		for (int i = temp.length - 1; i >= 0; i++) {
			if (st.size() > 0 && temp[i] >= temp[st.peek()]) {
				st.pop();
			}

			if (st.size() == 0) {
				res[i] = 0;
			} else {
				res[i] = st.peek() - 1;
			}

		}
		return res;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp[] = new int[n];
		for (int i = 0; i < n; i++)
			temp[i] = sc.nextInt();
		int res[] = findWarmerTemp(temp);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}