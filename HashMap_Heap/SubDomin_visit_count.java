package HashMap_Heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SubDomin_visit_count {

	public static List<String> subdomainVisits(String[] cpdomains) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < cpdomains.length; i++) {

			String str = cpdomains[i].replace(" ", ".");

			String[] substr = str.split("\\.");

			map.put(str.substring(substr[0].length() + 1), Integer.valueOf(substr[0]));

			for (int j = 1; j < substr.length; j++) {

				if (map.containsKey(substr[j])) {

					map.put(substr[j], map.get(substr[j]) + Integer.valueOf(substr[0]));
				} else {
					map.put(substr[j], Integer.valueOf(substr[0]));
				}

			}

		}

		ArrayList<String> ans = new ArrayList<String>();

		for (String val : map.keySet()) {

			ans.add(map.get(val) + " " + val);

		}

		return ans;
	}

	public static List<String> subdomainVisitsOG(String[] cpdomains) {

		HashMap<String, Integer> domainMap = new HashMap<>();

		for (String eachDomain : cpdomains) {
			String[] completeLine = eachDomain.split("\\s+");
			String[] actualNames = completeLine[1].split("\\.");
			int count = Integer.valueOf(completeLine[0]);
			String cur = "";

			for (int i = actualNames.length - 1; i >= 0; --i) {
				cur = actualNames[i] + (i < actualNames.length - 1 ? "." : "") + cur;

				domainMap.put(cur, domainMap.getOrDefault(cur, 0) + count);
			}

		}

		List<String> ans = new ArrayList<>();
		for (String dom : domainMap.keySet())
			ans.add("" + domainMap.get(dom) + " " + dom);
		return ans;

	}

	public static List<String> subDomnain(String[] cpdomains) {

		HashMap<String, Integer> map = new HashMap<>();

		for (String domains : cpdomains) {

			String[] CompleteLine = domains.split("\\s");
			String[] str = CompleteLine[1].split("\\.");

			String cur = "";

			int n = Integer.valueOf(CompleteLine[0]);

			for (int i = str.length - 1; i >= 0; i++) {

				cur = str[i] + (i < str.length - 1 ? "." : "") + cur;

				map.put(cur, map.getOrDefault(cur, 0) + n);

			}

		}

		ArrayList<String> ans = new ArrayList<String>();

		for (String val : map.keySet()) {

			ans.add(map.get(val) + " " + val);

		}

		return ans;
	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] cpd = new String[n];
		for (int i = 0; i < cpd.length; i++) {
			cpd[i] = s.nextLine();
		}
		List<String> ans = subdomainVisitsOG(cpd);
		Collections.sort(ans);
		System.out.println(ans);
	}

}