package test01_07;
// 01-07. 거꾸로 읽어도 같은 문자열 (ex. 토마토)

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = new String();
		int strlen = input1.length();
		input1 = input1.toLowerCase();
		int i = 0;
		boolean flag = true;
		
		// 1번째 쓸데없이 오래걸려..
		// 짝수&홀수 모두가능
		while(i<strlen/2) {
			if(input1.charAt(i) == input1.charAt(strlen-i-1)) {
				flag = true;
			}else {
				flag = false;
				break;
			}
			i++;
		}

		if(flag==false) {
			answer = "NO";
		}else {
			answer = "YES";
		}
		
		// 2번째 ** StringBuilder를 활용하자!!
		answer = "NO"; // answer 초기화
		String tmp = new StringBuilder(input1).reverse().toString();
		if(tmp.equalsIgnoreCase(input1)) {answer = "YES";}
		
		
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));

	}
}