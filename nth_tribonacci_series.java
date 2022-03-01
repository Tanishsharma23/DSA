package leetcode;
import java.util.*;
public class nth_tribonacci_series {
	public int tribonacci(int n) {
		int[] dp = new int[n + 1];

		Arrays.fill(dp, -1);

		return fibo(n, dp);
	}

	public int fibo(int start, int[] dp) {

		if (start == 1 || start == 0) {
			return start;
		}

		if (start == 2) {
			return 1;
		}

		if (dp[start] != -1) {

			return dp[start];
		}

		int choice1 = fibo(start - 2, dp);

		int choice2 = fibo(start - 1, dp);

		int choice3 = fibo(start - 3, dp);

		return dp[start] = choice1 + choice2 + choice3;

	}
}
