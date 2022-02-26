package leetcode;
import java.util.*;
public class next_greater_element_ii_using_stack {
	public int[] nextGreaterElements(int[] nums) {

		int[] ans = new int[nums.length];

		Stack<Integer> s = new Stack<>();

		for (int i = nums.length - 1; i >= 0; i--) {

			s.push(nums[i]);
		}

		for (int i = nums.length - 1; i >= 0; i--) {

			while (!s.isEmpty() && s.peek() <= nums[i]) {
				s.pop();
			}

			if (s.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = s.peek();
			}
			s.push(nums[i]);

		}
		return ans;
	}
}
