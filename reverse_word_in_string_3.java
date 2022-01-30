package leetcode;

public class reverse_word_in_string_3 {
	public String reverseWords(String s) {

		int start = 0;
		int end = 0;

		char[] arr = s.toCharArray();

		int s_count = 0;

		while (end < arr.length) {

			if (arr[end] == ' ') {
				s_count++;
				reverse(start, end - 1, arr);
				start = end + 1;
			}

			end += 1;

		}
		if (s_count == 0) {
			reverse(0, arr.length - 1, arr);
			String ans = "";
			for (int i = 0; i < arr.length; i++) {
				ans = ans + arr[i];
			}
			return ans;

		}

		reverse(start, arr.length - 1, arr);

		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}
		return ans;

	}

	public static void reverse(int si, int ei, char[] arr) {

		while (si <= ei) {
			char temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;

			si++;
			ei--;

		}
	}
}
