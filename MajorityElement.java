package leetcode;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public int majorityElement(int[] nums) {
	        
	        HashMap<Integer , Integer> map = new HashMap<>(); //a hashmap named map
	        
	        for(int val : nums){  //elements of nums in map < val ,frequencyOfVal >
	            if(map.containsKey(val)){
	                map.put(val , map.get(val) + 1);
	             
	            }
	           else{ map.put(val , 1);}
	        }
	                    
	        
	        
	        int max = -1;     
	        for(int key : map.keySet() ){ 
	            
	            if(map.get(key) > max){
	                max = map.get(key);
	            }
	          
	            
	        }
	        int F_ans = 0;
	       for(int key : map.keySet()){
	           if(map.get(key) == max){
	                F_ans = key;
	           }
	       }
	        return F_ans;
	    }
	
}
