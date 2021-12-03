package test01_11;
// 01-11. 문자열 압축 (문자열 반복시 숫자로 대신 표현)

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		ArrayList<Character> alphabet = new ArrayList<Character>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		String answer = "";
		char flag = input1.charAt(0); // 첫번째 문자 
		int cnt = 1;
		
		alphabet.add(input1.charAt(0));
		
		for(int i=1;i<input1.length();i++) {
			if(flag == input1.charAt(i)) {
				cnt++;
			}else {
				number.add(cnt);
				alphabet.add(input1.charAt(i));
				cnt = 1;
			}
			flag = input1.charAt(i);
		}
		number.add(cnt);
		
		
		for(int i=0;i<alphabet.size();i++) {
			answer += String.valueOf(alphabet.get(i));
			if(number.get(i)!=1) {
				answer += String.valueOf(number.get(i));
			}
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

