package leetcode;

public class validPalindrome {

	public static void main(String[] args) {
		String s = "abcde"; 
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {

		if (s == " ") {
			return true;
		}

		int right = s.length() - 1;
		int left = 0;

		while (left < right) {
			char char_left = s.charAt(left);
			char char_right = s.charAt(right);

			if (!Character.isLetterOrDigit(char_left)) {
				left++;
			}

			else if (!Character.isLetterOrDigit(char_right)) {
				right--;
			}

			else {
				if (Character.toLowerCase(char_left) != Character.toLowerCase(char_right)) {
					return false;
				}

				left++;
				right--;

			}

		}

		return true;

	}
}
