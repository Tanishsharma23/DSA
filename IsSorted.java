package recursion;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int si = 0;
		
		System.out.println(IsSorted(arr , si));
		

	}

	public static Boolean IsSorted(int[] arr , int si) {
		// TODO Auto-generated method stub
		
		if(si == arr.length-1) {
			
			return  true;
		}
		
		if(arr[si] > arr[si + 1]) {
			return false;
		}else {
			Boolean ans = IsSorted(arr , si + 1);
					return ans;
		}
		
		
		
		
	}

}
