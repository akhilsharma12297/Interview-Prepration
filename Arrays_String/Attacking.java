package Arrays_String;

import java.util.Scanner;

public class Attacking {

	public static int findPoisonedDuration(int[] timeSeries, int duration) {

		int start = timeSeries[0];
		int end = start + duration;
		int result = 0;
		for (int i = 0; i < timeSeries.length; i++) {
			if (timeSeries[i] > end) {
				result += end - start;
				start = timeSeries[i];
				end = start + duration;
			} else {
				end = timeSeries[i] + duration;
			}
		}

		result += end - start;

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] timeseries = new int[n];
		for (int i = 0; i < n; i++) {
			timeseries[i] = sc.nextInt();
		}
		System.out.println(findPoisonedDuration(timeseries, k));
	}

}