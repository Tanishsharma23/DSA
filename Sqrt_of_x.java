package leetcode;

public class Sqrt_of_x {
	public int mySqrt(int x) {

		int start = 1;
		int end = x;
		int ans = 0;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (mid <= x / mid) {
				ans = mid;

				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return ans;

	}
}
