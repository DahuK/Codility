package lesson9;

import java.lang.Math.*;

public class MaxSliceSum {

	class Solution {
		public int solution(int[] A) {
			if(A.length == 0)
				return 0;
			int maxSlice = A[0];
			int maxEnding = A[0];
			for(int i=1; i< A.length; i++){
				
				maxEnding = Math.max(maxEnding + A[i], A[i]);
				maxSlice = Math.max(maxSlice, maxEnding);
			}
			return maxSlice;
		}
		
		
	}

	public static void main(String[] args) {
		int i = 4;
		i--;
		System.out.println(i);
		
	}
}
