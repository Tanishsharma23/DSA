package String;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		List<String>ans =permute1(str);
		
//		List<ArrayList<String>>ans1 = new List<ArrayList<String>();
		System.out.println(ans);
		
		String s = ans.get(0);
		

		
	}
	
	   public static List<String>permute1(String str){ //123
		  
		   
		   if(str.length()==0) {
			   List<String>bc = new ArrayList<String>();
//			   bc.add("[");
			   bc.add("");
			   return bc;
		   }
           
		   char ch = str.charAt(0); //1
		   String ros = str.substring(1); //23
		   
		   
		   
		   List<String>spAns = permute1(ros) ; //[23, 32]
		   
		   List<String>ans = new ArrayList<String>();
		   
		   
		   for(String val : spAns) {  //[23]
			   
			   for(int i =0 ; i <= val.length() ; i++) { //[123 , 213 , 231]
				   
				   ans.add(val.substring(0, i) + ch + val.substring(i));
				   
			   }
			   
		   }
		   
//		 return ans.toArray();
		   
		   return ans;
           
           
           
           
           
           
       }

}
