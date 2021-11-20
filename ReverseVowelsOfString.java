package leetcode;

import java.util.ArrayList;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(reverseVowels(s));

	}

	public static String reverseVowels(String s) {

		ArrayList<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		char[] ques = s.toCharArray();

		int left = 0;
		int right = ques.length - 1;

		while (right > left) {

			if (!vowels.contains(ques[left])) {
				left++;
			}
			if (!vowels.contains(ques[right])) {
				right--;
			}

			if (vowels.contains(ques[left]) && vowels.contains(ques[right])) {

				char temp = ques[left];
				ques[left] = ques[right];
				ques[right] = temp;

				left++;
				right--;
			}

			

			

		}
		String ans = String.valueOf(ques);
		return ans;

	}
}
