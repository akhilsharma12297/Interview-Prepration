package HashMap_Heap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

import Disjoint_Sets.Job_sequencing.Pair;

public class Sort_On_Freq {

	static class pair implements Comparable<pair> {

		char c;
		int count;

		public pair(char charval, int count) {
			this.c = charval;
			this.count = count;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return o.count - this.count;
		}

	}

	public static String frequencySort(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		for (char ch : map.keySet()) {
			pq.add(new pair(ch, map.get(ch)));
		}
		String str = "";
		while (!pq.isEmpty()) {
			pair temp = pq.poll();

			while (temp.count-- > 0) {
				str += temp.c;
			}

		}
		return str;

	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(frequencySort(sc.next()));
	}

}