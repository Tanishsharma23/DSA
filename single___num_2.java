package leetcode;

import java.util.HashMap;

public class single___num_2 {
	public int singleNumber(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {

				map.put(nums[i], 1);

			}
		}
		int ans = 0;
		for (int key : map.keySet()) {
			if (map.get(key) != 3) {
				ans = key;
			}
		}
		return ans;

	}
}
