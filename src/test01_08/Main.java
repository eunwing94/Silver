package test01_08;
// 01-08. 거꾸로 읽어도 같은 문자열 (ex. 토마토) + 특정 문자(ex. 알파벳)만 같아야 함

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = "NO";
		
		String orgStr = input1.replaceAll("[^A-Za-z]","");
		String revStr = new StringBuilder(orgStr).reverse().toString(); 
		
		if(orgStr.equalsIgnoreCase(revStr)) {
			answer = "YES";
		}
			
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));

	}
}