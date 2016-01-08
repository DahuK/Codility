package src.lesson5;

import java.util.Stack;

public class Nesting {

	static class Solution {
		
		
		public int solution(String S){
			
			Stack stack = new Stack();
			for(int i=0; i< S.length(); i++){
				char c = S.charAt(i);
				switch(c){
					
				case '(': 
					stack.push(c);
					break;
				case ')':
					
					if(stack.isEmpty()||((Character)stack.peek())!='('){
						return 0;
					}
					stack.pop();
					break;
				}
			}
			if(stack.isEmpty())
				return 1;
			return 0;
		}
		
		public static void main(String[] args){
			
		}
	}
}
