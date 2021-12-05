package leetcode;

public class min_falling_path_sumll {

	public int minFallingPathSum(int[][] grid) {

		int[][] dp = new int[grid.length][grid[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i <= grid[0].length - 1; i++) {

			ans = Math.min(ans, min(grid, i, 0, grid.length - 1, grid.length - 1, dp));

		}
		return ans;
	}

	public int min(int[][] grid, int cc, int cr, int ec, int er, int[][] dp) {

		if (cr > er) {
			return Integer.MAX_VALUE;
		}

		if (cr == er) {
			return grid[cr][cc];
		}

		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < grid.length; i++) {
			if (cc != i) {
				ans = Math.min(ans, min(grid, i, cr + 1, ec, er, dp));

			}
		}
		return dp[cr][cc] = ans + grid[cr][cc];

	}

}
