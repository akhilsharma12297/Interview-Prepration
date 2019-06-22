package HashMap_Heap;

import java.util.Scanner;

public class Remove_M_N {

	public static void removeString(String str, String m, String n) {

		int[] ans = new int[str.length()];

		for (int i = 0; i < str.length() - m.length() + 1; i++) {

			String ss = str.substring(i, i + m.length());

			if (ss.compareTo(m) == 0) {

				for (int j = i; j < i + m.length(); j++) {
					ans[j]++;
				}
			}

		}

		for (int i = 0; i < str.length() - n.length() + 1; i++) {

			String ss = str.substring(i, i + n.length());

			if (ss.compareTo(n) == 0) {
				for (int j = i; j < i + n.length(); j++) {
					ans[j]++;
				}
			}

		}

		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {

			if (ans[i] == 0) {
				System.out.print(str.charAt(i) + " ");
				flag = true;
			}

		}

		if (!flag) {
			System.out.println(-1);
		}

	}

	// Dont make chsnges here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String m = sc.next();
		String n = sc.next();
		removeString(str, m, n);
	}

}