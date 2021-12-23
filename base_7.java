package leetcode;

public class base_7 {
	public String convertToBase7(int num) {

		if (num == 0) {
			return "0";
		} // edge case

		String ans = "";

		int reminder = 0;
		boolean check = false; // to handle -ve no.

		if (num < 0) {
			num = -num;
			check = true;
		}

		while (num > 0) {
			reminder = num % 7;
			num = num / 7;
			ans = reminder + ans;
		}
		if (check == true) { // handeling

			ans = "-" + ans;

		}
		return ans;

	}
}
