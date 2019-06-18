package HashMap_Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class isConTiguonus {

	public static boolean isContiguous(int[] arr) {
		// Write your Code here
		HashSet<Integer> set = new HashSet<>();

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

		for (int val : arr) {
			max = Math.max(max, val);
			min = Math.min(min, val);

			set.add(val);
		}

		for (int i = 0; i < set.size(); i++) {

			if (!set.contains(min + i)) {
				return false;
			}

		}

		return true;

	}

	// Don't make changes here
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		boolean bl = isContiguous(num);
		System.out.println(bl);
	}
}