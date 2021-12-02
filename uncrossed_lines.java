package leetcode;

public class uncrossed_lines {

	public static void main(String[] args) {
		int[]nums1 = {1,5,7};
		int[]nums2 = {5,3,7};
		int[][] dp = new int[nums1.length][nums2.length];

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}

		System.out.println(max(nums1, nums2, 0, 0, dp));

	}

	public static int max(int[] nums1, int[] nums2, int curr1, int curr2, int[][] dp) {
		if (curr1 == nums1.length || curr2 == nums2.length) {
			return 0;
		}

		if (dp[curr1][curr2] != -1) {
			return dp[curr1][curr2];
		}

		if (nums1[curr1] == nums2[curr2]) {
			dp[curr1][curr2] = max(nums1, nums2, curr1 + 1, curr2 + 1, dp) + 1;
			return dp[curr1][curr2];
		} else {
			int c1 = max(nums1, nums2, curr1, curr2 + 1, dp);
			int c2 = max(nums1, nums2, curr1 + 1, curr2, dp);
			dp[curr1][curr2] = Math.max(c1, c2);
			return dp[curr1][curr2];

		}

	}

}
