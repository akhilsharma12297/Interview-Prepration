package Arrays_String;

import java.util.*;

public class magic_square_grid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] Input = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				Input[i][j] = scn.nextInt();
			}
		}
		System.out.print(numMagicSquaresInside(Input));
	}

	// -----------------------------------------------------
	// This is a functional problem. Do not make changes to main
	// This function takes as input an array and integer k.
	// It should print required output.
	public static int numMagicSquaresInside(int[][] grid) {
		int ctr = 0;

		int loop_limit_r = (grid.length - 3) + 1;
		int loop_limit_c = (grid[0].length - 3) + 1;

		for (int r = 0; r < loop_limit_r; r++) {
			for (int c = 0; c < loop_limit_c; c++) {

				if (grid[r + 1][c + 1] == 5) {
					if (grid[r][c] + grid[r + 1][c] + grid[r + 2][c] != 15) {
						break;
					}
					if (grid[r][c] + grid[r][c + 1] + grid[r][c + 2] != 15) {
						break;
					}
					if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != 15) {
						break;
					}

					ctr++;
				}

			}
		}

		return ctr;
	}
}
