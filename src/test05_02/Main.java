package test05_02;
// 05-02. 괄호문자제거
// 입력 : (A(BC)D)EF(G(H)(IJ)K)LM(N) 
// 출력 : EFLM

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
				while(stack.pop()!='(') {
					;;
				}
			}else {
				stack.push(x);
			}
			
		}
		
		for(int i=0;i<stack.size();i++) {
			answer += stack.get(i);
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

