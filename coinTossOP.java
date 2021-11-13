package recursion;

import java.util.ArrayList;

public class coinTossOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3 ;
		System.out.println(CoinToss(n));
			
	}

	public static ArrayList<String> CoinToss(int n) {
		// TODO Auto-generated method stub
		
		
		
		if(n == 0) { //base case
			ArrayList<String> bc = new ArrayList<String>();
			bc.add(" ");
			return bc;
		}
		
		
		
		ArrayList<String> sp = CoinToss(n-1); //sp 
		
		ArrayList<String> ans = new ArrayList<String>();
		
		for(String val : sp) { //selfwork
			ans.add("H" + val);
			ans.add("T" + val);
		}
		
		
		return ans;
	}

}
