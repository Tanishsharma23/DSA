package leetcode;

public class counting_bits {
	public int[] countBits(int n) {

		int[] ans = new int[n + 1];

//         for(int i = 0 ; i<ans.length ; i++){

//             String binary_i = Integer.toBinaryString(i);
//             // System.out.print(binary_i+" ");

//             ans[i] = no_of_one(binary_i);

//             // System.out.print(ans[i]);

//         }

//         return ans;

//     }

//     public int no_of_one(String s){
//         int count = 0;
//         for(int i = 0 ; i<s.length() ; i++){

//             if(s.charAt(i) == '1'){
//                 count ++;
//             }

//         }

//         return count;
//     }

		for (int i = 0; i < ans.length; i++) {

			if (i % 2 == 0) {
				ans[i] = ans[i / 2];
			} else {
				ans[i] = ans[i / 2] + 1;
			}

		}
		return ans;

	}
}
