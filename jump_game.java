package leetcode;

public class jump_game {
	public boolean canJump(int[] nums) {
		int[] dp = new int[nums.length];
		return canJump(nums, 0, dp);
	}

	public boolean canJump(int[] nums, int start, int[] dp) {
		if (start == nums.length - 1) {
			return true;
		}
		if (start > nums.length - 1) {
			return false;
		}

		if (nums[start] == 0) {

			return false;
		}
		if (dp[start] != 0) {
			return dp[start] == 1 ? true : false;
		}

		boolean ans = false;

		for (int i = 1; i <= nums[start]; i++) {

			ans = canJump(nums, start + i, dp);

			if (ans == true) {
				dp[start] = 1;
				return ans;
			} else {
				dp[start] = -1;
			}

		}

		return ans;

	}

}
