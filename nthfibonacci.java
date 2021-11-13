package Math;

public class nthfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		System.out.println(fib( n));

	}
	
    public static int fib(int n) {
    	
		if(n==1 || n==2) return 1;
		
		int one = 1 ;
		int two = 1 ;
		int ans = 0;
		for(int i = 3 ; i<=n ; i++) {
			ans=one+two;
			one=two;
			two=ans;
		}
		
		
		
		
		return ans;
            
            
            
    }

}
