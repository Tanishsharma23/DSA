package leetcode;

public class InsertNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        int i=0;
	        while(i<nums.length&& nums[i]<=target){
	            if(nums[i]==target)
	                return i;
	            i++;   
	        }
	        return i;
	    }
//	}

}
