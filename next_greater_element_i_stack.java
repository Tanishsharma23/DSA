package leetcode;
import java.util.*;
public class next_greater_element_i_stack {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//      T.C. = O(N) :: S.C. = O(N) 
		int[] ans = new int[nums1.length];

		Stack<Integer> s = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		s.push(nums2[0]);

		for (int i = 1; i < nums2.length; i++) {

			while (s.size() != 0 && nums2[i] > s.peek()) {

				map.put(s.peek(), nums2[i]);

				s.pop();
			}

			s.push(nums2[i]);
		}

		int i = 0;
		for (int num : nums1) {
			ans[i++] = map.getOrDefault(num, -1);
		}
		return ans;

	}
}
