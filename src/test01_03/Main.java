package test01_03;
// 01-03. 문장 속 가장 긴 단어 찾기

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = "";
		int cnt = 0;
		String[] strArr = input1.split(" ");
		int len = strArr.length;		
		int maxLen = 0;
		
		ArrayList<String> str = new ArrayList<String>();
		
		for(int i=0;i<len;i++) {
			
			if(maxLen < strArr[i].length()) {
				maxLen = strArr[i].length();
				answer = strArr[i];
			}
			
		}
		
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();
//		char input2 = in.next().charAt(0);
	    
		System.out.println(T.solution(input1));
	}
}