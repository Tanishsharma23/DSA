package leetcode;
import java.util.*;
public class permutation_of_string {
	public boolean checkInclusion(String s1, String s2) {
		// T.C. = O(N + M)
		// S.C. = O(N + M)
//	         EASY AND TRICKY AT THE SAME TIME ;))
		HashMap<Character, Integer> map = new HashMap<>();

		int k = s1.length();

		if (s1.length() > s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {

			if (map.containsKey(s1.charAt(i))) {

				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);

			}

			else {
				map.put(s1.charAt(i), 1);
			}

		}

		HashMap<Character, Integer> map2 = new HashMap<>();

		int i = 0;
		int j = 0;

		while (i <= j && j < s2.length()) {

			if (j - i < k) {

				if (map2.containsKey(s2.charAt(j))) {
					map2.put(s2.charAt(j), map2.get(s2.charAt(j)) + 1);
				} else {
					map2.put(s2.charAt(j), 1);
				}
				j++;

			} else {

				if (map_are_equal(map, map2)) {
					return true;
				} else {

					map2.put(s2.charAt(i), map2.get(s2.charAt(i)) - 1);
					if (map2.get(s2.charAt(i)) <= 0) {
						map2.remove(s2.charAt(i));
					}
					i++;
				}
			}
		}
		if (map_are_equal(map, map2)) {
			return true;
		}
		return false;

	}

	public static boolean map_are_equal(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
		if (map1.size() != map2.size()) {
			return false;
		}
		for (char val : map1.keySet()) {
			if (!map2.containsKey(val)) {
				return false;
			}
			if (!map1.get(val).equals(map2.get(val)))
				return false;
		}

		return true;
	}
}
