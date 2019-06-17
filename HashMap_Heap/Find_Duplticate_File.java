package HashMap_Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Find_Duplticate_File {

	public static ArrayList<ArrayList<String>> findDuplicate(String[] paths) {

		// write your code here
		TreeMap<String, ArrayList<String>> map = new TreeMap<>();

		for (String path : paths) {

			String[] values = path.split(" ");

			for (int i = 1; i < values.length; i++) {

				String[] name_cont = values[i].split(Pattern.quote("("));
				name_cont[1] = name_cont[1].replace(")", ""); // content

				ArrayList<String> list = map.getOrDefault(name_cont[1], new ArrayList<String>());

				list.add(values[0] + "/" + name_cont[0]); // paths
				map.put(name_cont[1], list);

			}
		}

		ArrayList<ArrayList<String>> res = new ArrayList<>();
		for (String key : map.keySet()) {
			if (map.get(key).size() > 1)
				res.add(map.get(key));
		}
		return res;
	}

	// -----------------------------------------------------

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] paths = new String[n];

		for (int i = 0; i < n; i++) {
			paths[i] = br.readLine();
		}
		ArrayList<ArrayList<String>> ans = findDuplicate(paths);
		for (ArrayList<String> val : ans) {
			Collections.sort(val);
		}

		for (ArrayList<String> val : ans) {
			System.out.println(val);
		}
	}
}