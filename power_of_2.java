package leetcode;

public class power_of_2 {

	public boolean isPowerOfTwo(int n) {

		if (n == 1) {
			return true;
		}

		boolean ans = false;
		double a = n;
		return ans1(a, ans);

	}

	public static boolean ans1(double n, boolean ans) {

		if (n == 2.0) {
			return true;
		}
		if (n < 2.0) {
			return false;
		}

		return ans1(n / 2, false);

	}

}
