package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int [] ans = new int[m+n];
	        if(m==0){
	            ans =  nums2;
	        }
	        if(n==0){
	            ans = nums1;
	        }
	        
	        for(int i = 0 ; i<n ; i++){
	            
	            nums1[m + i] = nums2[i];
	            
	        }
	        ans = nums1;
	        Arrays.sort(ans);
	        
	    }
}
