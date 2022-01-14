package leetcode;

public class max_diff_bw_inc_elements {
	public int maximumDifference(int[] nums) {

		int max = -1;
		int min = nums[0];
		for (int i = 1; i <= nums.length - 1; i++) {
			min = Math.min(min, nums[i]);
			if (nums[i] > min) {
				max = Math.max(max, Math.abs(min - nums[i]));
			}

		}
		return max;
	}
}
