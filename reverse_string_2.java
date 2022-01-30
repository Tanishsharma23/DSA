package leetcode;

public class reverse_string_2 {
	public String reverseStr(String s, int k) {

		if (k == s.length()) {
			String ans = "";
			for (int i = 0; i < s.length(); i++) {
				ans = s.charAt(i) + ans;
			}
			return ans;
		}

		char[] arr = s.toCharArray();

		int start = 0;
		int end = Math.min(start + k - 1, s.length() - 1);

		while (start < s.length()) {

			reverse(start, end, arr);

			start = start + 2 * k;
			end = Math.min(start + k - 1, s.length() - 1);
		}

		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}

		return ans;

	}

	public static void reverse(int si, int ei, char[] arr) {

		while (si < ei) {
			char temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
	}
}
