package leetcode;

public class richest_customer_wealth {
	public int maximumWealth(int[][] accounts) {

		int max = 0;

		for (int row = 0; row < accounts.length; row++) {
			int sum = 0;
			for (int col = 0; col < accounts[row].length; col++) {
				sum += accounts[row][col];
			}
			max = Math.max(sum, max);
		}

		return max;

	}
}
