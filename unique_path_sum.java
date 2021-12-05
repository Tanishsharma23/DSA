package leetcode;

public class unique_path_sum {
	public int uniquePaths(int m, int n) {

		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				dp[i][j] = -1;
			}
		}
		int[][] grid = new int[m][n];
		return path(grid, 0, 0, m - 1, n - 1, dp);

	}

	public int path(int[][] grid, int cr, int cc, int er, int ec, int[][] dp) {

		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			return 1;
		}

		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		int down = path(grid, cr + 1, cc, er, ec, dp);
		int right = path(grid, cr, cc + 1, er, ec, dp);

		return dp[cr][cc] = down + right;

	}
}
