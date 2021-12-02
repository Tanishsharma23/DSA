package leetcode;

public class min_cost_climbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]cost = {1,4,0,7};
		int[] dp = new int[cost.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}

		int s0 = sol(cost, 0, cost.length, dp);
		int s1 = sol(cost, 1, cost.length, dp);
		System.out.println( Math.min(s0, s1));

	}

	private static int sol(int[] cost, int curr, int n, int[] dp) {
		// TODO Auto-generated method stub

		if (curr >= n) {
			return 0;
		}
		if (dp[curr] != -1) {
			return dp[curr];
		}
		int c1 = sol(cost, curr + 1, n, dp);
		int c2 = sol(cost, curr + 2, n, dp);

		return dp[curr] = Math.min(c1, c2) + cost[curr];
	}

}
