package lesson13;

public class CountDistinctSlices {

	static class Solution {
		public static int solution(int M, int[] A) {
			int num = 0;
			boolean[] index = new boolean[M];
			int dupnum = 0;
			int dupindex = A.length;
			for (int i = 0; i < A.length; i++) {
				int iter = i;

				if (dupnum != 0 && A[i - 1] == dupnum) {
					// the dup num pop
					dupnum = 0;
					dupindex = A.length;
				}
				index = new boolean[M];
				while (iter < dupindex) {

					if (dupnum == 0 && index[A[iter]]) {
						// find the duplicate vallue
						dupnum = A[iter];
						dupindex = iter;
						break;
					}
					index[A[iter]] = true;
					num++;
					iter++;
				}
			}
			return num;
		}

		public static void main(String[] args) {
			int[] A = new int[5];
			A[0] = 3;
			A[1] = 4;
			A[2] = 5;
			A[3] = 5;
			A[4] = 2;
			
			System.out.println(solution(6, A));

		}
	}
}
