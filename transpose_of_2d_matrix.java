package leetcode;

public class transpose_of_2d_matrix {
	public int[][] transpose(int[][] matrix) {

		int[][] arr = new int[matrix[0].length][matrix.length];
		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = 0; row < matrix.length; row++) {
				arr[col][row] = matrix[row][col];
			}
		}

		return arr;

	}

}
