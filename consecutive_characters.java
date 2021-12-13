package leetcode;

public class consecutive_characters {
	public int maxPower(String s) {

		int max = 1;
		int curr_max = 1;

		for (int i = 0; i < s.length() - 1; i++) {

			char temp = s.charAt(i);

			if (temp == s.charAt(i + 1)) {
				curr_max++;

			} else {
				curr_max = 1;
			}

			max = Math.max(max, curr_max);

		}

		return max;
	}
}
