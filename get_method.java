package leetcode;

public class get_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint[
	
		int[] nums1 = { 1, 2, 3, 2, 5, 6 };
		
		for(int i = 0 ; i<nums1.length ; i++) {
			System.out.println(nums1[i]);
		}

		int[]ans = get_method_sort(nums1);
		System.out.println("...");
		
		for(int i = 0 ; i<ans.length ; i++) {
			System.out.println(ans[i]);
		}

	}

	public static int[] get_method_sort(int[] nums1) {

		System.out.println("gggggg");
		
		int gap = nums1.length;
		for (gap = nxtGap(gap); gap > 0; gap = nxtGap(gap)) {
			for (int i = 0; i + gap < nums1.length; i++) {
				if (nums1[i] > nums1[i + gap]) {
					int temp = nums1[i];
					nums1[i] = nums1[i + gap];
					nums1[i + gap] = temp;
				}
			}
		}
		for(int i = 0 ; i<nums1.length ; i++) {
			System.out.println(nums1[i]);
		}
		return nums1;
		
	}
	public static int nxtGap(int gap) {
		 if(gap<0){
	            return 0;
	        }
	        return ((gap/2) + (gap%2)); 
	}

}
