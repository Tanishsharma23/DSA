package recursion;

import java.util.ArrayList;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbingStairs(0 , 5));

	}
	
	public static ArrayList<String> climbingStairs(int curr, int n) {

		// +ve bc
		if (curr == n) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (curr > n) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<String>();

		for (int jumps = 1; jumps <= 3; jumps++) {

			ArrayList<String> rr = climbingStairs(curr + jumps, n);

			for (String val : rr) {
				mr.add(jumps + val);
			}

		}

		return mr;
	}

}
