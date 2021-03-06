package HashMap_Heap;

import java.util.*;

public class Group_Anagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		for (String str : strs) {

			char[] key = str.toCharArray();

			Arrays.sort(key);

			String temp = String.valueOf(key);

			if (!map.containsKey(temp)) {
				map.put(temp, new ArrayList<>());
				map.get(temp).add(str);
			} else {
				map.get(temp).add(str);
			}

		}

		return new ArrayList<>(map.values());
	}

	private static String getKey(char[] str) {

		String ans = "";

		for (int i = 1; i < str.length; i++) {

			int diff = str[i] - str[i - 1];
			ans += diff < 0 ? diff + 26 : diff;
		}
		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Length of the array
		int N = sc.nextInt();

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		List<List<String>> anagramsGrouped = groupAnagrams(arr);

		for (List<String> lst : anagramsGrouped) {
			Collections.sort(lst);
		}

		anagramsGrouped.sort(new ListComparator());

		display(anagramsGrouped);

	}

	// Comparator for sorting the result list.
	static class ListComparator implements Comparator<List<String>> {

		@Override
		public int compare(List<String> l1, List<String> l2) {

			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			for (int i = 0; i < l1.size(); i++) {
				String l1str = l1.get(i);
				String l2str = l2.get(i);

				return l1str.compareTo(l2str);

			}

			return 0;

		}
	}

	// Function to display a List of Lists of strings.
	public static void display(List<List<String>> list) {

		for (int i = 0; i < list.size(); i++) {

			List<String> currList = list.get(i);

			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}

			System.out.println();
		}

	}

}