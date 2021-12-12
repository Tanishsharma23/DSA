package leetcode;

public class array_product_self_expect {

	public int[] productExceptSelf(int[] nums) {
		// T.C. = N

		int[] left = new int[nums.length];
		int[] right = new int[nums.length];

		// left
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		// right
		right[right.length - 1] = 1;
		for (int i = right.length - 2; i >= 0; i--) {

			right[i] = right[i + 1] * nums[i + 1];
		}
		// final ans
		for (int i = 0; i < nums.length; i++) {
			nums[i] = left[i] * right[i];
		}
		return nums;
	}

}
