package leetcode;
import java.util.*;
public class spiral_Matrix_I {
	public List<Integer> spiralOrder(int[][] matrix) {

		int min_c = 0;
		int min_r = 0;
		int max_c = matrix[0].length - 1;
		int max_r = matrix.length - 1;
		List<Integer> list = new ArrayList<>();
		int count = 0;

		int size = matrix.length * matrix[0].length;

		while (count < size) {

			for (int c = min_c; c <= max_c && count < size; c++) {
				list.add(matrix[min_r][c]);
				count++;

			}
			min_r++;
			for (int r = min_r; r <= max_r && count < size; r++) {
				list.add(matrix[r][max_c]);
				count++;

			}
			max_c--;

			for (int c = max_c; c >= min_c && count < size; c--) {
				list.add(matrix[max_r][c]);
				count++;
			}
			max_r--;
			for (int r = max_r; r >= min_r && count < size; r--) {
				list.add(matrix[r][min_c]);
				count++;

			}
			min_c++;

		}
		return list;

	}

}
