package test01_07;
// 01-07. �Ųٷ� �о ���� ���ڿ� (ex. �丶��)

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = new String();
		int strlen = input1.length();
		input1 = input1.toLowerCase();
		int i = 0;
		boolean flag = true;
		
		// 1��° �������� �����ɷ�..
		// ¦��&Ȧ�� ��ΰ���
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
		
		// 2��° ** StringBuilder�� Ȱ������!!
		answer = "NO"; // answer �ʱ�ȭ
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