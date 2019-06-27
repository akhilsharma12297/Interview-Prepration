package Arrays_String;

import java.util.*;

public class student_Attendance_record {

	public static boolean checkRecord(String s) {
		int lctr = 0;
		int actr = 0;
		boolean L3 = false;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == 'A')
				actr++;
			if (s.charAt(i) != 'L')
				lctr = 0;
			else if (s.charAt(i) == 'L') {
				lctr++;
				if (lctr == 3)
					L3 = true;
			}
		}

		if (L3 || actr > 1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		if (checkRecord(S)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}