package test01_06;
// 01-06. �ߺ� ���� ����

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = new String();
		
		// 1��° ��� (ù��° ���ĺ��� ��)
		char[] arr = input1.toCharArray();
		char flag;
		
		for(int i=0;i<arr.length;i++) {
			flag = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(flag==arr[j]) {
					arr[j] = '_';
				}
			}
		}
		answer = String.valueOf(arr).replaceAll("_", "");
		
		// 2���� -> indexOf �� ���� �ߺ��� char�� index�� ��ġ�� ������..
		answer = ""; // �ʱ�ȭ
		for(int i=0;i<arr.length;i++) {
			System.out.println(input1.charAt(i) + "�� " + input1.indexOf(input1.charAt(i)) + "�� °�� ��ġ��.");
			// �� for ���� i�� input1.indexOf(input1.charAt(i)) �� ��ġ�� ������ ù ����!!
			if(i == input1.indexOf(input1.charAt(i))) {
				answer += input1.charAt(i);
			}
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