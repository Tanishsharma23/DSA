package leetcode;
import java.util.*;
public class valid_anagrams {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}

		}
		boolean ans = false;

		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) != 0) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				ans = true;
			} else {
				return false;
			}
		}
		return ans;

		// WITH TWO HASHMAPS
//	           HashMap<Character , Integer>map2 = new HashMap<>();

//	         for(int i = 0 ; i < t.length() ; i++ ){

//	             if(map2.containsKey(t.charAt(i))){
//	                 map2.put(t.charAt(i) , map2.get(t.charAt(i)) + 1);
//	             }
//	             else{
//	                 map2.put(t.charAt(i) , 1);
//	             }

//	         }
//	         if (map.equals(map2)) {
//	         return true;
//	     }
//	     else {
//	         return false;
//	     }
	}

}
