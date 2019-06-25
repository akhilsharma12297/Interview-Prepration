package HashMap_Heap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class first_come_First_serve {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		solve(num, k);
	}

	public static void solve(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		boolean flag = false;
		for (int val : arr) {

			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);

			} else {
				map.put(val, 1);
			}

		}

		for (int val : arr) {
			if (map.get(val) == k) {
				System.out.print(val);
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.print(-1);
		}

	}
}