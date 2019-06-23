package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class Happy_Number {

	public static boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<>();

		while (set.add(n)) {
			int val = 0;
			while (n > 0) {
				val += Math.pow(n % 10, 2);
				n /= 10;

			}

			n = val;
		}

		return (n == 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (isHappy(N)) {
			System.out.println("Happy");
		} else {
			System.out.println("Not Happy");
		}
	}

}