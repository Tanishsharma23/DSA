package leetcode;

import java.util.HashMap;

public class find_unique_char_in_str {
	public int firstUniqChar(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {

			if (map.get(s.charAt(i)) == 1) {
				return i;
			}

		}

		return -1;

	}
}
