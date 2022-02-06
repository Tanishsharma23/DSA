package leetcode;

public class Remove_Duplicates_from_sorted_array_I {
	public int removeDuplicates(int[] nums) {

		int idx = 0;
		boolean present = false;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == nums[i - 1]) {
				continue;
			} // already two times present

			nums[++idx] = nums[i];

		}
		return idx + 1;
	}
}
