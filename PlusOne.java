package leetcode;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] digits = {1,2,3,9};
		int ans[] =(plusOne(digits));
		for(int val : ans) {
			System.out.print(val);
		}
	}

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				return digits;
			} else {
				digits[i] = 0;
			}

		}

		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;

	}

}
