package Arrays_String;

import java.util.*;

public class Number_to_english_word {

	public static void main(String[] args) {
		System.out.println(numberToWords(57));
	}

	private final static String[] LessThanTwenty = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private final static String[] Tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };
	private final static String[] Big = { "", "Thousand", "Million", "Billion" };

	public static String numberToWords(int num) {

		return func(num);
	}

	private static String func(int num) {

		if (num == 0)
			return "Zero";

		StringBuilder ans = new StringBuilder();
		int idx = 0;

		while (num > 0) {

			if (num % 1000 != 0) {
				StringBuilder temp = new StringBuilder();
				func2(temp, num % 1000);
				ans.insert(0, temp.append(Big[idx])).append(" ");
			}
			idx++;
			num /= 1000;

		}
		return ans.toString().trim();

	}

	private static void func2(StringBuilder ans, int n) {
		if (n == 0) {
			return;
		}
		if (n < 20) {
			ans.append(LessThanTwenty[n]).append(" ");
			return;
		}
		if (n < 100) {
			ans.append(Tens[n / 10]).append(" ");
			func2(ans, n % 10);
		} else {
			ans.append(LessThanTwenty[n / 100]).append(" Hundred ");
			func2(ans, n % 100);
		}
	}

}