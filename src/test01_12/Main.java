package test01_12;
// 01-12. ������ -> �ƽ�Ű ���� ��ȯ

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(int input1, String input2) {
		ArrayList<Character> alphabet = new ArrayList<Character>();
		ArrayList<String> code = new ArrayList<String>();
		
		String answer = "";
		
		/* replace / replaceAll�� ���.. �� ������ �־ ����ؾ���. i++ �̰�ó�� ��ɾ�� ��� �Ұ� */
		
		input2 = input2.replace('#', '1'); 
		input2 = input2.replace('*', '0');
		
		int len = input2.length() / input1;
		
		for(int i=0;i<input1;i++) {
			code.add(input2.substring(len * i, len * (i+1)));
		}
		
		//System.out.println(code);
		
		
		for(int i=0;i<input1;i++) {
			System.out.print(Character.valueOf((char) Integer.parseInt(code.get(i),2)));
		}
		
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();
		String input2 = in.next();
		
		System.out.print(T.solution(input1, input2));

	}
}

