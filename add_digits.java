package leetcode;

public class add_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int addDigits(int num) {

		if (num == 0) {
			return 0;
		}
		if (num % 9 == 0) {
			return 9;
		}

		return num % 9;
	}
}
