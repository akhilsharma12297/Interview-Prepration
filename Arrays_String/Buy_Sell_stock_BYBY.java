package Arrays_String;

import java.util.Scanner;

public class Buy_Sell_stock_BYBY {

	public static int maxProfit(int[] A) {
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for (int price : A) {
			if (price > min)
				profit += price - min;
			min = price;
		}
		return profit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxProfit(arr));
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}