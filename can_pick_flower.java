package leetcode;

public class can_pick_flower {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {

			if (n == 0) {
				break;
			}

			// if(flowerbed[i] == 0){
			int next = i + 1 >= flowerbed.length ? 0 : flowerbed[i + 1];
			int prev = i - 1 < 0 ? 0 : flowerbed[i - 1];
			int curr = flowerbed[i];
			if (next == 0 && prev == 0 && curr == 0) {

				flowerbed[i] = 1;
				n--;
			}
			// }

		}
		return n > 0 ? false : true;

	}
}
