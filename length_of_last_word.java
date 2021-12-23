package leetcode;

public class length_of_last_word {
	public int lengthOfLastWord(String s) {

		int count = 0;

		s = s.trim();

		if (s.length() == 1) {
			return 1;
		}
		if (s.length() == 0) {
			return 0;
		}
		int i = s.length() - 1;

		while (i >= 0 && s.charAt(i) != ' ') {

			count++;
			i--;
		}
		System.out.print(s);
		return count;
	}
}
