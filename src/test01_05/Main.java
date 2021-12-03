package test01_05;
// 01-05. Ư�� ���� ������ (ex. ���ĺ��� ������)

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
			if(Character.isLetter(input1.charAt(i))) { // �����ΰ��
				letterStr += arr[i];
				letterLength++;
			}
		}
		
		// ** StringBuilder�� �� ������ new�� �� ���� ��!!
		letterStr = new StringBuilder(letterStr).reverse().toString();

		for(int i=0;i<input1.length();i++){
			if(Character.isLetter(input1.charAt(i))) { // �����ΰ��
				
				temp[i] = letterStr.charAt(j++);
				
			}else {	// ���� �ƴ� ��� ���� ��ġ �״��
				temp[i] = arr[i];
			}
		}

		// * charArray to String ��ȯ ���� 3���� ���
		answer = new String(temp);		// 1��° ���
		answer = String.valueOf(temp);	// 2��° ���
		StringBuilder sb = new StringBuilder();	// 3��° ���
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