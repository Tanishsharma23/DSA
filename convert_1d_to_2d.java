package leetcode;

public class convert_1d_to_2d {
	public int[][] construct2DArray(int[] original, int m, int n) {

		int[][] ans = new int[m][n];

		if (original.length != m * n) {
			return new int[0][0];
		}

		int si = 0;
		int ei = n - 1;

		for (int i = 0; i < m * n; i++) {

			ans[i / n][i % n] = original[si];

			si++;

		}

		return ans;

	}
}
