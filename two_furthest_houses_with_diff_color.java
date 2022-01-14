package leetcode;

public class two_furthest_houses_with_diff_color {
	public int maxDistance(int[] colors) {
		int max = 0;
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				if (colors[i] != colors[j]) {
					int temp = Math.abs(i - j);
					max = Math.max(max, temp);
				}
			}
		}
		return max;
	}

}
