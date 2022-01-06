package leetcode;

public class first_and_last_position_of_element_in_sorted_array {
	public int[] searchRange(int[] nums, int target) {

		int[] ans = new int[2];

		if (nums.length == 0) {
			ans[0] = -1;
			ans[1] = -1;
			return ans;
		}

		int i = 0;
		int j = nums.length - 1;
		while (i <= j) {

			int mid = (i + j) / 2;
			if (nums[mid] == target) {

				if (nums[i] == target && nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
				if (nums[j] > target) {
					j--;
				}
				if (nums[i] < target) {
					i++;
				}
			} else if (nums[mid] < target) {

				i = mid + 1;

			} else {
				j = mid - 1;
			}
		}
		ans[0] = -1;
		ans[1] = -1;
		return ans;

	}
}
