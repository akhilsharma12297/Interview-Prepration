package HashMap_Heap;

import java.util.*;

public class top_k_Frequent_word {

	static public class pair implements Comparable<pair> {
		String data;
		int freq;

		pair(String data, int freq) {
			this.data = data;
			this.freq = freq;
		}

		@Override
		public int compareTo(pair o) {
			return o.freq - this.freq;
		}
	}

	public static ArrayList<String> topKFrequent(String[] words, int k) {

		HashMap<String, Integer> map = new HashMap<>();
		PriorityQueue<pair> pq = new PriorityQueue<>();
		ArrayList<String> list = new ArrayList<String>();

		for (String word : words) {
			map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
		}

		for (String word : map.keySet()) {
			pq.add(new pair(word, map.get(word)));
		}

		while (k-- > 0) {
			pair temp = pq.remove();
			list.add(temp.data);
		}

		return list;
	}

	// Don't make any changes here
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] array = new String[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.next();
		}
		int k = s.nextInt();
		ArrayList<String> res = topKFrequent(array, k);
		Collections.sort(res);
		System.out.println(res);

	}

}