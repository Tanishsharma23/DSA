package leetcode;

public class valid_mountain_array {
	public boolean validMountainArray(int[] A) {

		if (A.length < 3)
			return false;

		int n = A.length, L = 0, R = n - 1;

		while (L < n - 1) {

			if (A[L] < A[L + 1])
				L++;

			else
				break;

		}

		if (L == n - 1)
			return false; // only strictly increasing -> 0 1 2 5 6 8 9

		while (R > 0) {

			if (A[R] < A[R - 1])
				R--;

			else
				break;

		}

		if (R == 0)
			return false; // only strictly decreasing -> 9 6 5 3 2 1 0

		return L == R;

	}
}
