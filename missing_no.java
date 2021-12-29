package leetcode;
import java.util.*;
public class missing_no {
	public int missingNumber(int[] nums) {

		Arrays.sort(nums);
		int ans = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i) {
				ans = i;
				return ans;
			}
		}
		return nums.length;

	}
}
