package leetcode;

import java.util.ArrayList;
import java.util.List;

public class subset_1 {
	public List<List<Integer>> subsets(int[] arr) {

		List<List<Integer>> main = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();
		elementRespect(arr, 0, temp, main);
		return main;

	}

	public static void elementRespect(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> main) {

		if (vidx == arr.length) {
			main.add(new ArrayList<Integer>(temp));
			return;
		}

		elementRespect(arr, vidx + 1, temp, main); // exclude

		temp.add(arr[vidx]);
		elementRespect(arr, vidx + 1, temp, main); // include
		temp.remove(temp.size() - 1);

	}

}
