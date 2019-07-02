package Arrays_String;

import java.util.Scanner;

public class Rev_String {

	public static void reverseString(char[] s) {
		// Write your code here

		int l = 0;
		int r = s.length - 1;

		while (r > l) {

			char temp = s[r];
			s[r] = s[l];
			s[l] = temp;

			l++;
			r--;
		}

	}

	// Don't make any changes here.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char[] charArray = new char[n];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = scn.next().charAt(0);
		}

		reverseString(charArray);

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}

	}

}