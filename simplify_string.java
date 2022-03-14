package leetcode;
import java.util.*;
public class simplify_string {
	public String simplifyPath(String path) {

		Stack<String> s = new Stack<>();
		StringBuilder res = new StringBuilder();
		String[] p = path.split("/");

		for (int i = 0; i < p.length; i++) {

			if (!s.isEmpty() && p[i].equals(".."))
				s.pop(); // ignore this by pop()

			else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
				s.push(p[i]); // when to push in stack ?
		}

		if (s.isEmpty())
			return "/";

		while (!s.isEmpty()) {
			res.insert(0, s.pop()).insert(0, "/"); // resulting answer
		}

		return res.toString();

	}
}
