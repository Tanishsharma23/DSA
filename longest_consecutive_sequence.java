package leetcode;
import java.util.*;
public class longest_consecutive_sequence {
	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;

		}
		if (nums.length == 1) {
			return 1;
		}
		Set<Integer> set = new HashSet<Integer>();

		for (int val : nums) {
			set.add(val);
		}
		int streak = 0;
		for (int val : nums) {
			if (!set.contains(val - 1)) {
				int curr_streak = 1;
				int numbr = val;

				while (set.contains(numbr + 1)) {
					curr_streak++;
					numbr += 1;
				}
				streak = Math.max(curr_streak, streak);
			}

		}
		return streak;
	}
}
