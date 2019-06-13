package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int h = scn.nextInt();
		int height[] = new int[h];
		for (int i = 0; i < h; i++) {
			height[i] = scn.nextInt();
		}
		System.out.println((height));
	}

}
