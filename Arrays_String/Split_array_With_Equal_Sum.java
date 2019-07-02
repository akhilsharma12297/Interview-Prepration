package Arrays_String;

import java.util.HashSet;

public class Split_array_With_Equal_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean splitArray(int[] nums) {

		int n = nums.length;

		int leftsum[] = new int[nums.length];
		leftsum[0] = nums[0];
		for (int i = 1; i < n; i++) {
			leftsum[i] = leftsum[i - 1] + nums[i];
		}

		int rightsum[] = new int[nums.length];
		rightsum[n - 1] = nums[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightsum[i] = rightsum[i + 1] + nums[i];
		}

		for (int j = 3; j < n - 3; j++) {
			HashSet<Integer> sum = new HashSet<Integer>();
			for (int i = 1; i < j - 1; i++) {
				if (leftsum[i - 1] == (rightsum[i + 1] - rightsum[j])) {
					sum.add(leftsum[i - 1]);
				}
			}
			for (int k = j + 2; k < n - 1; k++) {
				if (((leftsum[k - 1] - leftsum[j]) == rightsum[k + 1]) && sum.contains(rightsum[k + 1])) {
					return true;
				}
			}
		}
		return false;
	}

}
