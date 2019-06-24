package HashMap_Heap;

import java.util.*;

public class Uncommon_words_freq {

	public static Object[] uncommonFromSentences(String str1, String str2) {

		HashMap<String, Boolean> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();

		String[] temp1 = str1.split("\\s");

		for (String temp : temp1) {
			if (map.containsKey(temp)) {
				map.put(temp, false);
				set.remove(temp);
			} else if (map.containsKey(temp) == false) {
				map.put(temp, true);
				set.add(temp);
			}
		}

		String[] temp2 = str2.split("\\s");
		for (String temp : temp2) {
			if (map.containsKey(temp)) {
				map.put(temp, false);
				set.remove(temp);
			} else if (map.containsKey(temp) == false) {
				map.put(temp, true);
				set.add(temp);
			}
		}

		Object[] ans = set.toArray();

		Arrays.sort(ans);
		return ans;
	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String A = s.nextLine();
		String B = s.nextLine();

		Object ans[] = uncommonFromSentences(A, B);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}