package Arrays_String;

import java.util.HashMap;

public class Max_Point_on_line {

	public static void main(String[] ags) {

	}

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void func(int[][] point) {
		Point[] p = new Point[point.length];

		for (int i = 0; i < point.length; i++) {
			p[i] = new Point(point[i][0], point[i][1]);
		}

		HashMap<Point, Integer> map = new HashMap<>();
		int max = 0;

		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {

				Point xy = p[i];

				Point xy2 = p[j];

				int dy = xy2.y - xy.y;
				int dx = xy2.x - xy.x;

				int gcd = gcd(dx, dy);

				dx = dx / gcd;

				dy = dy / gcd;

				Point temp = new Point(dx, dy);

				if (map.containsKey(temp)) {
					map.put(temp, map.get(temp) + 1);
				} else {
					map.put(temp, 1);
				}

				max = Math.max(max, map.get(temp));

			}
			map.clear();
		}
		System.out.println(max + 1);
	}

	private static int gcd(int dx, int dy) {

		if (dy == 0) {
			return dx;
		} else {
			return gcd(dy, dx % dy);
		}
	}

}
