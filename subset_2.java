package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2 {
	public List<List<Integer>> subsetsWithDup(int[] arr) {

		Arrays.sort(arr);
		List<List<Integer>> main = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();
		elementRespect(arr, 0, temp, main, true);
		return main;

	}

	public static void elementRespect(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> main, boolean call) {

		if (vidx == arr.length) {
			main.add(new ArrayList<Integer>(temp));
			return;
		}

		if (call == false && arr[vidx] == arr[vidx - 1]) {
			elementRespect(arr, vidx + 1, temp, main, false); // exclude
		} else {
			elementRespect(arr, vidx + 1, temp, main, false); // exclude

			temp.add(arr[vidx]);
			elementRespect(arr, vidx + 1, temp, main, true); // include
			temp.remove(temp.size() - 1);
		}

	}
}
