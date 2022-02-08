package leetcode;
import java.util.*;
public class Contiguous_Array {

	public int findMaxLength(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {

				nums[i] = -1;

			}
		}

		int sum = 0;
		int length = 0;
		map.put(0, -1); // edge case handle
		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];

			if (!map.containsKey(sum)) {

				map.put(sum, i);
			} else {

				length = Math.max(length, i - map.get(sum));
			}

		}

		return length;

	}

}
