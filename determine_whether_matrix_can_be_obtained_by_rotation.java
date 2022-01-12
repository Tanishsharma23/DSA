package leetcode;

import java.util.Arrays;

public class determine_whether_matrix_can_be_obtained_by_rotation {
	 public boolean findRotation(int[][] mat, int[][] target) {
	        
	        int[][] first = new int[mat.length][mat[0].length];
	        int[][] second = new int[mat.length][mat[0].length];
	        int[][] third = new int[mat.length][mat[0].length];
	        
	      for(int col = 0 ; col<mat.length ; col++){
	          for(int row = 0 ; row<mat.length ; row++){
	              first[col][row] = mat[mat.length - 1 - row][col];
	          }
	      }
	         
	              
	           for(int col = 0 ; col<mat.length ; col++){
	          for(int row = 0 ; row<mat.length ; row++){
	              second[col][row] = first[mat.length - 1 - row][col];
	          }
	      }
	           for(int col = 0 ; col<mat.length ; col++){
	          for(int row = 0 ; row<mat.length ; row++){
	              third[col][row] = second[mat.length - 1 - row][col];
	          }
	      }
	        
	     if(Arrays.deepEquals(target , first)||Arrays.deepEquals(target , second)||Arrays.deepEquals(target , third)||Arrays.deepEquals(mat , target))   {
	         return true;
	     }
	        
	        return false;
	    }
}
