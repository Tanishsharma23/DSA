package leetcode;

public class container_with_most_water {
	
    public int maxArea(int[] height) {
//      int max = 0;   //T.C. -> N*N
     
//      for(int i = 0 ; i<height.length ; i++){
         
//      for(int j = height.length - 1 ; j>=0 ; j--){
         
//          int h = Math.min(height[i] , height[j]);
         
//          int l = j - i;
         
//          int area = h * l;
         
//          max = Math.max(area , max);
//      }
         
//      }
     
//      return max;
     
     int max = 0;  //T.C. -> N
     
     int i = 0;
     int j = height.length - 1;
     
     while(i < j){
         
         int h = Math.min(height[i] , height[j]);
         
			int l = j - i;

			int area = h * l;

			max = Math.max(area, max);

			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}

		}
		return max;

	}

}
