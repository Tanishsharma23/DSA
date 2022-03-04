package leetcode;

public class champagon_tower {
	// t.c. = o(n^2)
	// s.c. = o(n^2)

	public double champagneTower(int poured, int query_row, int query_glass) {

		double[][] glass = new double[100 + 1][100 + 1];

		glass[0][0] = poured; // initial step

		for (int i = 0; i <= query_row; i++) {

			for (int j = 0; j <= query_glass; j++) {

				if (glass[i][j] >= 1) { // if over-flow
					double over_flow = (glass[i][j] - 1) / 2.0; // amount of over-flow in next row
					glass[i + 1][j] += over_flow; // on left
					glass[i + 1][j + 1] += over_flow; // on right
					glass[i][j] = 1; // from overflowing
				}

			}

		}

		return glass[query_row][query_glass];

	}
}
