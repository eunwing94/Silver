package test01_05;
// 01-05. 특정 문자 뒤집기 (ex. 알파벳만 뒤집기)

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = new String();
		int j = 0;
		char[] arr = new char[input1.length()];
		char[] temp = new char[input1.length()];
		String letterStr="";
		int letterLength = 0;
		
		arr = input1.toCharArray();
		char[] x = input1.toCharArray();

		for(int i=0;i<input1.length();i++){
			if(Character.isLetter(input1.charAt(i))) { // 문자인경우
				letterStr += arr[i];
				letterLength++;
			}
		}
		
		// ** StringBuilder를 쓸 때에는 new를 꼭 붙일 것!!
		letterStr = new StringBuilder(letterStr).reverse().toString();

		for(int i=0;i<input1.length();i++){
			if(Character.isLetter(input1.charAt(i))) { // 문자인경우
				
				temp[i] = letterStr.charAt(j++);
				
			}else {	// 문자 아닌 경우 원래 위치 그대로
				temp[i] = arr[i];
			}
		}

		// * charArray to String 변환 위한 3가지 방식
		answer = new String(temp);		// 1번째 방식
		answer = String.valueOf(temp);	// 2번째 방식
		StringBuilder sb = new StringBuilder();	// 3번째 방식
		answer = sb.append(temp).toString();
		
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		
		System.out.println(T.solution(input1));

	}
}