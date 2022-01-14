package leetcode;

public class replace_element {
	//with greatest at right
	  public int[] replaceElements(int[] arr) {
	        int val = -1;
	     for(int i = arr.length - 1 ; i >=0 ; i-- ){
	         int item = arr[i];
	         arr[i] = val;
	         val = Math.max(val , item); 
	         
	     }   
	        
	        
	        
	        return arr;
	        
	    }

}
