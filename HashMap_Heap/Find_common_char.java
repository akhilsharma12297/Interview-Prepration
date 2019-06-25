package HashMap_Heap;

import java.util.*;

public class Find_common_char {

	public static ArrayList<String> commonChars(String[] A) {

		ArrayList<String> list = new ArrayList<>();

		int[] count = new int[26];
		
		Arrays.fill(count, Integer.MAX_VALUE);
		
		for (String str : A) {
			int[] temp = new int[26];
			for (int i = 0; i < str.length(); i++) {
				temp[str.charAt(i) - 'a']++;
			}

			for (int i = 0; i < count.length; i++) {
				count[i] = Math.min(count[i], temp[i]);
			}
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				while (count[i] > 0) {
					list.add((char) ('a' + i) + "");
					count[i]--;
				}
			}
		}

		return list;
	}

	// Don't make any changes here.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] A = new String[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = s.nextLine();
		}

		ArrayList<String> res = commonChars(A);
		Collections.sort(res);
		System.out.println(res);

	}

}