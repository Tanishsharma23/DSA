package leetcode;

public class Happy_no_ {



	public boolean isHappy(int n) {

		while (true) {
			n = squareAndSum(n);
			if (n == 1 || n == 7)
				return true;
			if (n < 10)
				return false;
		}
	}

	private int squareAndSum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + (rem * rem);
		}
		return sum;
	}
}
