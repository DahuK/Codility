package lesson3;

public class PassingCars {

	static class Solution {
		public static int solution(int[] A){
			
			int base = 0;
			int num = 0;
			for(int i=0; i< A.length; i++){
				if(A[i]==0)
					base++;
				else{
					num+=base;
				}
			}
			return num;
		}

		public static void main(String[] args) {

			int[] A = new int[5];
			A[0] = 0;
			A[1] = 1;
			A[2] = 0;
			A[3] = 1;
			A[4] = 1;
			
			System.out.println(solution(A));
		}
	}
}
