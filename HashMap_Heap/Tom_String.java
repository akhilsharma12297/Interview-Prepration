package HashMap_Heap;

import java.util.*;

public class Tom_String {

	public static int getHashValue(String line) {

		String str = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		HashMap<Character, Integer> map = makeMap(str);

		String[] temp = line.split(" ");
		int sum = 0;

		for (String s : temp) {
			for (int i = 0; i < s.length(); i++) {
				sum += i + (map.get(s.charAt(i)) + 1);
			}
		}

		return 2 * sum;

	}

	private static HashMap<Character, Integer> makeMap(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), i);

		}

		return map;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		System.out.println(getHashValue(line));

	}

}