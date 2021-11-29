package leetcode;

public class search_and_insert {
	public int searchInsert(int[] nums, int target) {
		int i = 0;
		while (i < nums.length && nums[i] <= target) {
			if (nums[i] == target)
				return i;
			i++;
		}
		return i;
	}
}
