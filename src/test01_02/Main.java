package test01_02;
// 01-02. ��ҹ��� ��ȯ

import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = "";
		int cnt = 0;
		int len = input1.length();

		String textStr = input1.toLowerCase();	// �ҹ��ڷ� ��ȯ
		char[] orgChar =  input1.toCharArray();	// �������� char Arr
		char[] smallChar =  textStr.toCharArray();	// �ҹ��� Arr
		
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