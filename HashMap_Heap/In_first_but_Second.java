package HashMap_Heap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class In_first_but_Second {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] num = new long[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextLong();
		}
		int m = scn.nextInt();
		long[] num2 = new long[m];
		for (int i = 0; i < m; i++) {
			num2[i] = scn.nextLong();
		}
		solve(num, num2, n, m);
	}

	public static void solve(long a[], long b[], int n, int m) {

		HashMap<Long, Boolean> map = new HashMap<>();

		for (long val : a) {
			map.put(val, false);
		}

		for (long val : b) {
			map.put(val, true);

		}

		for (long val : a) {
			if (!map.get(val)) {
				System.out.print(val + " ");
			}
		}
	}
}