package leetcode;

import java.util.*;

public class hackerblocks {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int[] arr = new int[size];

		for (int val : arr) {
			val = scn.nextInt();
		}

		int target = scn.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		
		two_sum(arr , target , map);

	}

	public static void two_sum(int[] arr, int target, HashMap<Integer, Integer> map) {

		int[] res = new int[2];

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				int ans1 = map.get(target - arr[i]);
				int ans2 = i;
//				System.out.println("hello");
				System.out.print(arr[ans2] + "and" + arr[ans1]);
				arr[target - arr[i]] = 0;
				arr[i] = 0;

				two_sum(arr, target, map);

			} else {
				map.put(arr[i], i);
			}

		}

	}

}
