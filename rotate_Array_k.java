package leetcode;

public class rotate_Array_k {
	public void rotate(int[] nums, int k) {

		if (nums.length > 1) {
			k = k % nums.length;
			reverse(nums, nums.length - k, nums.length - 1);
			reverse(nums, 0, nums.length - k - 1);
			reverse(nums, 0, nums.length - 1);
		}
	}

	public static void reverse(int[] arr, int si, int ei) {

		while (si < ei) {
			int temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;

			si++;
			ei--;
		}

	}

}
