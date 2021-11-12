package String;

public class isSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "abcd";
String t = "asbfcid";

System.out.println(isSubsequence(s , t));
	}

	 public static boolean isSubsequence(String s, String t){  
         
         int i = 0, j = 0;
//two pointers
 while (i < s.length() && j < t.length()) {
     if (s.charAt(i) == t.charAt(j)) {
             i++;
             }
     j++;
 }
 
 return i == s.length();
}
	
	
}
