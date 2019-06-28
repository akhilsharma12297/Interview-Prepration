package Arrays_String;

import java.util.Scanner;

public class Masking_personal_informtion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.print(maskPII(str));
	}

	public static String maskPII(String str) {

		if (str.charAt(0) == '+') {

			return numberMasked(str);

		} else {

			return str.substring(0, 1).toLowerCase() + "*****"
					+ str.substring(str.indexOf('@') - 1, str.length()).toLowerCase();
		}
	}

	private static String numberMasked(String str) {
		char modify[] = str.toCharArray();
		String Digits = "";
		for (int i = 0; i < modify.length; i++) {
			if (modify[i] != '+' && modify[i] != '-' && modify[i] != ')' && modify[i] != '(' && modify[i] != ' ') {
				Digits += modify[i];
			}
		}
		StringBuilder ans = new StringBuilder();
		ans.append("***-***-" + Digits.substring(Digits.length() - 4));

		if (Digits.length() == 10) {

			return ans.toString();
		}
		String ns = '+' + "";
		for (int i = 0; i < Digits.length() - 10; i++) {
			ns += '*';
		}
		ns += '-' + ans.toString();

		return ns;
	}

}