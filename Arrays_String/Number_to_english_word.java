package Arrays_String;

import java.util.*;

public class Number_to_english_word {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(numberToWords(num));
	}

	static String[] words = { "" + "thousand" + "million" + "billion" };
	static String[] teens = { "twenty" + "thirty" + "fourty" + "fifty" + "sixty" + "seventy" + "eighty" + "ninty" };
	static String[] unit = { "one" + "two" + "three" + "four" + "five" + " six" + "seven" + "eight" + "nine" };

	public static String numberToWords(int num) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (num > 0) {
			arr.add(num % 10);
			num = num / 10;
		}

		Collections.reverse(arr);
		func(arr, 0, arr.size(), 0);
		return null;
	}

	private static void func(List<Integer> arr, int i, int j, int idx) {

		if (arr.size() == 3) {

		}

		List<Integer> narr = arr.subList(i, j - 3);

		func(narr, i, j - 3, idx + 1);

	}

}