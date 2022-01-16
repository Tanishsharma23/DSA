package leetcode;
import java.util.*;
public class Top_k_frequent_element_in_array {
	public int[] topKFrequent(int[] nums, int k) {

		int[] sol = new int[k];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++)

		{

			if (map.containsKey(nums[i]))

				map.put(nums[i], map.get(nums[i]) + 1);

			else

				map.put(nums[i], 1);

		}

		int i = 0;

		while (k > 0) {

			int maxKey = 0;

			int max = 0;

			for (Integer key : map.keySet())

			{

				if (map.get(key) > max) {

					max = map.get(key);

					maxKey = key;

				}

			}

			map.remove(maxKey);

			sol[i] = maxKey;

			i++;

			k--;

		}

		return sol;

	}
}
