package leetcode;

import java.util.*;

public class cyclic_array_hackerblocks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int sum = 0;
		while (q-- > 0) {
			int x = sc.nextInt();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = 2 * arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum % (int) Math.pow(10, 7);
		System.out.println(sum);
	}
}
