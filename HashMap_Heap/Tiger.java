package HashMap_Heap;

import java.util.HashSet;
import java.util.Scanner;

public class Tiger {

	public static int open_closeTabs(String[] T) {
		// Write your code here

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < T.length; i++) {
			if (T[i].equals("END")) {
				set.clear();
			} else if (!set.contains(T[i])) {
				set.add(T[i]);
			} else if (set.contains(T[i])) {
				set.remove(T[i]);
			}
		}

		return set.size();

	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] T = new String[n];
		for (int i = 0; i < n; i++) {
			T[i] = sc.next();
		}
		System.out.println(open_closeTabs(T));
	}

}