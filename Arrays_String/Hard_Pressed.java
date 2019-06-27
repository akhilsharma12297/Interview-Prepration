package Arrays_String;

import java.util.*;

public class Hard_Pressed {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		String typed = scn.next();
		System.out.println(isLongPressedName(name, typed));

	}

	public static boolean isLongPressedName(String name, String typed) {

		if (name.charAt(0) == typed.charAt(0)) {

			int i = 1;
			int j = 1;

			while (i < name.length() && j < typed.length()) {

				if (j >= typed.length()) {
					return false;
				}
				if (name.charAt(i) == typed.charAt(j)) {
					i++;
					j++;
				} else if (typed.charAt(j - 1) == typed.charAt(j)) {
					j++;
				}

			}
		}

		return true;

	}

}