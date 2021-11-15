package CodingBlocks;

public class BackTracking {
	static int count = 0;

	public static void main(String args[]) {

//		QueenPermutation(new boolean[4], 0, 2, "");
//		QueenCombinationRespectQueen(new boolean[4], 0, 2, "", -1);
//		QueenCombinationBoxRespect(new boolean[4], 0, 2, 0, "");

//		QueenCombination2DrespectBox(new boolean[2][2], 0, 0, 0, 2, "");

//		QueenCombination2DkillrespectBox(new boolean[3][4], 0, 0, 0, 3, "");
//		;
		
	}

	public static void QueenPermutation(boolean[] box, int qpsf, int tq, String ans) {

		// BC
		if (qpsf == tq) {
			System.out.println(++count + " " + ans);
			return;
		}

		// placed
		for (int i = 0; i < box.length; i++) {
			if (box[i] == false) {
				box[i] = true;
				QueenPermutation(box, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				box[i] = false;
			}

		}
	}

	public static void QueenCombinationRespectQueen(boolean[] box, int qpsf, int tq, String ans, int lastindexused) {
		// Baser Case
		if (qpsf == tq) {
			System.out.println(++count + " " + ans);

		}
		// placed
		for (int i = lastindexused + 1; i < box.length; i++) {
			box[i] = true;
			QueenCombinationRespectQueen(box, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);

		}
	}

	public static void QueenCombinationBoxRespect(boolean[] box, int qpsf, int tq, int col, String ans) {

//		BASE CASE
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
//negative bc

		if (col == box.length) {
			return;
		}

		// placed

		box[col] = true;
		QueenCombinationBoxRespect(box, qpsf + 1, tq, col + 1, ans + "b" + col);
		box[col] = false;

//	not placed 
		QueenCombinationBoxRespect(box, qpsf, tq, col + 1, ans);

	}

	public static void QueenCombination2DrespectBox(boolean[][] box, int row, int col, int qpsf, int tq, String ans) {

//base case
		if (qpsf == tq) {

			System.out.println(++count + ans);
			return;
		}

//		mannual iteratrion
		if (col == box[0].length) {
			row++;
			col = 0;
		}

		// negative bc
		if (row == box.length) {
			return;
		}

//		placed

		box[row][col] = true;
		QueenCombination2DrespectBox(box, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
		box[row][col] = false;

//		not placed
		QueenCombination2DrespectBox(box, row, col + 1, qpsf, tq, ans);

	}

	public static void QueenCombination2DkillrespectBox(boolean[][] box, int row, int col, int qpsf, int tq,
			String ans) {
//	base case
		if (qpsf == tq) {
			System.out.println(++count + ans);
			return;
		}
//		manual iteration
		if (col == box[0].length) {
			row++;
			col = 0;
//			return nhinkrna vrna new col or row k lie iske neeche vaali values nhi chlegi ok!!
		}

//	negative base case
		if (row == box.length) {
			return;
		}

//		place
		if (IsItSafeToPlaceAQueen(box, col, row)) {
			box[row][col] = true;
			QueenCombination2DkillrespectBox(box, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
			box[row][col] = false;
		}
//	not place
		QueenCombination2DkillrespectBox(box, row, col + 1, qpsf, tq, ans);
	}

	public static boolean IsItSafeToPlaceAQueen(boolean[][] box, int col, int row) {

//		top
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (box[r][c] == true) {
				return false;
			}
			r--;
		}
//	diagonal left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (box[r][c]) {
				return false;
			}
			r--;
			c--;
		}
// diagonal right	
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < box[0].length) {
			if (box[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
//			left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (box[r][c] == true) {
				return false;
			}
			c--;
		}

		return true;
	}

	public static void NKnightCombination(boolean[][] box, int row, int col, int kpsf, int tk, String ans) {
//		base case
		if (kpsf == tk) {
			System.out.println(++count + ans);
			return;
		}
//			manual iteration
		if (col == box[0].length) {
			row++;
			col = 0;
//				return nhinkrna vrna new col or row k lie iske neeche vaali values nhi chlegi ok!!
		}

//		negative base case
		if (row == box.length) {
			return;
		}

//			place
		if (IsItSafeToPlaceAking(box, col, row)) {
			box[row][col] = true;
			NKnightCombination(box, row, col + 1, kpsf + 1, tk, ans + "{" + row + "-" + col + "}");
			box[row][col] = false;
		}
//		not place
		NKnightCombination(box, row, col + 1, kpsf, tk, ans);
	}

	public static boolean IsItSafeToPlaceAking(boolean[][] box, int col, int row) {
//		changed all row and col ki values in an array
		int [] rowarr = { -1, -2, -2, -1 };
		int [] colarr = { 2, 1, -1, -2 };

		for (int i = 0; i < 4; i++) {
			int r = row + rowarr[i];
			int c = col + colarr[i];

			if (r >= 0 && r < box.length && c >= 0 && c < box[0].length) {

				if (box[r][c] == true) {
					return false;
				}
			}

		}
		return true;
	}

}
