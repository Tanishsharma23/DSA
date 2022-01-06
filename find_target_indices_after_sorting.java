package leetcode;
import java.util.*;
public class find_target_indices_after_sorting {
	 public List<Integer> targetIndices(int[] nums, int target) {
	ArrayList<Integer> list = new ArrayList<>();

	Arrays.sort(nums);

	for	(int i = 0;i<nums.length;i++){
           
           if(nums[i] == target){
               list.add(i);
           }
           
           
       }return list;

}}
