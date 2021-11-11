package recursion;

public class MaxOfArrayRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [5];
		arr[0]=10;
		arr[1]=200;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int si = 0;
		
		System.out.println(MaxOfArrRECC(arr , si));

	}

	public static int MaxOfArrRECC(int[] arr , int si) {
		// TODO Auto-generated method stub
		if(si == arr.length-1) {
			return arr[si];
		}
		
		int maxOfSP = MaxOfArrRECC(arr , si+1);
		
		int maxOfBP = Math.max(maxOfSP, arr[si]);
		
		
		return maxOfBP;
	}

}
