package Arrays_String;

import java.util.*;

public class nextTime {

	public static String nextClosestTime(String t) {

		TreeSet<Integer> set = new TreeSet<>();
		int[] arr = new int[t.length()];
		int min = Integer.MAX_VALUE;
		arr[2] = -1;
		for (int i = 0; i < t.length(); i++) {

			char ch = t.charAt(i);
			if (ch != ':') {
				arr[i] = ch - '0';
				set.add(ch - '0');

				min = Math.min(min, arr[i]);
			}
		}

		for (int i = t.length() - 1; i > 0; i--) {

			if (i == 4) {
				if (set.higher(arr[i]) != null) {
					arr[i] = set.higher(arr[i]);
					break;
				} else {
					arr[i] = min;
				}
			} else if (i == 3) {
				if (set.higher(arr[i]) != null && set.higher(arr[i]) < 6) {
					arr[i] = set.higher(arr[i]);
					break;
				} else {
					arr[i] = min;
				}
			} else if (i == 1) {
				if (set.higher(arr[i]) != null && set.higher(arr[i]) <= 9 && (set.contains(0) || set.contains(1))) {
					arr[i] = set.higher(arr[i]);
					break;
				} else {
					arr[i] = min;
				}
			} else if (i == 0) {
				if (set.higher(arr[i]) != null && set.higher(arr[i]) <= 2) {
					arr[i] = set.higher(arr[i]);
					break;
				} else {
					arr[i] = min;
				}
			}

		}
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 2) {
				str += ":";
			} else {
				str += arr[i] + "";
			}
		}

		return str;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		System.out.println(nextClosestTime(time));

	}
}