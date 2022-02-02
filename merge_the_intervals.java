package leetcode;
import java.util.*;
public class merge_the_intervals {
	public int[][] merge(int[][] intervals) {

		if (intervals.length == 0 || intervals == null) {
			return new int[0][];
		}

		List<int[]> al = new ArrayList<>();
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int[] i : intervals) {
			if (i[0] <= end) {
				end = Math.max(end, i[1]);
			} else {
				al.add(new int[] { start, end });
				start = i[0];
				end = i[1];
			}
		}

		al.add(new int[] { start, end });
		return al.toArray(new int[0][]);

	}
}
