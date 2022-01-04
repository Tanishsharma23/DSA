package leetcode;

public class complement_of_base_10_integer {
	public int bitwiseComplement(int n) {

		int i = 1;

		while (i < n) {
			i = i * 2 + 1;
		}

		return i - n;
	}

}
