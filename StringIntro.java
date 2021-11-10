package beforeRecursion;

public abstract class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		String s2 = str;
		String s3 = new String("Hello");
		
//		for(int i = 0 ; i <str.length()  ;i++) {
//			System.out.println(str.charAt(i)); 
//		}
//		
//		System.out.println(str.substring(1, 2));
		
		
		
		
//		if(str == s3) { //CHECKS ADDRESS ONLY
//			System.out.println("True");
//		}
//		System.out.println(str.equals(s3)); //CHECKS CHAR BY CHAR
//		
		
		
		//fIND ALL SUBSTRING OF PROVIDED STRING
		
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			for(int j = i+1 ; j <= str.length() ; j++) {
				
				System.out.println(str.substring(i,j));
			}
		}
				

	}

}
