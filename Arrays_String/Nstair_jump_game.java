package Arrays_String;

import java.util.Scanner;

public class Nstair_jump_game {

	public static void main(String[] args) {

	}

	private static int ans(int[] arr) {

		int stairs = 1;
		int l = 0;
		int jumps = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i > arr.length - 1) {
				return jumps;
			}

			l = Math.max(l, i + arr[i]);
			stairs--;

			if (stairs == 0) {

				jumps++;
				stairs = l - i;

				if (stairs == 0) {
					return jumps;
				}
			}
		}

		return -1;
	}

}