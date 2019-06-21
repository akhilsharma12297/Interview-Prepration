package HashMap_Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import HashMap_Heap.Sort_On_Freq.pair;

public class Sort_on_freq_number {

	static class Pair {

		int num;
		int freq = 0;

		Pair(int num, int f) {
			this.num = num;
			this.freq = f;
		}
	}

	static void sortByFreq(int arr[], int n) {
		// add your code here
		HashMap<Integer, Pair> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], new Pair(arr[i], 1));
			} else {
				map.get(arr[i]).freq++;
			}
		}
		ArrayList<Pair> list = new ArrayList<>(map.values());
		Collections.sort(list, new Comparator<Pair>() {
			public int compare(Pair a, Pair b) {
				return a.freq != b.freq ? b.freq - a.freq : (a.num < b.num ? -1 : 1);
			}
		});
		for (Pair p : list) {
			while (p.freq-- > 0) {
				System.out.print(p.num + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sortByFreq(arr, N);
	}
}
