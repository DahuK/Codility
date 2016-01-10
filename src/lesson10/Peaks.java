package lesson10;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

	static class Solution {
		public static int solution(int[] A) {
			int nums = A.length;
			if (nums == 0)
				return 0;

			List<Integer> peaks = new ArrayList<Integer>();
			int lastVal = A[0];
			for (int i = 1; i < nums; i++) {
				if (A[i] < lastVal)
					peaks.add(i - 1);

				lastVal = A[i];
			}
			int res = 1;
			do {
				res++;
				int part = nums / res;
				int boarder = part;
				for (int p : peaks) {

					if (p < boarder)
						continue;
					else {
						boarder = boarder + part;

						if (p >= boarder)
							return res - 1;
					}
				}

			} while (res <= peaks.size());
			return res;
		}
		
		public static void main(String[] args) {
			int[] A = new int[12];
			A[0] = 1;
			A[1] = 2;
			A[2] = 3;
			A[3] = 4;
			A[4] = 3;
			A[5] = 4;
			A[6] = 1;
			A[7] = 2;
			A[8] = 3;
			A[9] = 4;
			A[10] = 6;
			A[11] = 2;
			
			System.out.println(solution(A));
		}
	}
}
