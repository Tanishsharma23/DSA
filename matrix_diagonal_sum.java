package leetcode;

public class matrix_diagonal_sum {

	public int diagonalSum(int[][] mat) {

		int sum = 0;
		for (int row = 0; row < mat.length; row++) {

			sum += mat[row][row];
			sum += mat[row][mat[0].length - 1 - row];

		}
		if (mat.length % 2 != 0) {
			sum = sum - mat[mat.length / 2][mat.length / 2];
		}

		return sum;

	}
}
