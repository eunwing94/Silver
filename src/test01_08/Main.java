package test01_08;
// 01-08. �Ųٷ� �о ���� ���ڿ� (ex. �丶��) + Ư�� ����(ex. ���ĺ�)�� ���ƾ� ��

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