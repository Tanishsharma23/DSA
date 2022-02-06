package leetcode;
import java.util.*;
public class Longest_substring_with_unique_characters {
	public int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		int length = 0;
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			if (map.containsKey(s.charAt(right))) {

				left = Math.max(left, map.get(s.charAt(right)) + 1);
			}

			map.put(s.charAt(right), right);
			length = Math.max(length, right - left + 1);

		}
		return length;
	}
}
