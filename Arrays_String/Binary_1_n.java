package Arrays_String;

import java.util.Scanner;

public class Binary_1_n {

	public static boolean queryString(String S, int N) {

		for (int i = N; i > N / 2; i--) {
			if (S.contains(Integer.toBinaryString(i)) == false)
				return false;
		}

		return true;
	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		System.out.println(queryString(str, n));

	}

}