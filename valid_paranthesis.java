package leetcode;
import java.util.*;
public class valid_paranthesis {
	public boolean isValid(String s) {
//      t.c. = O(n) :: s.c. = o(n)
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[') {

				st.push(c);

			} else {

				if (st.isEmpty())
					return false;

				if (c == ')' && st.pop() != '(') {

					return false;
				}

				if (c == '}' && st.pop() != '{') {

					return false;
				}

				if (c == ']' && st.pop() != '[') {

					return false;
				}
			}

		}
		return st.isEmpty();

	}
}
