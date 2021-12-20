package leetcode;

import java.util.Arrays;

public class no_of_boats {
	public int numRescueBoats(int[] people, int limit) {
//       int boat_count = 0;
//       int weight_limit = limit;
//       int boat_limit = 2;
//       for(int i = 0 ; i<people.length ; i++){

//           if(people[i] == limit && boat_limit != 0 && weight_limit !=0){
//               // boat_count++;
//               boat_limit = 0;
//                weight_limit = weight_limit - people[i];
//           } if(people[i] < limit && boat_limit != 0 && weight_limit !=0){
//               // boat_count++;
//               weight_limit = weight_limit - people[i];
//               boat_limit--;
//           }

//           if(weight_limit == 0 || boat_limit == 0){
//               weight_limit = limit;
//               boat_limit = 2;
//               boat_count++;

//           }

//       }

//       return boat_count;

		Arrays.sort(people);
		int i = 0;
		int j = people.length - 1;
		int ans = 0;
		while (i <= j) {
			if (people[i] + people[j] <= limit) {
				ans++;
				j--;
				i++;
			} else {
				ans++;
				j--;
			}
		}
		return ans;
	}
}
