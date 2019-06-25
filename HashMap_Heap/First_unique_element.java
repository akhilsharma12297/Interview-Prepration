package HashMap_Heap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class First_unique_element {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scn.nextInt();
			}
			solve(num, k);
		}
	}

	public static void solve(int[] arr, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int val : arr) {
			hmap.put(val, hmap.getOrDefault(val, 0) + 1);
		}

		for (int val : arr) {
			if (hmap.get(val) == 1) {
				System.out.println(val);
				return;
			}
		}
	}
}