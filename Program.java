package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "your", "you", "or", "yo" };

		System.out.print("[");
		for (String ch : words) {
			System.out.print(" \"" + ch + "\", ");
		}
		System.out.println("]");
		System.out.println();
		char[] arr = minimumCharactersForWords(words);
		System.out.print("[");
		for (char ch : arr) {
			System.out.print(" \"" + ch + "\", ");
		}
		System.out.println("]");

	}

	public static char[] minimumCharactersForWords(String[] words) {

		ArrayList<Character> letter = new ArrayList<Character>();

		HashMap<Character, Integer> map = new HashMap<>();
		int count = 1;
		for (int i = 0; i < words.length; i++) {

			String ans = words[i];

			for (int j = 0; j < ans.length(); j++) {
				if (map.containsKey(ans.charAt(j))) {
					int new_val = map.get(ans.charAt(j)) + 1;

					map.put(ans.charAt(j), new_val);

				} else {
					map.put(ans.charAt(j), count);
					letter.add(ans.charAt(j));

				}

			}

		}
		
//		for(char ch : map.keySet()) {
//			System.out.print(ch+"->"+(map.get(ch) + 1) / 2+" ");
//		}
		System.out.println();

		System.out.println(map);

		char[] arr = new char[letter.size()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = letter.get(i);
		}

		return arr;

	}
}
