package leetcode;

public class lc_Palendromic_SS {
	public int longestPalindromeSubseq(String s) {

		return LongestPalindromicSSTD(s, 0, s.length() - 1, new int[s.length()][s.length()]);

	}

	public static int LongestPalindromicSSTD(String str, int si, int ei, int[][] strg) {

		if (si > ei) {
			return 0;
		}

		if (si == ei) {
			return 1;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int ans = 0;

		if (str.charAt(si) == str.charAt(ei)) {
			ans = LongestPalindromicSSTD(str, si + 1, ei - 1, strg) + 2;
		} else {

			int o1 = LongestPalindromicSSTD(str, si + 1, ei, strg);
			int o2 = LongestPalindromicSSTD(str, si, ei - 1, strg);

			ans = Math.max(o1, o2);
		}

		strg[si][ei] = ans;

		return ans;

	}
}
