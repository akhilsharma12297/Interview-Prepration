package HashMap_Heap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram_Mapping {

	public static int[] anagramMappings(int[] A, int[] B) {
		int[] ans = new int[A.length];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < B.length; i++) {
			map.put(B[i], i);
		}

		for (int i = 0; i < A.length; i++) {
			ans[i] = map.get(A[i]);
		}

		return ans;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = s.nextInt();
		}
		int[] res = anagramMappings(a, b);
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j] + " ");
		}

	}

}
