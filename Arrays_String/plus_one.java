package Arrays_String;

import java.util.Scanner;

public class plus_one {

	public static int[] plusOne(int[] digits) {

		return digits;
	}

	// Don't make any changes here.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] Input = new int[n];
		for (int i = 0; i < Input.length; i++) {
			Input[i] = scn.nextInt();
		}
		int ans[] = plusOne(Input);
		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

}