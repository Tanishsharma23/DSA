package leetcode;

public class first_bad_version {
	public int firstBadVersion(int n) {

		int start = 1;
		int end = n;

		if ((n == 0 || n < 0) && !isBadVersion(n)) {
			return -1;
		}

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;

	}
}
