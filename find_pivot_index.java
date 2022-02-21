package leetcode;

public class find_pivot_index {
	public int pivotIndex(int[] nums) {

		int[] left = new int[nums.length];
		left[0] = 0;

		for (int i = 1; i < nums.length; i++) {
			left[i] = nums[i - 1] + left[i - 1];
		}
		int[] right = new int[nums.length];

		right[nums.length - 1] = 0;

		for (int i = nums.length - 2; i >= 0; i--) {

			right[i] = nums[i + 1] + right[i + 1];

		}

		for (int i = 0; i < nums.length; i++) {
			if (right[i] == left[i]) {
				return i;
			}
		}
		return -1;
	}
}
