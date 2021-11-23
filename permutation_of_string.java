
public class permutation_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";

		print_permutation(s, "");

	}

	private static void print_permutation(String ques, String ans) {
		// TODO Auto-generated method stub
			
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			print_permutation(roq, ans + ques.charAt(i));
			
		}

	}
}