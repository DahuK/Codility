package lesson9;

public class MaxDoubleSliceSum {

	class Solution {
		
		public int max2(int a, int b, int c){
			if(a < b)
				a = b;
			if(a < c)
				a = c;
			return a;
		}
		
		public int solution(int[] A) {
			
			if(A.length < 4)
				return 0;
			int maxLeft = 0;
			int maxEnding = 0;
			int maxSlice = 0;
			for(int i = 3; i < A.length ; i++){
				maxLeft = Math.max(maxLeft + A[i-2], A[i-2]);
				maxEnding = max2(maxLeft, A[i-1], maxEnding + A[i-1]);
				maxSlice = Math.max(maxSlice, maxEnding);
		 	}
			return maxSlice;
		}
	}
}
