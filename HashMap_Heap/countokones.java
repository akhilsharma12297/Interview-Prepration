package HashMap_Heap;

import java.util.*;

public class countokones {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int K = scn.nextInt();

		System.out.println(countOfSubstringWithKOnes(s, K));
	}

	static int countOfSubstringWithKOnes(String s, int k) {

		int i = 0;
		int j = 0;
		int zctr = 0;
		int ans = 0;

		char[] arr = s.toCharArray();

		while (j < arr.length) {
			while (j < arr.length && zctr <= k) {
				if (arr[j] == '1') {
					zctr++;
				}
				j++;
			}

			if (k == zctr) {
				ans++;
			}

			while (j < arr.length && zctr <= k) {
				if (arr[j] == '1') {
					break;
				}
				j++;
			}

			if (k == zctr) {
				ans++;
			}

			while (i < arr.length && zctr != k - 1) {
				if (arr[i] == '1') {
					zctr--;
				}

				i++;
			}

		}
		return ans;
	}

	static int countOfSubstringWithKOnes2(String s, int K) {
		int N = s.length();
		int res = 0;
		int countOfOne = 0;
		HashMap<Integer, Integer> freq = new HashMap<>();

		freq.put(0, 1);

		for (int i = 0; i < N; i++) {

			countOfOne += (s.charAt(i) - '0');

			if (countOfOne >= K) {

				if (freq.containsKey(countOfOne - K)) {
					res += freq.get(countOfOne - K);
				} else {
					res += 0;
				}
			}

			freq.put(countOfOne, freq.getOrDefault(countOfOne, 0) + 1);
		}

		return res;
	}

}