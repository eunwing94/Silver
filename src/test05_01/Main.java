package test05_01;
// 05-01. 올바른 괄호
// 입 : (()(()))(()
// 출 : NO

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
  
public class Main {
	
	public String solution(String input1) {
		String answer = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : input1.toCharArray()) {
			
			if(x == ')') {
				if(!stack.isEmpty()) {
					while(stack.pop()!='(') {
						;
					}					
				}else {
					return "NO";
				}
			}else {
				stack.push(x);
			}
			
		}

		if(stack.isEmpty()) {
			answer = "YES";
		}else {
			answer = "NO";
		}
		
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		System.out.print(T.solution(input1));

	}
}

