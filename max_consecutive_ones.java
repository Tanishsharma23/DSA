package leetcode;

public class max_consecutive_ones {

	public int findMaxConsecutiveOnes(int[] nums) {
		int curr_max = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {
				curr_max++;
			} else {
				curr_max = 0;
			}
			max = Math.max(max, curr_max);

		}
		return max;

	}

}
