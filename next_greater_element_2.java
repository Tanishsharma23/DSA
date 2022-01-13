package leetcode;

public class next_greater_element_2 {
	public int[] nextGreaterElements(int[] nums) {

		int[] ans = new int[nums.length];

		if (nums.length == 1) {
			return new int[] { -1 };
		}

		for (int i = 0; i < nums.length; i++) {

			int j = i + 1;

			if (j == nums.length) {
				j = 0;
			}

			int val = -1;

			while (j != i) {

				if (nums[j] > nums[i]) {
					val = nums[j];
					break;
				}

				j++;
				if (j == nums.length) {
					j = 0;
				}
			}
			ans[i] = val;

		}

		return ans;
	}
}
