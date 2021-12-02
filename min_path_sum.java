package leetcode;

public class min_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = new int[3][3];

		int[][] dp = new int[grid.length][grid[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}

		System.out.println(min(grid, 0, 0, grid.length - 1, grid[0].length - 1, dp));
	}

	public static int min(int[][] grid, int cr, int cc, int er, int ec, int[][] dp) {

		if (cr > er || cc > ec) {
			return Integer.MAX_VALUE;
		}

		if (cr == er && cc == ec) {
			return grid[cr][cc];
		}

		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		int c1 = min(grid, cr, cc + 1, er, ec, dp);
		int c2 = min(grid, cr + 1, cc, er, ec, dp);
		dp[cr][cc] = Math.min(c1, c2) + grid[cr][cc];
		return dp[cr][cc];

	}
}
