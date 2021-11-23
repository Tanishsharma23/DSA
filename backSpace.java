package leetcode;

public class backSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		String first = "hello";
		String second = "hiee";
		System.out.println(backspaceCompare(first ,second));

	}

	public static boolean backspaceCompare(String first, String second) {
		return backspace(first).equals(backspace(second));
	}

	private static String backspace(String letters) {
		for (int i = 0; i < letters.length(); i++) {
			if (letters.charAt(i) == '#') {
				if (i > 0) {
					letters = letters.substring(0, i - 1) + letters.substring(i + 1);
					i = -1;
				} else {
					letters = letters.substring(1);
					i = -1;
				}
			}
		}

		return letters;
	}
}
