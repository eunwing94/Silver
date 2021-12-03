package test01_02;
// 01-02. 대소문자 변환

import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = "";
		int cnt = 0;
		int len = input1.length();

		String textStr = input1.toLowerCase();	// 소문자로 변환
		char[] orgChar =  input1.toCharArray();	// 오리지널 char Arr
		char[] smallChar =  textStr.toCharArray();	// 소문자 Arr
		
		for(int i=0;i<len;i++) {
			if(orgChar[i]==smallChar[i]) {
				answer += Character.toString(orgChar[i]).toUpperCase();
			}else {
				answer += Character.toString(orgChar[i]).toLowerCase();
			}
		}
		

		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
//		char input2 = in.next().charAt(0);
	    
		System.out.println(T.solution(input1));
	}
}