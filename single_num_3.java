package leetcode;

import java.util.HashMap;

public class single_num_3 {
	public int[] singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {

				map.put(nums[i], 1);

			}
		}
		int[] ans = new int[2];
		int i = 0;
		for (int key : map.keySet()) {
			if (map.get(key) != 2) {
				ans[i] = key;
				i = i + 1;
			}
		}
		return ans;

	}
}
