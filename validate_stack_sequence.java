package leetcode;

import java.util.*;

public class validate_stack_sequence {
	public boolean validateStackSequences(int[] pushed, int[] popped) {

		Stack<Integer> st = new Stack<>();
		int j = 0;
		for (int val : pushed) {

			st.push(val); // push something

			while (!st.isEmpty() && popped[j] == st.peek() && j < popped.length) { // pop till peek == popped[j]

				st.pop();
				j++;

			}

		}

		return st.isEmpty();

	}
}
