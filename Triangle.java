package leetcode;

import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {

		int[][] dp = new int[triangle.size()][triangle.size()];

		for (int i = 0; i < triangle.size(); i++) {
			for (int j = 0; j < triangle.size(); j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}

		return min(triangle, 0, 0, triangle.size() - 1, triangle.size() - 1, dp);

	}

	public int min(List<List<Integer>> triangle, int cr, int cc, int er, int ec, int[][] dp) {

		if (cr >= triangle.size()) {
			return 0;
		}

		if (dp[cr][cc] != Integer.MIN_VALUE) {
			return dp[cr][cc];
		}

		int c1 = min(triangle, cr + 1, cc, er, ec, dp);
		int c2 = min(triangle, cr + 1, cc + 1, er, ec, dp);

		return dp[cr][cc] = Math.min(c1, c2) + triangle.get(cr).get(cc);

	}
}
