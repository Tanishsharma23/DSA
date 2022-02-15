package leetcode;

public class search_in_rotated_sorted_array {
	public int search(int[] nums, int target) {

		// t.c. = O(N)
		// S.C. = O(1)

		if (nums[nums.length - 1] == target) { // EDGE CASE 1
			return nums.length - 1;
		}
		if (nums[0] == target) { // EDGE CASE 2
			return 0;
		}

		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			if (nums[start] <= nums[mid]) {

				if (nums[start] <= target && target < nums[mid]) {

					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

			else {
				if (nums[mid] < target && target < nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}
		}

		if (nums[start] == target) {
			return start;
		}

		return -1;

	}
}
