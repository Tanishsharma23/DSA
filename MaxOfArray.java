package beforeRecursion;

//MAX OF AN ARRAY

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=13;
		arr[3]=4;
		arr[4]=5;
		System.out.println("Array given:");
		MaxOfArray(arr);

	}

	
	
public static void MaxOfArray(int [] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i<=arr.length-1 ; i++) {
			
			System.out.print("[" + arr[i] + "]");
			
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			
			
		}
		System.out.println();
		System.out.println("Max Value present in array is =>" + max);
		
		
	}

}


