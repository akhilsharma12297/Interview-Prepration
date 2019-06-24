package HashMap_Heap;

import java.util.*;

public class Pepcoding_new_Style {

	private static void solve(String[] str) {

		HashMap<String, Integer> set = new HashMap<>();

		for (String s : str) {
			if (set.containsKey(s)) {

				set.put(s, set.get(s) + 1);
				System.out.println(s + "" + set.get(s));

			} else {
				set.put(s, 0);
				System.out.println("Verified");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Length of the array
		int N = sc.nextInt();

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		solve(arr);

	}

}