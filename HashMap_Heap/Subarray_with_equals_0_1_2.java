package HashMap_Heap;

import java.util.HashMap;

public class Subarray_with_equals_0_1_2 {

	public static void main(String[] args) {

		equal_012("102100211");

	}

	private static void equal_012(String str) {

		HashMap<String, Integer> map = new HashMap<>();

		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int ans = 0;
		map.put("0*0", 1);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '0') {
				c0++;
			} else if (ch == '1') {
				c1++;
			} else if (ch == '2') {
				c2++;
			}

			String temp = (c0 - c1) + "*" + (c0 - c2); // if count0[i] -count0[j] = count1[i] -count1[j]
														// = count2[i] -count2[j]
			if (map.containsKey(temp)) { // then valid,ie if c0[i]-c1[i] = c0[j]-c1[j] and the other sequence
				ans += map.get(temp);
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}

		System.out.println(ans);
	}
}
