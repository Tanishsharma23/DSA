package leetcode;

public class rotate_array {
	public void rotate(int[] nums, int k) {

		// rotate_sol(nums , k ); T.C. = N*N

		k = k % nums.length;

		reverse(nums, nums.length - k, nums.length - 1); // T.C. =N
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, 0, nums.length - 1);

	}

	public void reverse(int[]arr , int si , int ei){
	        
	       while(si < ei){
	           int temp = arr[si];
	           arr[si] = arr[ei];
	           arr[ei] = temp;
	           si++;
	           ei--;
	       } 
}
}
