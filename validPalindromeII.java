package leetcode;

public class validPalindromeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcds";
		System.out.println(validPalindrome(s));

	}

	public static boolean validPalindrome(String s) {

		if (s.length() == 2) {
			return true;
		}

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			char char_left = s.charAt(left);
			char char_right = s.charAt(right);

			if (char_left == char_right) {
				left++;
				right--;
			} else if (char_left != char_right) {

				return checkPalindrome(left + 1, right, s) || checkPalindrome(left, right - 1, s);

			}

		}

		return true;

	}

	public boolean checkPalindrome(int left, int right, String s) {

		int cleft = left;
		int cright = right;
		while (cleft < cright) {
			if (s.charAt(cleft) == s.charAt(cright)) {
				cleft++;
				cright--;
			} else {
				return s.charAt(cleft) == s.charAt(cright);
			}
		}
		return true;

	}

}
