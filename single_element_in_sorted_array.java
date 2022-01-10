package leetcode;

public class single_element_in_sorted_array {
	public int singleNonDuplicate(int[] nums) {
		int lo = 0;
		int hi = nums.length;
		int ans = 0;

		if (nums.length == 0)
			return 0;

		else if (nums.length == 1)
			return nums[0];

		else if (nums[0] != nums[1])
			return nums[0];

		else if (nums[nums.length - 1] != nums[nums.length - 2])
			return nums[nums.length - 1];

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
				return nums[mid];
			} else if (mid % 2 == 0) {
				if (nums[mid] == nums[mid + 1]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			} else if (mid % 2 != 0) {
				if (nums[mid] == nums[mid - 1]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}

		}
		return -1;
	}

}
