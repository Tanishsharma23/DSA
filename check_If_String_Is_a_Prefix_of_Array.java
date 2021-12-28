package leetcode;

public class check_If_String_Is_a_Prefix_of_Array {
	public boolean isPrefixString(String s, String[] words) {
		int p = 0;
		for (int i = 0; i < words.length && p < s.length(); i++) {
			String word = words[i];
			for (int j = p, k = 0; j < s.length() && k < word.length(); j++, k++) {
				if (s.charAt(j) != word.charAt(k)) {
					return false;
				}
			}
			p += word.length();
		}
		return p == s.length();
	}
}
