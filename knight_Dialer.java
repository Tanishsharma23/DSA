package leetcode;




public class knight_Dialer {
	
	static int[] rC = {-2, -1, 1, 2, -2, -1, 1, 2};
	static int[] cC = {-1, -2, -2, -1, 1, 2, 2, 1};
	
	    public static int knightDialer(int n) {
	     
	        
	        int ans = 0;
	        
			int[][][] dp = new int[n + 1][4][3];
	        
			for(int i = 0; i <= n; i++) {
				for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 3; k++) {
						dp[i][j][k] = -1;
					}
				}
			}
	        
	        for(int cr = 0; cr < 4; cr++) {
				for(int cc = 0; cc < 3; cc++) {
					ans = (ans +  sol2(n - 1, cr, cc, dp)) % 1000000007; 
				}
			}
	        
	        return ans;
	        
	    }
	    
	    private static int sol2(int n, int cr, int cc, int[][][] dp) {
			// TODO Auto-generated method stub

			if(cr < 0 || cc < 0 || cr >= 4 || cc >= 3 || (cr == 3 && cc == 0) || (cr == 3 && cc == 2)) {
				return 0;
			}
			
			if (n == 0) {
				return 1;
			}

			if (dp[n][cr][cc] != -1) {
				return dp[n][cr][cc];
			}

			int ct = 0;

			for (int i = 0; i < 8; i++) {
				ct = (ct + sol2(n - 1, cr + rC[i], cc + cC[i], dp)) % 1000000007;
			}

			return dp[n][cr][cc] = (ct) % 1000000007;
		}

}
