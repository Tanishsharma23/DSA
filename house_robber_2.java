package leetcode;

public class house_robber_2 {
	public int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		int[] dp = new int[nums.length];
		int[] ndp = new int[nums.length];

		for (int i = 0; i < nums.length - 1; i++) {
			dp[i] = -1;
		}
		for (int i = 0; i < nums.length - 1; i++) {
			ndp[i] = -1;
		}

		int[] nolast = new int[nums.length - 1];

		for (int i = 0; i < nums.length - 1; i++) {
			nolast[i] = nums[i];
		}

		int[] withlast = new int[nums.length - 1];

		for (int i = 0; i < nums.length - 1; i++) {
			withlast[i] = nums[i + 1];
		}
		for (int val : withlast) {
			System.out.print(val);
		}
		System.out.println();
		for (int val : nolast) {
			System.out.print(val);
		}
		int no_last = rob(nolast, 0, ndp);
		int last = rob(withlast, 0, dp);
		return Math.max(no_last, last);

	}

	public int rob(int[] nums, int i, int[] dp) {

		if (i == nums.length - 1) {
			return nums[i];
		}

		if (i >= nums.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int pick = rob(nums, i + 2, dp) + nums[i];
		int no_pick = rob(nums, i + 1, dp) + 0;

		return dp[i] = Math.max(pick, no_pick);
	}

}
