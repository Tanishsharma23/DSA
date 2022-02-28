package leetcode;
import java.util.*;
public class summary_ranges {
	public List<String> summaryRanges(int[] nums) {

		// t.c. = o(n) :: s.c. = o(n)
		ArrayList<String> al = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];

			while (i + 1 < nums.length && (nums[i + 1] - nums[i] == 1)) {
				i++;
			}

			int b = nums[i];

			if (a != b) { // when i updates
				al.add(a + "->" + b);

			} else {
				al.add(a + "");
			}

		}
		return al;

	}
}
