package Arrays_String;

import java.util.Arrays;

public class Product_of_Array_withoutSelf {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 1, 2 };

		productExceptSelfBEST(arr);

	}

	public static int[] productExceptSelfEASY(int[] nums) {
		int[] product = new int[nums.length];
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];

		left[0] = nums[0];

		right[nums.length - 1] = nums[nums.length - 1];

		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i];
		}

		for (int j = nums.length - 2; j >= 0; j--) {
			right[j] = right[j + 1] * nums[j];
		}

		for (int i = 0; i < nums.length; i++) {
			if (i - 1 < 0) {
				product[i] = right[i + 1];
			} else if (i + 1 >= nums.length) {
				product[i] = left[i - 1];
			} else {
				product[i] = left[i - 1] * right[i + 1];

			}

		}
		return product;

	}

	public static int[] productExceptSelfBEST(int[] nums) {
		int[] output = new int[nums.length];
		Arrays.fill(output, 1);
		int left = 1;
		int right = 1;
		for (int i = 0; i < nums.length; i++) {
			output[i] *= left;
			left *= nums[i];
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			output[i] *= right;
			right *= nums[i];
		}

		return output;
	}

}
