package test01_10;
// 01-10. 문자열의 각 char과 특정 char과의 거리 구하기

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1, String input2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		String answer = "";
		int j = 0;
		char c = input2.charAt(0);
		int min = 0;
		int m = 0;
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		
		for (int i=0;i<input1.length();i++) {
			if(input1.charAt(i)==c)	
				arrInt.add(j++, i);
		}
		
		for (int i=0;i<input1.length();i++) {
			min = Math.abs((arrInt.get(0) - i));
			for(int k = 1;k<arrInt.size();k++) {
				if(min > Math.abs(arrInt.get(k) - i)) {
					min = Math.abs(arrInt.get(k) - i);
				}
			}
			result.add(min);
		}
		
		for(int x : result) {
			answer += String.valueOf(x);
			answer += " ";
		}
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
		
		//for(int i=0;i<input1.length();i++) {
		//	System.out.print(T.solution(input1, input2)[i] + " ");
		//}
		System.out.print(T.solution(input1, input2));

	}
}

