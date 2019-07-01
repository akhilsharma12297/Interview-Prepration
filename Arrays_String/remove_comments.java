package Arrays_String;

import java.util.*;
import java.util.Scanner;

public class remove_comments {

	public static ArrayList<String> removeComments(String[] source) {
		ArrayList<String> ans = new ArrayList<String>();

		StringBuilder newline = new StringBuilder();

		boolean state = false;
		for (String str : source) {
			int i = 0;
			char[] ch = str.toCharArray();
			int n = str.length();
			if (!state) {
				newline = new StringBuilder();
			}
			while (i < n) {

				if (!state && i + 1 < n && ch[i] == '/' && ch[i + 1] == '*') {
					state = true;
					i++;
				} else if (state && i + 1 < n && ch[i] == '*' && ch[i + 1] == '/') {
					state = false;
					i++;
				} else if (!state && i + 1 < n && ch[i] == '/' && ch[i + 1] == '/') {
					break;
				} else if (!state) {
					newline.append(ch[i]);
				}
				i++;
			}

			if (!state && newline.length() > 0) {
				ans.add(new String(newline));
			}

		}
		return ans;

	}

	// Don't make any changes here.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] source = new String[n];
		for (int i = 0; i < source.length; i++) {
			source[i] = scn.next();
		}

		System.out.println(removeComments(source));

	}

}