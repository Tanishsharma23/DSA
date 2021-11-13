package String;

import java.security.Key;
import java.util.ArrayList;

public class KeypadCombination {

	public static void main(String[] args) {

//		char s = '1';

		System.out.println(KeyPadCombination("23"));

	}

	public static ArrayList<String> KeyPadCombination(String digits) { // 234

		if (digits.length() == 0) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add(" ");
			return bc;
		}

		char ch = digits.charAt(0);
		String ros = digits.substring(1);

		ArrayList<String> spRes = KeyPadCombination(ros); // [will return arraylist of combinations for 23]

		ArrayList<String> ans = new ArrayList<String>();

		String alpha = getChar(ch);
		for (int i = 0; i < alpha.length(); i++) {

		for (String val : spRes) {

			

				ans.add(alpha.charAt(i) + val);

			}

		}

		return ans;

	}

	public static String getChar(char ch) {

		if (ch == '1')
			return "";
		else if (ch == '2')
			return "abc";
		else if (ch == '3')
			return "def";
		else if (ch == '4')
			return "ghi";
		else if (ch == '5')
			return "jkl";
		else if (ch == '6')
			return "mno";
		else if (ch == '7')
			return "pqrs";
		else if (ch == '8')
			return "tuv";
		else if (ch == '9')
			return "wxyz";
		else if (ch == '0')
			return " ";
		else
			return "";

}
}
