package leetcode;
import java.util.*;
public class smallest_string_with_given_numeric_value {
	public String getSmallestString(int len, int score) { // n -> len AND k -> score
		char[] res = new char[len];
		Arrays.fill(res, 'a'); // smallest word of length -> len

		score = score - len; // rest of the score ?

		int idx = len - 1;

		while (score > 0) {

			if (score - 25 > 0) { // just replace the element by 'z'
				res[idx] = (char) (res[idx] + 25); // a -> z

				score -= 25; // update score
			}

			else {
				res[idx] = (char) (res[idx] + score); // res[idx] = a + (char)score

				break; // lexographically smallest found !!
			}

			idx--; // next element(from right -> left)
		}

		return new String(res);

	}
}
