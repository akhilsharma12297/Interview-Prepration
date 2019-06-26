package HashMap_Heap;

import java.util.Arrays;
import java.util.Scanner;

public class Meeting_rooms {

	public static int minMeetingRooms(int[][] arr) {
		int[] start = new int[arr.length];
		int[] end = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			start[i] = arr[i][0];
			end[i] = arr[i][1];
		}

		Arrays.sort(start);
		Arrays.sort(end);

		int sp = 0;
		int ep = 0;

		int maxRoom = -1;
		int currRoom = 0;

		while (sp < arr.length) {

			if (start[sp] >= end[ep]) {
				currRoom -= 1;
				ep += 1;
			} else {
				currRoom += 1;
				sp += 1;
			}

			maxRoom = Math.max(maxRoom, currRoom);

		}
		return maxRoom;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for number of meetings.
		int N = sc.nextInt();

		int[][] intervals = new int[N][2];

		int start, end;
		// Input for intervals.
		for (int i = 0; i < intervals.length; i++) {

			start = sc.nextInt();
			end = sc.nextInt();

			intervals[i][0] = start;
			intervals[i][1] = end;
		}

		int result = minMeetingRooms(intervals);

		System.out.println(result);

	}

	// Function to display a 2D array.
	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

	}

}
