package Arrays_String;

import java.util.Scanner;

public class Nstair_jump_game {

	public static int jump(int[] arr) {
		int ans = 0;
		int i = 0;
		int max = -1;
		int num = arr[0];
		while (i > arr.length) {
			for (int j = i; j <= num; j++) {
				max = Math.max(arr[i] + i, max);
			}
		}
		return ans;
	}

	public static int jump2(int[] nums) {
		 int ladder = 0;
 	 	 int stair = 1;
 	 	 int jump = 0;
 	 	 // at every stair chech if another big laddder is there or not
 
 	 	 for (int level = 0; level < nums.length; level++) {
 	 	 	 if (level == nums.length - 1) {
 	 	 	 	 return jump;
 	 	 	 }
 
 	 	 	 // another big ladder found store it..
 	 	 	 if (nums[level] + level >= ladder)
 	 	 	 	 ladder = nums[level] + level;
 
 	 	 	 stair--;
 
 	 	 	 if (stair == 0) {
 	 	 	 	 jump++;
 //current ladder have no more stairs left so use the stored bigger ladder..
 	 	 	 	 stair = ladder - level;
 	 	 	 	 // still no stairs it means we cannot reach the end..
 	 	 	 	 if (stair == 0)
 	 	 	 	 	 return -1;
 	 	 	 }
 	 	 }
 	 	 return jump;
	}

	// Don't male any changes here
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		System.out.println(jump(num));
	}

}