package HashMap_Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class IsFrequencyEqual {

	public static boolean isFrequencyEqual(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		System.out.println(map);

		int max = 0;

		for (int val : map.values()) {

			max = Math.max(val, max);

		}

		Boolean flag = false;

		for (int val : map.values()) {
			if (val == max || val == max - 1) {
				flag = true;
			}
		}

		return flag;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean bl = isFrequencyEqual(s);
		System.out.println(bl);
	}
}
