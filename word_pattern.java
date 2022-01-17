package leetcode;

import java.util.HashMap;

public class word_pattern {
	public boolean wordPattern(String pattern, String s) {

		char[] ch = pattern.toCharArray();

		String[] ss = s.split(" ");

		HashMap<Character, String> map = new HashMap<>();

		if (ch.length != ss.length) {
			return false;
		}

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				if (!map.get(ch[i]).equals(ss[i])) {
					return false;
				}

			} else if (map.containsValue(ss[i])) {
				return false;
			}

			map.put(ch[i], ss[i]);

		}
		return true;

	}
}
