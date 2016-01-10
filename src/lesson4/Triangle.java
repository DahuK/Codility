package lesson4;

import java.util.Vector;

public class Triangle {

	static class Solution {
		public int solution(int[] A) {
			int num = 0;
			Vector<Integer> v = new Vector<Integer>();
			for (int i = 0; i < A.length; i++) {
				v.add(A[i]);
			}

			Integer[] sortVal = quicksort((Integer[])v.toArray());
			
			int index = 0;
			for(int i = 0; i< sortVal.length; i++){
				if(sortVal[i] + sortVal[i+1] > sortVal[i+2])
					num++;
				index++;
			}
			return num;
		}

		private Integer[] quicksort(Integer[] vals) {
			
			if(vals.length > 0){
				_quicksort(vals, 0, vals.length);
			}
			
			return vals;
		}
		
		private int _quicksort(Integer[] vals, int begin, int end){
			
			
			return 0;
		}
	}

	static private void test(int[] t){
		t[1] = 3;
	}
	
	public static void main(String[] args) {
		int i = 4;
		i--;
		System.out.println(i);
		
		String s = "bbb";
		int[] tt ={1,2};
		
		test(tt);
		System.out.print(tt[1]);
	}
}
