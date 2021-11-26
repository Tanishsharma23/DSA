package String;

public class longestCommanSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcd";
		String text2 = "clsdgcjk";
		System.out.println(longestCommonSubsequence(text1, text2));

	}

	public static int longestCommonSubsequence(String text1, String text2) {

		int vidx1 = 0;
		int vidx2 = 0;
		int[][] strg = new int[text1.length()][text2.length()];

		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				strg[i][j] = -1;
			}
		}

		return lcs(text1, text2, vidx1, vidx2, strg);

	}

	public static int lcs(String text1, String text2, int vidx1, int vidx2, int[][] strg) {

		if (text1.length() == vidx1 || text2.length() == vidx2) {
			return 0;
		}

		if (strg[vidx1][vidx2] != -1) {
			return strg[vidx1][vidx2];
		}

		char ch1 = text1.charAt(vidx1);
		char ch2 = text2.charAt(vidx2);

		int ans = 0;

		if (ch1 == ch2) {
			ans = lcs(text1, text2, vidx1 + 1, vidx2 + 1, strg) + 1;
		} else {
			int o1 = lcs(text1, text2, vidx1, vidx2 + 1, strg);
			int o2 = lcs(text1, text2, vidx1 + 1, vidx2, strg);

			ans = Math.max(o1, o2);
		}

		strg[vidx1][vidx2] = ans; // store values

		return ans;

	}
}
