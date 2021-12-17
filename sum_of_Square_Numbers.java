package leetcode;

public class sum_of_Square_Numbers {
	public boolean judgeSquareSum(int c) {

		if (c == 1) {
			return true;
		}

		long start = 0;
		long end = (long) Math.sqrt(c);

		while (start <= end) {
			long ans = start * start + end * end;
			if (ans == c) {
				return true;
			}
			if (ans > c) {
				end--;
			} else {
				start++;
			}

		}
		return false;

	}
}
