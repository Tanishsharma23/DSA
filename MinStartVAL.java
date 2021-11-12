package Array;

public class MinStartVAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]= -13;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(minStartValue(arr));
		
		
	}
	
    public static int minStartValue(int[] nums) {
        
        int sum =0 ; //assume minstartval = 0
       
        int min = 0; //if prefix sum < 0 then update min "0 => min()"
        for(int i = 0 ; i < nums.length ; i++){ //prefix sum
                
             sum += nums[i];
                
              min = Math.min(sum , min);  //min of prefix array
        }
    return 1-min;    
}

}
