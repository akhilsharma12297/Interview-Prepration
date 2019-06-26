package Arrays_String;

import java.util.*;

public class Sorted_Array {

	public static int[] deckRevealedIncreasing(int[] deck) {

		int[] ans = new int[deck.length];

		LinkedList<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < deck.length; i++) {
			queue.addLast(i);
		}

		Arrays.sort(deck);

		for (int i = 0; i < deck.length; i++) {
			ans[queue.poll()] = deck[i];
			queue.addLast(queue.poll());
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] ans = deckRevealedIncreasing(arr);
		for (int val : ans) {
			System.out.print(val + " ");
		}
	}

}