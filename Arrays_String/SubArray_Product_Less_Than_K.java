package Arrays_String;

public class SubArray_Product_Less_Than_K {

	public static void main(String[] args) {

		int[] arr = { 11, 12, 4, 10, 8, 3, 2, 9 };

		int k = 80;
		numSubarrayProductLessThanK(arr, k);
	}

	public static void func(int[] arr, int k) {

		int sum = 1;

		int s = 1;
		int e = 0;

		int ctr = 0;

		while (e < arr.length && s < arr.length) {

			if (sum < k) {
				sum *= arr[s];

				ctr++;
			}
			s++;

			while (e < arr.length && sum >= k) {
				sum /= arr[e];
				e++;
				if (sum < k) {
					ctr++;
				}
			}

		}

		System.out.println(ctr);

	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		int p = 1;
		
		int count = 0;
		
		int j = 0;
		
		for (int i = 0; i < nums.length; i++) {
		
			p *= nums[i];
			
			if (nums[i] >= k) {
			
				j = i + 1;
				
				p = 1;
			}
			
			while (p >= k && j <= i) {
				p /= nums[j];
				j++;
			}
			count += i - j + 1;
		}
		return count;
	}
}
