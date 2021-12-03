package test01_04;
// 01-04. 단어 뒤집기

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(int input1, String[] input2) {
		String[] answer = new String[input1];
		int strLen = 0;
		
		
		
		// #1. solution-1
		for (int i=0;i<input1;i++) {
			strLen = input2[i].length();
			answer[i] = "";
			for(int j=strLen;j>0;j--) {
				answer[i] += input2[i].substring(j-1, j);
			}
		}

		// #2. solution-2
		for (int i=0;i<input1;i++) {
			answer[i] = "";
			answer[i] = new StringBuilder(input2[i]).reverse().toString();
		}

		
		for (int i=0;i<input1;i++) {
			System.out.println(answer[i]);
		}
		return "";
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();

		String[] input2 = new String[input1];
		for(int i=0;i<input1;i++) {
			input2[i] = in.next();
			
		}
//		char input2 = in.next().charAt(0);
	    
		System.out.println(T.solution(input1,input2));
	}
}