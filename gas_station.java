package leetcode;

public class gas_station {
	public int canCompleteCircuit(int[] gas, int[] cost) {

		int gas_total = 0;
		for (int i = 0; i < gas.length; i++) {

			gas_total += gas[i];

		}

		int cost_total = 0;
		for (int i = 0; i < cost.length; i++) {

			cost_total += cost[i];

		}

		if (cost_total > gas_total) {
			return -1;
		}

		// int gas_total = 0;
		int curr = 0;
		int start = 0;
		for (int i = 0; i < cost.length; i++) {

			curr += (gas[i] - cost[i]);

			if (curr < 0) {
				start = i + 1;
				curr = 0;
			}

		}
		return start;

	}
}
