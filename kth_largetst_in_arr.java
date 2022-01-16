package leetcode;

import java.util.Arrays;

public class kth_largetst_in_arr {
	  public int findKthLargest(int[] nums, int k) {
	        
	        Arrays.sort(nums);
	        return nums[nums.length - k];
	        
	    }
}
