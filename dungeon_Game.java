package leetcode;

public class dungeon_Game {

	public int calculateMinimumHP(int[][] dungeon) {
		return DungeonGameTD(dungeon, 0, 0, dungeon.length - 1, dungeon[0].length - 1,
				new int[dungeon.length][dungeon[0].length]);
	}

	public static int DungeonGameTD(int[][] arr, int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return arr[cr][cc] <= 0 ? -arr[cr][cc] + 1 : 1;
		}

		if (cr > er || cc > ec) {
			return Integer.MAX_VALUE;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int r = DungeonGameTD(arr, cr, cc + 1, er, ec, strg);
		int d = DungeonGameTD(arr, cr + 1, cc, er, ec, strg);

		int path = Math.min(r, d);

		int amountAlreadyHave = path - arr[cr][cc];

		int ans;

		if (amountAlreadyHave >= 1) {
			ans = amountAlreadyHave;
		} else {
			ans = 1;
		}

		strg[cr][cc] = ans;

		return ans;

	}

}
