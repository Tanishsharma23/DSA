package Array;


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.



public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
	}
	
	
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++)
{
for(int j=i+1;j<nums.length;j++)
{
int res=nums[i]+nums[j];
if(res==target)
return new int[]{i,j};
}
}
return new int[]{};
    
}

}
