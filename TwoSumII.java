package leetcode;

public class TwoSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] twoSum(int[] numbers, int target) {
	        
	        int left = 0;
	        int right = numbers.length-1;
	        
	        while(numbers[left] + numbers[right] != target){
	            
	            if(numbers[left] + numbers[right] > target){
	                right --;
	            }else{
	                left ++;
	            }
	            
	        }
	        int[] ans = {left + 1 , right + 1};
	        return ans;
	        
	        
	        
	    }

}
