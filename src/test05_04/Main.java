package test05_04;
// 05-04. ������ ����(postfix)

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
  
public class Main {
	
	public int solution(String input1) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int lt = 0;
		int rt = 0;
		int result = 0;
		
		char func = '+';
		for(int i=0;i<input1.length();i++) {
			if(Character.isDigit(input1.charAt(i))) { // ���ڸ� push
				stack.push(Character.getNumericValue(input1.charAt(i)));		// char -> Integer
			}
			else {	// ���ڰ� �ƴϸ�
				func = input1.charAt(i);
				rt = stack.pop();
				lt = stack.pop();
				
				if(func == '+') {
					result = lt + rt;
				}else if(func == '-') {
					result = lt - rt;
				}else if(func == '*') {
					result = lt * rt;
				}else if(func == '/') {
					result = lt / rt;
				}
				stack.push(result);
			}
		}
		answer = stack.get(0);
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		System.out.print(T.solution(input1));

	}
}

