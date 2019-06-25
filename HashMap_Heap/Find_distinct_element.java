package HashMap_Heap;

import java.util.*;

public class Find_distinct_element {

	public static int count(int[][] a) {

		int i = 0, j = 0;

		HashSet<Integer> hs = new HashSet<Integer>();

		for (i = 0; i < a.length; i++) {

			HashSet<Integer> temp = new HashSet<Integer>();

			for (j = 0; j < a.length; j++) {

				if (i == 0) {

					hs.add(a[i][j]);
				} else {
					temp.add(a[i][j]);
				}
			}
			if (i != 0) {
				Iterator<Integer> itr = hs.iterator();
				while (itr.hasNext()) {
					int x = itr.next();
					if (!temp.contains(x)) {
						itr.remove();
					}
				}
			}
		}

		return hs.size();
	}

	// Don't make any changes here
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		System.out.println(count(a));

	}

}