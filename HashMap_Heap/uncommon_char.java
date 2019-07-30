package HashMap_Heap;

import java.util.*;

public class uncommon_char {

	public static void uncommon(String str1, String str2) {

		int arr1[] = new int[26];
		int arr2[] = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			arr1[(int) str1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			arr2[(int) str2.charAt(i) - 'a']++;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0 && arr2[i] > 0 || arr1[i] > 0 && arr2[i] == 0) {
				System.out.print((char) (i + 'a'));

			}
		}
		System.out.println();
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "characters";

		String str2 = "alphabets";

		uncommonBitMask(str1, str2);

	}

	public static void uncommonBitMask(String str1, String str2) {

		long b1 = 0;
		long b2 = 0;

		for (int i = 0; i < str1.length(); i++) {

			b1 = b1 | (1 << ((int) str1.charAt(i)) - 'a');
		}

		for (int i = 0; i < str2.length(); i++) {

			b2 = b2 | (1 << ((int) str2.charAt(i)) - 'a');
		}

		for (int i = 0; i <= 32; i++) {

			if (((b1 & (1 << i)) == 1 && (b2 & (1 << i)) == 0 || ((b1 & (1 << i)) == 0 && (b2 & (1 << i)) == 1))) {

				System.out.println(i + 'a');
			}

		}

	}
}