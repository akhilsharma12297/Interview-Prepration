package Arrays_String;

public class Best_sighting {

	public static int maxScoreSightseeingPair(int[] arr) {
		int i = 0;
		int j = 1;

		int max = Integer.MIN_VALUE;

		while (j < arr.length) {

			max = Math.max(max, arr[j] + (arr[i] - (j - i)));

			if (arr[j] > (arr[i] - (j - i))) {
				i = j;
			}

			j++;
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 1, 5, 2, 6 };
		System.out.println(maxScoreSightseeingPair(arr));
	}
}