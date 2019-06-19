package HashMap_Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class FindFake {

	public static void findIfFake(String s) {
		// Write your code here

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			set.add(ch);
		}

		if (set.size() % 2 == 0) {
			System.out.print("MALE!");
		} else {
			System.out.print("FEMALE!");
		}
	}

	// Don't make any changes here
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		findIfFake(br.readLine());
	}
}