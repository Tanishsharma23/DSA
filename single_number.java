package leetcode;

public class single_number {
	public int singleNumber(int[] nums) {

//      HashMap<Integer , Integer>map = new HashMap<>();

//      for(int i = 0 ; i<nums.length ; i++){

//          if(map.containsKey(nums[i])){

//              map.put(nums[i] , map.get(nums[i]) + 1);
//          }
//          else{
//              map.put(nums[i] , 1);
//          }
//      }

//      for(int val : map.keySet()){
//          if(map.get(val) == 1){
//              return val;
//          }
//      }
//      return  -1;
		int res = 0; // a ^ a = 0 , a ^ 0 = a (XOR functionality)
		for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}
		return res;
	}
}
