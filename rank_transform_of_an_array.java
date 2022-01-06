package leetcode;
import java.util.*;
public class rank_transform_of_an_array {
	public int[] arrayRankTransform(int[] arr) {

		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}

		Arrays.sort(arr);

		HashMap<Integer, Integer> map = new HashMap<>();
		int rank = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {

				map.put(arr[i], rank);

				rank++;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = map.get(arr1[i]);
		}

		return arr1;

	}
}
