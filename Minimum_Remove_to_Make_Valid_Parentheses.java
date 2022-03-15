package leetcode;
import java.util.*;
public class Minimum_Remove_to_Make_Valid_Parentheses {
	public String minRemoveToMakeValid(String s) {

		char[] ch = s.toCharArray();

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < ch.length; i++) { // traverse on chsr array

			if (ch[i] == '(') { // push :: if chsr[i] -> '('

				st.push(i);

			} else if (ch[i] == ')') {

				if (st.size() == 0) { // extra '('

					ch[i] = '$'; // flag the position

				} else { // valid ')' so pop the previous '('
					st.pop();
				}
			}
		}

		while (!st.isEmpty()) { // invalid brackets

			ch[st.pop()] = '$';
		}
		String ans = "";

		for (char c : ch) {

			if (c != '$') { // new resulting string
				ans += c;
			}
		}
		return ans;

//	         int count = 0 ;

//	         char[]ch = s.toCharArray();

//	         for(int i = 0 ;i<s.length() ; i++){

//	             if(ch[i] =='('){

//	                 count++;

//	             }else if(ch[i] == ')'){

//	                 if(count == 0){
//	                     ch[i] = '$';
//	                 }else{
//	                     count--;
//	                 }

//	             }
//	         }
//	           count = 0;
//	             for(int i = s.length() - 1 ;i >= 0 ; i--){

//	             if(ch[i] ==')'){

//	                 count++;

//	             }else if(ch[i] == '('){

//	                 if(count == 0){
//	                     ch[i] = '$';
//	                 }else{
//	                     count--;
//	                 }

//	             }

//	         }

//	         String ans = "";

//	         for(char c : ch){

//	             if(c != '$'){
//	                 ans = ans + c;
//	             }

//	         }

//	         return ans;

//	     } 
	}
}
