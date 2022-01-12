package leetcode;

public class reshape_2d_matrix {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int count = mat.length * mat[0].length; // row * col

		int count_scnd = r * c;

		if (count != count_scnd) {
			return mat;
		}

		int[][] matrix = new int[r][c];
		int row = 0;
		int col = 0;
		// for(int i = 0 ; i<mat.length ; i++){
		// for(int j = 0 ; j<mat[0].length ; j++){
		// matrix[row][col] = mat[i][j];
		// col++;
		// if(col == matrix[0].length){
		// row++;
		// col=0;
		// }
		// }
		// }

		for (int i = 0; i < r * c; i++) {

			matrix[i / c][i % c] = mat[i / mat[0].length][i % mat[0].length];

		}
		return matrix;
	}
}
