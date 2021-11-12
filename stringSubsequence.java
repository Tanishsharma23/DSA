package recursion;

import java.util.ArrayList;
import java.util.List;

public class stringSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s ="e";
		System.out.println(subsequence(s));
		
	}

	public static ArrayList<String>subsequence(String s) {
	
		if(s.length() == 0 ) {
			ArrayList<String> br = new  ArrayList<String>();
			
			br.add("  ");
			
			return br;
		}
		
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		
		ArrayList<String>sp = subsequence(ros); //sp
		
		ArrayList<String> ans = new ArrayList<String>();
		
		for(String var : sp) {
			
			ans.add(var);
			ans.add(ch+var);
			
			
		}
		return ans;
		// TODO Auto-generated method stub
		
	}
	
	

	
}
