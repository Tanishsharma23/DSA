package leetcode;

public class Arthimetic_Slices {
	 public int numberOfArithmeticSlices(int[] nums) {
         
	        if(nums.length < 3){return 0;}
//	         SOLUTION - 1
	        int count = 0;
	        int left = 0;
	        for(int i = 2 ;i<nums.length ; i++){
	            
	            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i-2]){
	                left++;
	                count +=left; }
	            else{
	                left = 0;
	            }

	        }
	        return count;
	    }
	    
	}         //SOLUTION-2    //T.C. = O(N) :: S.C. = O(N)
//	       int[]dp = new int[5000];
	        
//	         for(int i = 2 ;i<nums.length ; i++){ 
	            
//	             if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i-2]){
	                
//	                 dp[i] = dp[i - 1] + 1;
	                
//	                 count +=dp[i];
	                
//	             }
	            
	            
//	         }
//	         return count;
	        
	      
	        
	    
}
