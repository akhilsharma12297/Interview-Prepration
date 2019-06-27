package Arrays_String;

import java.util.*;

public class Concersion_lower {

	public static String toLowerCase(String str) {

		String ans = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 65 && ch <= 90) {
				ch += 32;
			}

			ans += ch + "";
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(toLowerCase(sc.next()));
	}

}