package leetcode;
import java.util.*;
public class Compare_strs_after_1_swap {
	public boolean areAlmostEqual(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		ArrayList<Integer> al = new ArrayList<>();
		boolean same = true;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != s2.charAt(i)) {
				al.add(i);
				same = false;
			}

			if (al.size() > 2) {
				return false;
			}

		}

		if (same) {
			return true;
		}

		if (al.size() == 2) {
			if (s1.charAt(al.get(0)) == s2.charAt(al.get(1)) && s2.charAt(al.get(0)) == s1.charAt(al.get(1))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
