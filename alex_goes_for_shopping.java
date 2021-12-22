package leetcode;

import java.util.Scanner;

public class alex_goes_for_shopping {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] items = new int[n];

		for (int i = 0; i < items.length; i++) {
			items[i] = scn.nextInt();
		}

		int queries = scn.nextInt();

		for (int i = 1; i <= queries; i++) {

			int cost = scn.nextInt();
			int choice = scn.nextInt();

			System.out.println(check(cost, choice, items));
		}
	}

	public static String check(int cost, int choice, int[] items) {

		int count = 0;

		String ans = "";

		for (int i = 0; i < items.length; i++) {
			if (cost % items[i] == 0) {
				count++;
			}

		}

		if (count >= choice) {

			return ans = "Yes ";
		} else {
			return ans = "No ";
		}

	}

}
