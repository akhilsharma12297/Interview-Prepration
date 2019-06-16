package HashMap_Heap;

import java.util.Scanner;

public class char_E_O {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char alpha[] = new char[26];

		for (char ch : s.toCharArray()) {
			alpha[ch - 'a']++;
		}

		int x = 0;
		int y = 0;

		for (int i = 0; i < 26; i++) {
			if (alpha[i] != 0) {
				if (alpha[i] % 2 == 0 && (i + 1) % 2 == 0) {
					x++;
				} else if (alpha[i] % 2 == 1 && (i + 1) % 2 == 1) {
					y++;
				}
			}
		}

		if ((x + y) % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

	}

}