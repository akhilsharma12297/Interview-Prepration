package Stack;

import java.util.*;

public class PrintBinaryTillN {

	public static void getBinary(int n) {

		Queue<String> q = new LinkedList<>();

		q.add("1");
		while (n-- > 0) {

			String str = q.remove();

			System.out.println(str);

			String temp = str;

			q.add(str + "0");

			q.add(str + "1");

		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		getBinary(n);

	}
}