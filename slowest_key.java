package leetcode;

public class slowest_key {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		int maxtime = releaseTimes[0];
		char slowkey = keysPressed.charAt(0);
		int timediff;
		for (int i = 1; i < releaseTimes.length; i++) {
			timediff = releaseTimes[i] - releaseTimes[i - 1];

			if (timediff > maxtime) {
				maxtime = timediff;
				slowkey = keysPressed.charAt(i);
			} else if (timediff == maxtime) {
				if (slowkey < keysPressed.charAt(i)) {
					slowkey = keysPressed.charAt(i);
				}
			}
		}
		return slowkey;

	}
}
