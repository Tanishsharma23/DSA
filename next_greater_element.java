package leetcode;

import java.util.HashMap;

public class next_greater_element {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums2.length; i++) {
			map.put(nums2[i], i);
		}

		int[] ans = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			ans[i] = getMax(nums2, map.get(nums1[i]));
		}
		return ans;

	}

	public int getMax(int[] num, int index) {

		int currMax = num[index];
		for (int i = index; i < num.length; i++) {
			if (currMax < num[i]) {
				return num[i];
			}
		}
		return -1;
	}
}
